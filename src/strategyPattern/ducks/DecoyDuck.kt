package strategyPattern.ducks

import strategyPattern.behaviors.fly.FlyNoWay
import strategyPattern.behaviors.quack.MuteQuack
import strategyPattern.behaviors.quack.Quack
import strategyPattern.behaviors.quack.Squeak

class DecoyDuck : Duck() {

    init {
        flyBehavior = FlyNoWay()
        quackBehavior = MuteQuack()
    }

    override fun display() {
        println("I'm a Decoy Duck")
    }
}