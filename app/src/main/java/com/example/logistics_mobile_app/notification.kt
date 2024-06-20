package com.example.logistics_mobile_app


data class Notification(
val id: Int,
val imageResId: Int,
val message: String,
val timestamp: String

)

fun getSampleNotifications(): List<Notification> {
    return listOf(
        Notification(1, R.drawable.noti_01, "Your package has been shipped.", "08:39 AM"),
        Notification(2, R.drawable.note_02, "Your package is out for delivery.", "09:15 AM"),
        Notification(3, R.drawable.noti_03, "Your package has been delivered.", "10:05 AM"),
        Notification(4, R.drawable.noti_04, "Delivery attempted. Please reschedule.", "11:20 AM"),
        Notification(5, R.drawable.noti_05, "Package delayed due to weather.", "12:45 PM"),
        Notification(6, R.drawable.noti_06, "Your package is in transit.", "01:30 PM"),
        Notification(7, R.drawable.noti_07, "Your package has been picked up.", "02:10 PM"),
        Notification(8, R.drawable.noti_08, "Customs clearance required.", "03:05 PM"),
        Notification(9, R.drawable.noti_09, "Your package is at the distribution center.", "04:00 PM"),
        Notification(10, R.drawable.noti_10, "Your package is being processed.", "04:45 PM"),
        Notification(11, R.drawable.noti_05, "Delivery rescheduled to tomorrow.", "05:30 PM"),
        Notification(12, R.drawable.noti_09, "Your package is out for pickup.", "06:15 PM"),
        Notification(13, R.drawable.noti_08, "Package returned to sender.", "07:00 PM"),
        Notification(14, R.drawable.noti_03, "Delivery address update required.", "07:45 PM"),
        Notification(15, R.drawable.note_02, "Your package is ready for pickup.", "08:30 PM")
    )
}
