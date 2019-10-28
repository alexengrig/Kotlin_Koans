class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = DateRangeIterator(this)
}

class DateRangeIterator(private val dateRange: DateRange) : Iterator<MyDate> {
    private var current: MyDate = dateRange.start

    override fun hasNext(): Boolean = current <= dateRange.end

    override fun next(): MyDate {
        val next = current;
        current = current.nextDay()
        return next
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
