package service

object Calculator {
   val fieldEventPointCalculator = (aParam: Double, bParam: Double, cParam: Double, result: Double) =>
    (aParam * Math.pow(result - bParam, cParam)).toInt

   val trackingEventPointCalculator = (aParam: Double, bParam: Double, cParam: Double, result: Double) =>
    (aParam * Math.pow(bParam - result, cParam)).toInt


}
