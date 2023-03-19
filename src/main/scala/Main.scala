@main def hello: Unit = 
  println("Hello world!")
  println(msg)

def msg = "I was compiled by Scala 3. :)"

def fn(x: Int): Int = x

// Can provide label to params when calling funcs
def mul(nums: Int*): Int =
  var prod = 1
  for (num <- nums) prod = prod * num
  prod

def transform(f: Int => Int, numbers: Int*) = numbers.map(f)
