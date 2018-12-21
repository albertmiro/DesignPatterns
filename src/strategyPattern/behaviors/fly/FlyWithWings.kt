package strategyPattern.behaviors.fly

import strategyPattern.behaviors.FlyBehavior

class FlyWithWings : FlyBehavior {

    override fun fly() {
        println("I'm flying!")
    }

}