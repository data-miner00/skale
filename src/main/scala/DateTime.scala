// Java calendar : ISO-8601
// Instant
// LocalDate - 2010-12-03
// LocalTime - 11:30
// LocalDateTime - 2010-12-03T11:30
// ZonedDateTime

import java.time._

val localDate = LocalDate.now()
val localDate2 = LocalDate.of(2012, 11, 24)

val isAfter = localDate.isAfter(localDate2)

val localtime = LocalTime.now()
val localtime2 = LocalTime.of(14, 44, 10)

val lcdt = LocalDateTime.now()
val ldt2 = LocalDateTime.of(2020, 1, 2, 10, 40)

// Methods
val ldt3 = ldt2.plusYears(10)
val ldt4 = ldt3.minusYears(3)

// ZonedDateTime
val zdt = ZonedDateTime.now()

// Get all zone ids
val zids = ZoneId.getAvailableZoneIds()

val zdt2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Africa/Cairo"))
