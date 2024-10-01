package Flyweight

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val colors = listOf("Vermelho", "Verde", "Azul", "Amarelo", "Preto")

    for (i in 0..10) {
        val circle = ShapeFactory.getCircle(colors[i % colors.size])
        circle.draw(i * 10, i *20)
    }
}