package observerPattern.displays

import observerPattern.DisplayElement
import observerPattern.Observer
import observerPattern.WeatherData

class StatisticsDisplay(weatherData: WeatherData) : Observer, DisplayElement {

    var temperature: Float = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        display()
    }

    override fun display() {
        println("Avg temperature of ${temperature}ºC")
    }

}