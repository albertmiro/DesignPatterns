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

    weatherData.setMeasurements(80f, 65f, 30.4f)
    weatherData.setMeasurements(82f, 70f, 29.2f)
    weatherData.setMeasurements(78f, 90f, 29.2f)
}