import model.Events
import org.scalatest.{FunSuite, Matchers}

class FieldEventsTest extends FunSuite with Matchers {
  test("Pole Vault calculates correct") {
    Events.POLE_VAULT.calculatePoints(5) shouldEqual 910
  }
  test("Pole Vault calculates correct decimal") {
    Events.POLE_VAULT.calculatePoints(5.4) shouldEqual 1035
  }
  test("Long Jump calculates correct") {
    Events.LONG_JUMP.calculatePoints(8) shouldEqual 1061
  }
  test("Long Jump calculates correct decimal") {
    Events.LONG_JUMP.calculatePoints(8.4) shouldEqual 1164
  }
  test("High Jump calculates correct") {
    Events.HIGH_JUMP.calculatePoints(1) shouldEqual 81
  }
  test("High Jump calculates correct decimal") {
    Events.HIGH_JUMP.calculatePoints(1.2) shouldEqual 188
  }
  test("Shot Put calculates correct") {
    Events.SHOT_PUT.calculatePoints(5) shouldEqual 191
  }
  test("Shot Put calculates correct decimal") {
    Events.SHOT_PUT.calculatePoints(5.5) shouldEqual 220
  }
  test("Discus throw calculates correct") {
    Events.DISCUS_THROW.calculatePoints(60) shouldEqual 1081
  }
  test("Discus throw calculates correct decimal") {
    Events.DISCUS_THROW.calculatePoints(60.0) shouldEqual 1081
  }
  test("Javelin throw calculates correct ") {
    Events.JAVELIN_THROW.calculatePoints(70.0) shouldEqual 889
  }
  test("Javelin throw calculates correct decimal") {
    Events.JAVELIN_THROW.calculatePoints(70.5) shouldEqual 897
  }
}
