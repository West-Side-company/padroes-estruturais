interface Device {
    fun isEnabled(): Boolean
    fun enable()
    fun disable()
    fun setVolume(volume: Int)
    fun getVolume(): Int
}

class TV : Device {
    private var on = false
    private var volume = 30

    override fun isEnabled(): Boolean {
        return on
    }

    override fun enable() {
        on = true
        println("TV ligada")
    }

    override fun disable() {
        on = false
        println("TV desligada")
    }

    override fun setVolume(volume: Int) {
        this.volume = volume
        println("Volume da TV ajustado para $volume")
    }

    override fun getVolume(): Int {
        return volume
    }
}

class Radio : Device {
    private var on = false
    private var volume = 50

    override fun isEnabled(): Boolean {
        return on
    }

    override fun enable() {
        on = true
        println("Rádio ligado")
    }

    override fun disable() {
        on = false
        println("Rádio desligado")
    }

    override fun setVolume(volume: Int) {
        this.volume = volume
        println("Volume do rádio ajustado para $volume")
    }

    override fun getVolume(): Int {
        return volume
    }
}

abstract class RemoteControl(protected val device: Device) {
    fun togglePower() {
        if (device.isEnabled()) {
            device.disable()
        } else {
            device.enable()
        }
    }

    fun volumeUp() {
        val volume = device.getVolume()
        device.setVolume(volume + 10)
    }

    fun volumeDown() {
        val volume = device.getVolume()
        device.setVolume(volume - 10)
    }
}

class AdvancedRemoteControl(device: Device) : RemoteControl(device) {
    fun mute() {
        device.setVolume(0)
        println("Dispositivo no mudo")
    }
}

fun main() {
    val tv = TV()
    val remote = AdvancedRemoteControl(tv)
    
    remote.togglePower()
    remote.volumeUp() 
    remote.mute() 

    val radio = Radio()
    val radioRemote = AdvancedRemoteControl(radio)

    radioRemote.togglePower() 
    radioRemote.volumeDown() 
}