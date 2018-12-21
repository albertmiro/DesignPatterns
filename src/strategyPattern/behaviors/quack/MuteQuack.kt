package strategyPattern.behaviors.quack

import strategyPattern.behaviors.QuackBehavior

class MuteQuack : QuackBehavior {

    override fun quack() {
        println("<< SILENCE >>")
    }

}