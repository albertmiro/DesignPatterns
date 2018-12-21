package strategyPattern.ducks

import strategyPattern.behaviors.fly.FlyNoWay
import strategyPattern.behaviors.quack.Quack
import strategyPattern.behaviors.quack.Squeak

class RubberDuck : Duck() {

    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Squeak()
    }

    override fun display() {
        println("I'm a rubber Duck")
    }
}