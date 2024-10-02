class ServicoReal : Servico {
    init {
        println("Inicializando o serviço real (Operação custosa)...")
    }

    override fun processar() {
        println("Serviço real está processando a requisição.")
    }
}