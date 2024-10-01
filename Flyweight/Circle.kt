package Flyweight

class Circle(private val color: String): Shape {
    private var radius: Int = 10

    init {
        println("Criando um círculo de cor: $color")
    }

    override fun draw(x: Int, y: Int) {
        println("Desenhando um circulo [$color] na posição ($x, $y) com raio $radius.")
    }
}