package observerPattern

interface Observer {
    fun update(temp : Float, humidity : Float, pressure : Float)
}