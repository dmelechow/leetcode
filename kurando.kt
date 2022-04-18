fun getDistanceInDegrees(hour: Long, minute: Long): Double {    
    abs(hoursToDegrees(hour) - minutesToDegrees(minute))
}

fun hoursToDegrees(hour: Long): Double  = hour * 30
fun minutesToDegrees(minute: Long): Double  = hour * 6
