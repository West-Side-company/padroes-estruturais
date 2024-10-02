interface TomadaDeTresPinos {
    fun conectarTresPinos()
}

class TomadaDeTresPinosImpl : TomadaDeTresPinos {
    override fun conectarTresPinos() {
        println("Conectado na tomada de três pinos.")
    }
}
