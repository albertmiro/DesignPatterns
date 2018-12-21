package strategyPattern

import strategyPattern.behaviors.fly.FlyRocketPowered
import strategyPattern.ducks.*

fun main(args: Array<String>) {

    testMallardDuck()

    testModelDuck()

    testDecoyDuck()

    testRedHeadDuck()

    testRubberDuck()
}

private fun testMallardDuck() {
    println("== Test Mallard Duck ==")
    val mallardDuck = MallardDuck()
    mallardDuck.performQuack()
    mallardDuck.performFly()
}

private fun testModelDuck() {
    println("== Test Model Duck ==")
    val model = ModelDuck()
    model.performFly()
    model.flyBehavior = FlyRocketPowered()
    model.performFly()
}

private fun testDecoyDuck() {
    println("== Test Decoy Duck ==")
    val decoyDuck = DecoyDuck()
    decoyDuck.performQuack()
    decoyDuck.performFly()
}

private fun testRedHeadDuck() {
    println("== Test Red Head Duck ==")
    val redHeadDuck = RedHeadDuck()
    redHeadDuck.performQuack()
    redHeadDuck.performFly()
}

private fun testRubberDuck() {
    println("== Test Rubber Duck ==")
    val rubberDuck = RubberDuck()
    rubberDuck.performQuack()
    rubberDuck.performFly()
}
