import model.Events
import org.scalatest.{FunSuite, Matchers};

class EventsTest extends FunSuite with Matchers {
  test("Running 100 meters calculates correct") {
    Events.tracking.calculate
  }
}
