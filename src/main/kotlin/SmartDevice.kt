import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class SmartDevice protected constructor(val name: String, val category: String) {
    var deviceStatus = "online"

    open val deviceType = "unknown"

//     constructor(name: String, category: String, statusCode: Int) : this(name, category) {
//        deviceStatus = when (statusCode){
//            0 -> "offline"
//            1 -> "online"
//            else -> "unknown"
//        }
//     }


     open fun turnOn() {
         deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }

    open fun printDeviceInfo(){
        println("Device name: $name\n category: $category\n type: $deviceType")
    }


}