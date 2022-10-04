package minhduc.deviluke.phoneusagetracker.model

import android.graphics.drawable.Drawable

data class App(
    var name: String = "",
    var icon: Drawable? = null,
    var timeUsage: Long = 0L,
    var timeUsageString: String = ""
) {
    fun timeUsageToString() {
        var hoursUsage = ""
        val hours = (timeUsage / (1000 * 60 * 60)).toInt()
        val minutes = (timeUsage % (1000 * 60 * 60)) / (1000 * 60).toInt()
        val seconds = (timeUsage % (1000 * 60 * 60) % (1000 * 60) / 1000).toInt()

        if (hours > 0) {
            hoursUsage = "$hours hours"
        }

        timeUsageString = "$hoursUsage $minutes minutes $seconds"
    }
}
