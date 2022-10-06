package dev.codepur.velocityx.extensions

/// flag for short form e.g(1 min) | long form e.g(1 minute ago)
abstract class Language(val shortForm: Boolean) {
    abstract fun prefixAgo(): String

    abstract fun prefixFromNow(): String

    abstract fun suffixAgo(): String
    abstract fun suffixFromNow(): String

    abstract fun lessThanOneMinute(seconds: Int): String
    abstract fun aboutAMinute(minutes: Int): String
    abstract fun minutes(minutes: Int): String

    abstract fun aboutAnHour(minutes: Int): String
    abstract fun hours(hours: Int): String

    abstract fun aDay(hours: Int): String
    abstract fun days(days: Int): String

    abstract fun aboutAMonth(days: Int): String
    abstract fun months(months: Int): String

    abstract fun aboutAYear(year: Int): String
    abstract fun years(years: Int): String

    abstract fun delimiter(): String
}

/// To use [English] language for timeAgo. More languages can be added in the future.
class English(shortForm: Boolean = false) : Language(shortForm) {

    override fun prefixAgo(): String = ""

    override fun prefixFromNow(): String = ""

    override fun suffixAgo(): String = if (shortForm) "" else "ago"

    override fun suffixFromNow(): String = if (shortForm) "" else "from now"

    override fun lessThanOneMinute(seconds: Int): String = if (shortForm) "now" else "a moment"

    override fun aboutAMinute(minutes: Int): String = if (shortForm) "1 min" else "a minute"

    override fun minutes(minutes: Int): String =
        if (shortForm) "$minutes min" else "$minutes minutes"

    override fun aboutAnHour(minutes: Int): String = if (shortForm) "~1 h" else "about an hour"

    override fun hours(hours: Int): String = if (shortForm) "$hours h" else "$hours hours"

    override fun aDay(hours: Int): String = if (shortForm) "~1 d" else "a day"

    override fun days(days: Int): String = if (shortForm) "$days d" else "$days days"

    override fun aboutAMonth(days: Int): String = if (shortForm) "~1 mo" else "about a month"

    override fun months(months: Int): String = if (shortForm) "$months mo" else "$months months"

    override fun aboutAYear(year: Int): String = if (shortForm) "~1 yr" else "about a year"

    override fun years(years: Int): String = if (shortForm) "$years yr" else "$years years"

    override fun delimiter(): String = " "
}