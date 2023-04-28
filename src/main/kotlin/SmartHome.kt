class SmartHome(
    private val smartTvDevice: SmartTvDevice,
    private val smartLightDevice: SmartLightDevice) {

    var deviceTurnOnCount = 0
        private set


    fun turnOnTv(){
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }


    fun turnOffTv(){
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume(){
        if (smartTvDevice.deviceStatus == "on"){
            smartTvDevice.increaseVolume()
        }

    }

    fun changeTvChannelToNext(){
        if (smartTvDevice.deviceStatus == "on") {
            smartTvDevice.nextChannel()
        }
    }

    fun turnOnLight(){
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight(){
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness(){
        if (smartLightDevice.deviceStatus == "on") {
            smartLightDevice.increaseBrightness()
        }
    }

    fun turnOffAllDevice(){
        turnOffLight()
        turnOffTv()
    }

    fun printSmartTvInfo(){
        smartTvDevice.printDeviceInfo()
    }

    fun printSmartLightInfo(){
        smartLightDevice.printDeviceInfo()
    }

    fun decreaseTvVolume(){
        smartTvDevice.decreaseVolume()
    }

    fun changeTvChannelToPrevious(){
        smartTvDevice.previousChannel()
    }

    fun decreaseLightBrightness(){
        smartLightDevice.decreaseBrightness()
    }

}