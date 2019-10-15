package decoratorPattern.beverages

import decoratorPattern.Beverage

class DarkRoast : Beverage {
    override var description = "Dark Roast Coffee"
    override fun cost() = .99
}