class SmartLightDevice(deviceName: String, deviceCategory: String):
    SmartDevice( name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

    fun increaseBrightness(){
        brightnessLevel++
        println("brightness level increased to $brightnessLevel ")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }
}