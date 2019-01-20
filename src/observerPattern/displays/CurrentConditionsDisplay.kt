package observerPattern.displays

import observerPattern.DisplayElement
import observerPattern.Observer
import observerPattern.WeatherData

class CurrentConditionsDisplay(weatherData: WeatherData) : Observer, DisplayElement {

    var temperature: Float = 0.0f
    var humidity: Float = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current conditions: ${temperature}F and $humidity% humidity")
    }

}