package observerPattern

import observerPattern.displays.CurrentConditionsDisplay
import observerPattern.displays.ForecastDisplay
import observerPattern.displays.HeatIndexDisplay
import observerPattern.displays.StatisticsDisplay

fun main(args: Array<String>) {

    val weatherData = WeatherData()

    CurrentConditionsDisplay(weatherData)
    StatisticsDisplay(weatherData)
    ForecastDisplay(weatherData)
    HeatIndexDisplay(weatherData)

    weatherData.setMeasurements(80f, 65f, 300.4f)
    weatherData.setMeasurements(82f, 70f, 290.2f)
    weatherData.setMeasurements(78f, 20f, 1200.2f)
}