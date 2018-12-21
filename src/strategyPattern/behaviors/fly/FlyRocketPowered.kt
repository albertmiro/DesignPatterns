package strategyPattern.behaviors.fly

import strategyPattern.behaviors.FlyBehavior

class FlyRocketPowered : FlyBehavior {

    override fun fly() {
        println("I'm flying with a rocket!!")
    }
}