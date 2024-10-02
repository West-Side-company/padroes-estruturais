class AdaptadorTomada(private val tomadaDeDoisPinos: TomadaDeDoisPinos) : TomadaDeTresPinos {
    override fun conectarTresPinos() {
        tomadaDeDoisPinos.conectarDoisPinos()
    }
}
