package strategyPattern.behaviors.quack

import strategyPattern.behaviors.QuackBehavior

class Quack : QuackBehavior {

    override fun quack() {
        println("Quack")
    }

}