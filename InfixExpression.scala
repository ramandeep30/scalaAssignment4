object InfixExpression {

def evaluateExp(expression : String){
  val myExp=expression.toCharArray()
  val numStack=new scala.collection.mutable.Stack[Int]
  val operStack=new scala.collection.mutable.Stack[Int]
    
  while(i< myExp.length) {
    if (Character.isDigit(myExp(i)) )
      numStack.push(myExp(i))
    else {
    myExp(i) match {
       case '*' => {
                     val el = numStack.pop()
                     val res = el * myExp(i+1)                              
                   }
       case '/' => {
                     val el = numStack.pop()
                     val res = el / myExp(i+1)
                               
                   }

       case '%' => {
                     val el = numStack.pop()
                     val res = el % myExp(i+1)
                               
                   }

       case '+' => {
                        if(operStack.isEmpty)
                          operStack.push(myExp(i))
			else
           		  {
                              operStack.pop()
                              val value1 = numStack.pop()
                              val value2 = numStack.pop()
                              val res = value1 + value2                              
                          }
		   }
       case '-' => {
                        if(operStack.isEmpty)
                          operStack.push(myExp(i))
			else
           		  {
                              operStack.pop()
                              val value1 = numStack.pop()
                              val value2 = numStack.pop()
                              val res = value1 - value2                              
                          }
		   }
     } 
     numStack.push(res) 
   }
    i++
  }
  val r=numStack.pop()
  
}

 def main(args : Array[String]) {
  String expression="1+2*3"
  val finalResult=evaluateExp(expression)
  println(finalResult)    
 }

}
