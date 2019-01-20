package observerPattern

class WeatherData : Subject {

    var observers: ArrayList<Observer> = ArrayList()
    var temperature: Float = 0.0f
    var humidity: Float = 0.0f
    var pressure: Float = 0.0f

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        val i = observers.indexOf(o)
        if (i >= 0) observers.remove(o)
    }

    override fun notifyObservers() {
        observers.map { it.update(temperature, humidity, pressure) }
    }

    private fun measurementChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature : Float, humidity : Float, pressure : Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementChanged()
    }


}