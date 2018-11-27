package main

import java.util.concurrent.TimeUnit

import model.Athlete

import scala.concurrent.duration.Duration

object AthleteFactory {

  def build(resultLine: String): Option[Athlete] = {
    var results = resultLine.split(";")

    results.size match {
      case 11 => Option(new Athlete(
        results.apply(0),
        createTimeFromResult(results.apply(1)),
        results.apply(2).toDouble,
        results.apply(3).toDouble,
        results.apply(4).toDouble,
        createTimeFromResult(results.apply(5)),
        createTimeFromResult(results.apply(6)),
        results.apply(7).toDouble,
        results.apply(8).toDouble,
        results.apply(9).toDouble,
        create1500Time(results.apply(10))))
      case _ => Option.empty
    }
  }


  def createTimeFromResult(result: String): Duration = Duration(result.toDouble, TimeUnit.MINUTES)

  def create1500Time(result: String): Duration = {
    val splitedTime = result.split("\\.")
    Duration(splitedTime.apply(0).toInt, TimeUnit.MINUTES)
      .plus(Duration(splitedTime.apply(1).toInt, TimeUnit.SECONDS))
      .plus(Duration(splitedTime.apply(2).toInt, TimeUnit.MILLISECONDS))
  }

}
