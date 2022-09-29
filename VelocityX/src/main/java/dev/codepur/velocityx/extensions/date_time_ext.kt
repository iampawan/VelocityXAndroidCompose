package dev.codepur.velocityx.extensions

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.ZoneId
import kotlin.math.absoluteValue

@RequiresApi(Build.VERSION_CODES.O)
fun LocalDateTime.timeAgo(
    clock: LocalDateTime = LocalDateTime.now(),
    enableFromNow: Boolean = false,
    useShortForm: Boolean = false
): String {
    val mIsFromNowEnabled: Boolean = enableFromNow

    val mLanguage: Language = English(useShortForm)

    val mClock: LocalDateTime = clock

    var deltaTime: Long = mClock.atZone(ZoneId.systemDefault()).toInstant()
        .toEpochMilli() - this.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()

    val pfx: String

    val sfx: String

    if (mIsFromNowEnabled && deltaTime < 0) {
        deltaTime = if (this.isBefore(mClock)) deltaTime else deltaTime.absoluteValue
        pfx = mLanguage.prefixFromNow()
        sfx = mLanguage.suffixFromNow()
    } else {
        pfx = mLanguage.prefixAgo()
        sfx = mLanguage.suffixAgo()
    }

    val seconds: Long = deltaTime / 1000
    val minutes: Long = seconds / 60
    val hours: Long = minutes / 60
    val days: Long = hours / 24
    val months: Long = days / 30
    val years: Long = days / 365

    val res: String

    if (seconds < 45) {
        res = mLanguage.lessThanOneMinute(seconds.toInt())
    } else if (seconds < 90) {
        res = mLanguage.aboutAMinute(minutes.toInt())
    } else if (minutes < 45) {
        res = mLanguage.minutes(minutes.toInt())
    } else if (minutes < 90) {
        res = mLanguage.aboutAnHour(minutes.toInt())
    } else if (hours < 24) {
        res = mLanguage.hours(hours.toInt())
    } else if (hours < 48) {
        res = mLanguage.aDay(hours.toInt())
    } else if (days < 30) {
        res = mLanguage.days(days.toInt())
    } else if (days < 60) {
        res = mLanguage.aboutAMonth(days.toInt())
    } else if (days < 365) {
        res = mLanguage.months(months.toInt())
    } else if (years < 2) {
        res = mLanguage.aboutAYear(months.toInt())
    } else {
        res = mLanguage.years(years.toInt())
    }
    return listOf(pfx, res, sfx).joinToString(mLanguage.delimiter())
}