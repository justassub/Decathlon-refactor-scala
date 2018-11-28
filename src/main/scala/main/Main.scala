package main

import java.io.FileNotFoundException

import model.Athlete
import service.AthleteFactory


object Main {

  val files = List("./src/main/resources/input.txt")

  def main(args: Array[String]): Unit = {

    files.map(createAthletesFromFile(_)).flatten.foreach(println(_))

  }

  def createAthletesFromFile(path: String): List[Athlete] = {
    import scala.io.Source
    try {
      val lines = Source.fromFile(path).getLines.toList
      lines.map(AthleteFactory.build(_)).flatten
    } catch {
      case ex: FileNotFoundException => List()
    }

  }
}