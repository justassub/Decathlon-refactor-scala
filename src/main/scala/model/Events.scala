package model

import service.Calculator


object Events {
  val tracking = "TRACKING";
  val throwing = "THROWING";
  val jumping = "JUMPING";

  val HUNDRED_METERS = Event(25.4347, 18, 1.81, tracking)
  val FOUR_HUNDRED_METERS = Event(1.53775, 82, 1.81, tracking)
  val HURDLE = Event(5.74352, 28.5, 1.92, tracking)
  val KILOMETER_AND_HALF = Event(0.03768, 480, 1.85, tracking)

  val SHOT_PUT = Event(51.39, 1.5, 1.05, throwing)
  val DISCUS_THROW = Event(12.91, 4, 1.1, throwing)
  val JAVELIN_THROW = Event(10.14, 7, 1.08, throwing)

  val HIGH_JUMP = Event(0.8465, 75, 1.42, jumping)
  val LONG_JUMP = Event(0.14354, 220, 1.4, jumping)
  val POLE_VAULT = Event(0.2797, 100, 1.35, jumping)

  case class Event(aValue: Double, bValue: Double, cValue: Double, event: String) {

    def calculatePoints(scores: Double) = {
      event match {
        case Events.tracking => Calculator.trackingEventPointCalculator(aValue, bValue, cValue, scores)
        case Events.jumping => Calculator.fieldEventPointCalculator(aValue, bValue, cValue, scores * 100)
        case Events.throwing => Calculator.fieldEventPointCalculator(aValue, bValue, cValue, scores)
        case _ => 0
      }
    }
  }


}


