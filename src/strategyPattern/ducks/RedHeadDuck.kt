package strategyPattern.ducks

import strategyPattern.behaviors.fly.FlyWithWings
import strategyPattern.behaviors.quack.Quack

class RedHeadDuck : Duck() {

    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("I'm a real Red Head Duck")
    }

}