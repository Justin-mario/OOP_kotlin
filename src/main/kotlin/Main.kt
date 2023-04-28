fun main() {

    val smartHome = SmartHome(
        SmartTvDevice("Smart Television", "Entertainment"),
        SmartLightDevice("Google Light", "Utility"))

    smartHome.turnOnTv()
    smartHome.turnOnLight()
    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}")
    println()

    smartHome.increaseTvVolume()
    smartHome.changeTvChannelToNext()
    smartHome.increaseLightBrightness()
    smartHome.printSmartTvInfo()
    smartHome.printSmartLightInfo()
    println()

    smartHome.decreaseTvVolume()
    smartHome.changeTvChannelToPrevious()
    smartHome.decreaseLightBrightness()
    println()



    smartHome.turnOffAllDevice()
    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}.")

}