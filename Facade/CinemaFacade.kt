class CinemaFacade {
    private val filme = Filme()
    private val reserva = Reserva()
    private val pagamento = Pagamento()

    fun reservarIngressoFilme(filmeId: Int, numeroDeIngressos: Int, pagamentoQuantia: Double): String {
        val detalhesFilme = filme.getDetails(filmeId)
        val reservaMenssagem = reserva.reservarIngresso(filmeId, numeroDeIngressos)
        val pagamentoMenssagem = pagamento.processarPagamento(pagamentoQuantia)
        
        return "$detalhesFilme\n$reservaMenssagem\n$pagamentoMenssagem"
    }
}
