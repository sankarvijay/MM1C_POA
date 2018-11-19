package burger.api.bigburger;

import burger.api.general.Size;
import burger.api.general.Meat;
import burger.api.general.Sauce;
import burger.api.general.Burger;
import burger.api.general.Tomato;
import burger.api.general.Cheddar;
import burger.api.general.FoodProduct;
import burger.api.general.DeepFriedOnions;
import burger.api.general.Sauce.SauceType;

import java.util.ArrayList;
import java.util.List;

/**
 * DesignPatterns
 * Copyright (C) 2017 pascalpoizat (@pascalpoizat)
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
// role de creer des burger
public class BigBurgerBuilder implements Burger.BurgerBuilder {

    String name;
    Size size;
    Meat meat;
    List<FoodProduct> products;
    //argumentes obligatoires et autant d'options, le nom, la taille et le type de viande
    BigBurgerBuilder(String name, Size size, Meat.MeatType type) {
        this.name = name;
        this.size = size;
        double weight_for_size = 0;
        switch (size) {
            case SMALL:
                weight_for_size = 100;
            case MEDIUM:
                weight_for_size = 200;
            case BIG:
            default:
                weight_for_size = 400;
        }
        this.meat = new Meat(type, weight_for_size);
        this.products = new ArrayList<>();
    }
    //permet d'eviter trop de constructeurs
    public BigBurgerBuilder with_sauce(SauceType sauce) {
        this.products.add(new Sauce(sauce, 20));
        return this;
    }

    public BigBurgerBuilder with_onions() {
        this.products.add(new DeepFriedOnions(20));
        return this;
    }

    public BigBurgerBuilder with_tomato() {
        this.products.add(new Tomato(10));
        return this;
    }

    public BigBurgerBuilder with_cheese() {
        this.products.add(new Cheddar(30));
        return this;
    }

    public Burger cook() {
        return new BigBurgerBurger(this);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public List<FoodProduct> items() {
        List<FoodProduct> rtr = new ArrayList<>();
        rtr.add(meat);
        rtr.addAll(products);
        return rtr;
    }
}