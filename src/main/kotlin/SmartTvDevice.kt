class SmartTvDevice( deviceName: String, deviceCategory: String):
    SmartDevice( name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart Tv"

     private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
 /*    private var speakerVolume = 0
        set(value){
           if (value in 0..100){
                field = value
            }
        }*/


    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)
/*    private var channelNumber = 1
     set(value) {
        if (value in 0..200){
            field = value
        }
    } */

    fun increaseVolume(){
        speakerVolume++
        println("speaker volume increased to $speakerVolume")
    }

    fun nextChannel(){
        channelNumber++
        println("channel number increased to $channelNumber")
    }

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }
}