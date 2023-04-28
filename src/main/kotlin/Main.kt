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
    println()

    smartHome.turnOffAllDevice()
    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}.")

}