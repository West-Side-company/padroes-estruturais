fun main() {
    val tomadaDeTresPinos: TomadaDeTresPinos = TomadaDeTresPinosImpl()
    tomadaDeTresPinos.conectarTresPinos()

    val tomadaDeDoisPinos = TomadaDeDoisPinos()

    val adaptador = AdaptadorTomada(tomadaDeDoisPinos)
    adaptador.conectarTresPinos()  // Adaptando para dois pinos
}
