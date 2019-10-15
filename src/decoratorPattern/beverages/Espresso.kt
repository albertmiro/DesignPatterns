package decoratorPattern.beverages

import decoratorPattern.Beverage

class Espresso : Beverage {
    override var description = "Espresso"
    override fun cost() = 1.99
}