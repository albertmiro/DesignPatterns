package decoratorPattern.beverages

import decoratorPattern.Beverage

class Decaf : Beverage {
    override var description = "Decaf Coffee"
    override fun cost() = 1.05
}