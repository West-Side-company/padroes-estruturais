class ServicoProxy : Servico {
    private var servicoReal: ServicoReal? = null

    override fun processar() {
        if (servicoReal == null) {
            servicoReal = ServicoReal()
        }
        println("Proxy delegando o processamento ao serviço real.")
        servicoReal?.processar()
    }
}