import math.Numeric.Implicits.infixNumericOps
import math.Fractional.Implicits.infixFractionalOps
import math.Integral.Implicits.infixIntegralOps
@main def hello = println("Hello, world!")
def double[T](x: Numeric[T]): T = x + x
def square[T](x: T)(implicit xnum: Numeric[T]): T = xnum.times(x, x)
