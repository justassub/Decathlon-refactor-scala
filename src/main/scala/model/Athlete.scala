package model

import scala.concurrent.duration.Duration

final case class Athlete(fullName: String,
                         m100: Duration,
                         long_jump: Double,
                         shot_put: Double,
                         high_jump: Double,
                         running_400m: Duration,
                         running_110m_hudles: Duration,
                         discus_throw: Double,
                         javelin_throw: Double,
                         pole_vault: Double,
                         running_1500m: Duration) {
}
