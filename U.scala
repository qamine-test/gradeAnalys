package u

import org.joda.time.{DateTime, DateTimeConstants}
import scala.annotation.tailrec

object U {

  @tailrec
  def nextMonday(time: DateTime): DateTime = {
    if (time.getDayOfWeek == DateTimeConstants.MONDAY) {
      time
    } else {
      nextMonday(time.plusDays(1))
    }
  }

}
