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
// dans ce code il va prendre le default calorie de foodProduct, car il n'y a pas de Override
public class Cheddar implements FoodProduct {

    private double weight;
    //
    private double BASE_PRICE = 4;

    public Cheddar(double weight) {
        this.weight = weight;
    }

    @Override
    public double calories_per_100g() {
        return 400;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double price() {
        return BASE_PRICE * weight / 100;
    }

    @Override
    public String toString() {
        return String.format("cheddar (%.0fg) -- %.2f€",
                weight(),
                price()
        );
    }
}
