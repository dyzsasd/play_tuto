package models

import org.joda.time.DateTime

case class ScrapySite(_id: String, name: String, date: DateTime)

object ScrapySite {
  val scrapySites = Set(
    ScrapySite("54be2f400100000100ce0585", "test1", new DateTime(System.currentTimeMillis())),
    ScrapySite("44be2f400100000100ce0585", "test1", new DateTime(System.currentTimeMillis())),
    ScrapySite("34be2f400100000100ce0585", "test1", new DateTime(System.currentTimeMillis()))
  )
}
