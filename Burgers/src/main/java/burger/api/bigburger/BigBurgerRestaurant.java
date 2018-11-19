package burger.api.bigburger;

import burger.api.general.BurgerRestaurant;
import burger.api.general.Size;
import burger.api.general.Meat.MeatType;
import burger.api.general.MenuType;
import burger.api.general.Burger.BurgerBuilder;

import static burger.api.general.Size.*;
import static burger.api.general.Meat.MeatType.*;
import static burger.api.general.Sauce.SauceType.*;

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
//FactorySIngleton role de creer des builder
public class BigBurgerRestaurant implements BurgerRestaurant {

    private static BigBurgerRestaurant instance = null;

    private BigBurgerRestaurant() {
    }
    //Singleton
    public static BurgerRestaurant queue() {
        if (instance == null) {
            instance = new BigBurgerRestaurant();
        }
        return instance;
    }

    //ORDER Menu creer le builder, avec la factory on creer le builder
    @Override
    public BurgerBuilder order_menu(MenuType menu) {
        BurgerBuilder b = null;
        switch (menu) {
            case MEAT_MENU:
                b = new BigBurgerBuilder("BigMarcel", BIG, BEEF)
                        .with_sauce(BURGER)
                        .with_onions()
                        .with_tomato();
                break;

            case FISH_MENU:
                b = new BigBurgerBuilder("FiletO'Poisson", MEDIUM, WHITEFISH)
                        .with_sauce(BEARNAISE);
                break;
            case CHEESE_MENU:
            default:
                b = new BigBurgerBuilder("MaxeeCheesee",MEDIUM, BEEF)
                        .with_cheese()
                        .with_onions();
        }
        return b;
    }
    @Override
    public BurgerBuilder order_personal(Size size, MeatType type) {
        return new BigBurgerBuilder("Own style", size, type);
    }

}
