package burger.api.general;

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

public class Sauce implements FoodProduct {

    public static enum SauceType implements FoodConstituent {
        BURGER, BARBECUE, BEARNAISE;

        @Override
        public double calories_per_100g() {
            double rtr = 0;
            switch (this) {
                case BARBECUE:
                    rtr = 130;
                    break;
                case BEARNAISE:
                    rtr = 550;
                    break;
                case BURGER:
                default:
                    rtr = 240;
            }
            return rtr;
        }
    }

    private static double BASE_PRICE = 1;

    private SauceType type;
    private double weight;

    public Sauce(SauceType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return BASE_PRICE;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double calories_per_100g() {
        return type.calories_per_100g();
    }

    @Override
    public String toString() {
        return String.format("%s sauce (%.0fg) -- %.2f€",
                type,
                weight(),
                price()
        );
    }
}
