package strategyPattern.ducks

import strategyPattern.behaviors.FlyBehavior
import strategyPattern.behaviors.QuackBehavior

abstract class Duck {

    //Design principle: Composition over inheritance
    // Instead of inheriting their behavior, the ducks get
    // their behavior by being composed with the right behavior object
    lateinit var flyBehavior: FlyBehavior
    lateinit var quackBehavior: QuackBehavior

    abstract fun display()

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun swim() {
        println("All ducks float, even decoys!")
    }

}