package IT

import main.Main
import org.scalatest.{FunSuite, Matchers}

class AthleteBuilderTest extends FunSuite with Matchers {
  test("reading testing file should create only 3 Athletes") {
    Main.createAthletesFromFile("./src/test/resources/testInput.txt") should have size 3
  }
  test("reading files that do not exist should not destroy app") {
    Main.createAthletesFromFile("./src/test/resources/badInput.txt") should have size 0
  }

}
