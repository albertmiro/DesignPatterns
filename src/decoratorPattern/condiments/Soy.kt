package decoratorPattern.condiments

import decoratorPattern.Beverage
import decoratorPattern.CondimentDecorator

class Soy(val beverage: Beverage) : CondimentDecorator(beverage) {
    override var description: String = beverage.description + ", Soy"
    override fun cost(): Double = beverage.cost() + .15
}