class Chantilly(bebida: Bebida) : BebidaDecorator(bebida) {
    override fun getDescricao() = bebida.getDescricao() + " com Chantilly"
    override fun preco() = bebida.preco() + 0.75
}
