class Chocolate(bebida: Bebida) : BebidaDecorator(bebida) {
    override fun getDescricao() = bebida.getDescricao() + " com Chocolate"
    override fun preco() = bebida.preco() + 1.5
}
