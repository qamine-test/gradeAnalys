package t

import org.joda.time.{DateTime, DateTimeConstants}
import scala.annotation.tailrec

object T {

  @tailrec
  def nextMonday(time: DateTime): DateTime = {
    if (time.getDayOfWeek == DateTimeConstants.MONDAY) {
      time
    } else {
      nextMonday(time.plusDays(1))
    }
  }

}
