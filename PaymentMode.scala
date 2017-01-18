object PaymentMode {
  def calculatePay(amount: Double, mode: String)={
   var amt: Double=amount
   mode match {
    case "Freecharge"|"PayTm" => amt+=0.2*amt 
    case "Net Banking" => amt+=5
    case "Card Payment" => amt+=1.5
    case "Cash" => amt
 
   }
  amt                   // Returning calculated amount
}

  def main(args: Array[String]) {
   val finalPayment=calculatePay(2500f,"Net Banking")
   println(s"Your bill is $finalPayment rupees")
 
  }
}

