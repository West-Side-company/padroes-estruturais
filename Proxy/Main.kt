fun main() {
    val servico: Servico = ServicoProxy()

    println("Chamando o serviço pela primeira vez:")
    servico.processar()

    println("\nChamando o serviço novamente:")
    servico.processar()
}