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
//combine ll'aspect finance et le produit
public interface FoodProduct extends FoodConstituent, Product {
    //code de Java 8, ecrire du code dans la constructeur, il faut definir calorie par defaut, c'est ce code sauf si tu met override dans une classe en dessous
    default double calories() {
        return weight() / 100 * calories_per_100g();
    }
}
