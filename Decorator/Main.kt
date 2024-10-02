fun main() {
    val cafeSimples = Cafe()
    println("${cafeSimples.getDescricao()} custa ${cafeSimples.preco()}")

    val cafeComChocolate = Chocolate(cafeSimples)
    println("${cafeComChocolate.getDescricao()} custa ${cafeComChocolate.preco()}")

    val cafeComChocolateEChantilly = Chantilly(cafeComChocolate)
    println("${cafeComChocolateEChantilly.getDescricao()} custa ${cafeComChocolateEChantilly.preco()}")
}
