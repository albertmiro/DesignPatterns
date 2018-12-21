package strategyPattern.behaviors.fly

import strategyPattern.behaviors.FlyBehavior

class FlyNoWay : FlyBehavior {

    override fun fly() {
        println("I can't fly :-(")
    }

}