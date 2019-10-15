package observerPattern.displays

import observerPattern.DisplayElement
import observerPattern.Observer
import observerPattern.WeatherData

class ForecastDisplay(weatherData: WeatherData) : Observer, DisplayElement {

    var pressure: Float = 0.0f
    lateinit var forecast: String

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.pressure = pressure
        forecast = if (pressure < 1000) "Rain is coming!" else "Sunny day :-)"
        display()
    }

    override fun display() {
        println("The forecast is: $forecast")
    }

}