package strategyPattern.behaviors.quack

import strategyPattern.behaviors.QuackBehavior

class Squeak : QuackBehavior {

    override fun quack() {
        println("Squeak")
    }

}