package decoratorPattern

import decoratorPattern.beverages.DarkRoast
import decoratorPattern.beverages.Espresso
import decoratorPattern.beverages.HouseBlend
import decoratorPattern.condiments.Mocha
import decoratorPattern.condiments.Soy
import decoratorPattern.condiments.Whip

fun main() {
    val beverage = Espresso()
    println(beverage.description + " $" + beverage.cost())

    val beverage2 = Whip(Mocha(Mocha(DarkRoast())))
    println(beverage2.description + " $" + beverage2.cost())

    val beverage3 = Whip(Mocha(Soy(HouseBlend())))
    println(beverage3.description + " $" + beverage3.cost())
}