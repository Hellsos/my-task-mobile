package cloud.my_task.mytaskandroid.database

import android.arch.persistence.room.TypeConverter
import java.sql.Date

class DateTypeConverter {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return if (value == null) null else Date(value)
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }
}