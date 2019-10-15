package decoratorPattern.beverages

import decoratorPattern.Beverage

class HouseBlend : Beverage {
    override var description = "House Blend Coffee"
    override fun cost() = 0.89
}