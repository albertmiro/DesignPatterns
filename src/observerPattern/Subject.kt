package observerPattern

interface Subject {
    fun registerObserver(o : Observer)
    fun removeObserver(o : Observer)
    fun notifyObservers()
}