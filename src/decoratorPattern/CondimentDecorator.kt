package decoratorPattern

open class CondimentDecorator(private var beverage: Beverage) : Beverage {
    override var description: String = beverage.description
    override fun cost(): Double = beverage.cost()
}