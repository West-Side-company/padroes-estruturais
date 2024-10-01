package Flyweight

object ShapeFactory {
    private val circleMap = mutableMapOf<String, Shape>()

    fun getCircle(color: String): Shape {
        return circleMap.getOrPut(color){
            Circle(color)
        }
    }
}