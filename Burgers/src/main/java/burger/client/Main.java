package burger.client;

import burger.api.general.Burger;
import static burger.api.general.Size.*;
import static burger.api.general.MenuType.*;
import static burger.api.general.Meat.MeatType.*;
import static burger.api.general.Sauce.SauceType.*;

import burger.api.bigburger.BigBurgerRestaurant;

import java.util.Arrays;
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

public class Main {
    public static void main(String args[]) {
        //DSL internet, car on voit une sequence d'etapes
        // A regular burger, elle fait la queue et demain un menu fish, et la derniere renvoie le burger
        Burger alice_dinner = BigBurgerRestaurant
                .queue()
                .order_menu(FISH_MENU)
                .cook();
        // A burger with extra onions and cheese
        Burger bob_dinner = BigBurgerRestaurant
                .queue()
                .order_menu(MEAT_MENU)
                .with_onions()
                .with_cheese()
                .cook();
        // Cholesterol Burger, il va chez bigburger, il fait la queue, il veut un gros menu boeuuf, avc supp onion,cheese,sauce,sauce,sauce,sauce, cheese et il renvoie le burger
        Burger charles_dinner = BigBurgerRestaurant
                .queue()
                .order_personal(BIG, BEEF)
                .with_onions()
                .with_cheese()
                .with_sauce(BARBECUE)
                .with_sauce(BEARNAISE)
                .with_sauce(BURGER)
                .with_cheese()
                .cook();
        //Affiche les burger
        List<Burger> dinners = Arrays.asList(
                alice_dinner,
                bob_dinner,
                charles_dinner
        );
        for (Burger dinner : dinners) {
            System.out.println(dinner);
        }
    }
}