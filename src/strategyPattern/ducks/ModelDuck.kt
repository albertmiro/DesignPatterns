package strategyPattern.ducks

import strategyPattern.behaviors.fly.FlyNoWay
import strategyPattern.behaviors.quack.Quack

class ModelDuck : Duck() {

    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Quack()
    }

    override fun display() {
        println("I'm a model Duck")
    }
}