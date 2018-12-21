package strategyPattern.ducks

import strategyPattern.behaviors.fly.FlyWithWings
import strategyPattern.behaviors.quack.Quack

class MallardDuck : Duck() {

    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("I'm a real Mallard Duck")
    }

}