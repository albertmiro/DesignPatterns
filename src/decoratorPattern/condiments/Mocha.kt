package decoratorPattern.condiments

import decoratorPattern.Beverage
import decoratorPattern.CondimentDecorator

class Mocha(var beverage: Beverage) : CondimentDecorator(beverage) {
    override var description: String = beverage.description + ", Mocha"
    override fun cost(): Double = beverage.cost() + .20
}