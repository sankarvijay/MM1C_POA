package burger.api.general;

import java.util.List;

import burger.api.general.Sauce.SauceType;

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

public abstract class Burger implements FoodProduct {
    
    String name;
    List<FoodProduct> items;
    
    public interface BurgerBuilder {
        // c'est un builder car il y a toutes les methodes optionnel, cook renvoie le burger consitutue a la fin
        String name();
        // items contiendra tous les supp, et le menu avec toutes les calories
        List<FoodProduct> items();
        BurgerBuilder with_cheese();
        BurgerBuilder with_onions();
        BurgerBuilder with_sauce(SauceType sauce);
        BurgerBuilder with_tomato();
        Burger cook();
    }

    protected Burger(BurgerBuilder builder) {
        this.name = builder.name();
        this.items = builder.items();
    }
    
    @Override
    public double calories() {
        // on recupere l'item de chaque ingrdient, et je fais un for sur les calories, reduuire une collection
        return items
                .stream()
                .map(FoodProduct::calories)
                .reduce(0.0, Double::sum);
    }

    @Override
    public double weight() {
        return items
                .stream()
                .map(Product::weight)
                .reduce(0.0, Double::sum);
    }

    @Override
    public double price() {
        return items
                .stream()
                .map(Product::price)
                .reduce(0.0, Double::sum);
    }
    //Calorie au 100g du burger
    @Override
    public double calories_per_100g() {
        return calories() / weight() * 100;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(String.format("*** Menu %s ***\n", name));
        for(FoodProduct item: items) {
            buffer.append(String.format("- %s\n", item));
        }
        buffer.append("--------------------\n");
        buffer.append(String.format("price:         %.2f\n", price()));
        buffer.append("--------------------\n");
        buffer.append(String.format("calories:      %.0f\n", calories()));
        buffer.append(String.format("calories/100g: %.0f\n", calories_per_100g()));
        buffer.append("--------------------\n");
        return buffer.toString();
    }
}
