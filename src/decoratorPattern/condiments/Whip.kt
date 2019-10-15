package decoratorPattern.condiments

import decoratorPattern.Beverage
import decoratorPattern.CondimentDecorator

class Whip(val beverage: Beverage) : CondimentDecorator(beverage) {
    override var description: String = beverage.description + ", Whip"
    override fun cost(): Double = beverage.cost() + .10
}