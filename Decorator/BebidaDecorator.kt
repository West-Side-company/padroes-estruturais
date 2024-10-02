abstract class BebidaDecorator(private val bebida: Bebida) : Bebida {
    override fun getDescricao() = bebida.getDescricao()
    override fun preco() = bebida.preco()
}
