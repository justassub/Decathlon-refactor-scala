import model.Events
import org.scalatest.{FunSuite, Matchers};

class EventsTest extends FunSuite with Matchers {
  test("Running 100 meters calculates correct") {
    Events.HUNDRED_METERS.calculatePoints(11) shouldEqual 861
  }
  test("Running 100 meters calculates correct decimal") {
    Events.HUNDRED_METERS.calculatePoints(10.04) shouldEqual 1086
  }
  test("Running 400 meters calculates correct ") {
    Events.FOUR_HUNDRED_METERS.calculatePoints(30) shouldEqual 1962
  }
  test("Running 400 meters calculates correct decimal") {
    Events.FOUR_HUNDRED_METERS.calculatePoints(30.04) shouldEqual 1959
  }
  test("Hurdle calculates correct ") {
    Events.HURDLE.calculatePoints(15) shouldEqual 850
  }
  test("Hurdling calculates correct decimal") {
    Events.HURDLE.calculatePoints(15.04) shouldEqual 845
  }
  test("Running 1500m  calculates correct ") {
    Events.KILOMETER_AND_HALF.calculatePoints(100) shouldEqual 2232
  }
  test("Running 1500m calculates correct decimal") {
    Events.KILOMETER_AND_HALF.calculatePoints(100.05) shouldEqual 2231
  }
}
