// Define the two input numbers
val num1 = 60
val num2 = 48

// Define a recursive function to compute the greatest common divisor (GCD)
fun gcd(a: Int, b: Int): Int {
// Base case: if one of the numbers is zero, the GCD is the other number
if (b == 0) {
return a
}
// Recursive case: compute the GCD of b and the remainder of a divided by b
return gcd(b, a % b)
}

// Compute the GCD of the two numbers using the recursive function
val gcdResult = gcd(num1, num2)

// Print the result
println("The GCD of $num1 and $num2 is $gcdResult")

/*
Explanation:

We define two input numbers, num1 and num2.
We define a recursive function "gcd" that takes two input integers a and b, and returns their greatest common divisor (GCD).
In the base case, if b is zero, we simply return a as the GCD.
In the recursive case, we compute the GCD of b and the remainder of a divided by b using recursion.
We then call the "gcd" function with num1 and num2 as input to compute their GCD.
Finally, we print out the result.
*/
