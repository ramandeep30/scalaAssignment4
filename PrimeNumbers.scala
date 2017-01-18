object PrimeNumbers {
def isPrime(num: Int)={
  var flag=true
  if(num==0 || num==1)
    flag=false
  for(i<-2 to num/2 if num%i==0)
    {
         flag=false
    }
 flag
}

def main(args: Array[String]) {
   val numbers=List(1,2,3,4,5)
   for(i<-0 to numbers.length-1)
     if(isPrime(numbers(i)))
      println(numbers(i))
}


}

