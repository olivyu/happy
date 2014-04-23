Recursion, Spring 2014, CSULB

A happy number is a positive integer for which the sum of the squares of the digits eventually leads to 1.

For example, 13 is happy since 1*1 + 3*3 = 10 and 1*1 + 0*0 = 1. 

Here’s the algorithm:
- Start with a positive integer n.
- Dissect it into digits.
- Square the digits and add them up
- You get a new number m.
- If m = 1, n is happy; otherwise set n = m and repeat from step #1.
- If you run into a loop, n is not a happy number.


This is a recursive solution to the problem of "How to find a Happy Number.” If a number is Happy, it will converge to 1. However, if it is not Happy, it will never converge, but will continue to “loop.”


User Interface:
The program will ask the user for a positive integer. The program will then determine if that number is Happy, and report back to the user the results. As the program is determining the results, it will print each number in the sequence. Example: if the user wants to know if 13 is a Happy number, the program might print:

> 13, 10, 1 – Happy

> 13000, 10, 1 – Happy

> 643, 61, 37, 58, 89, 145, 42, 20, 4, 16, 37 – Not Happy


Requirements:

1) Prompt the user for a positive integer. Check the input to make sure it is positive. If the integer is not positive, continue to prompt for a positive number.

2) Program must print out each intermediate number.

3) Report back to the user that the input number is Happy, or Not Happy. Determine a Not Happy number the first time the sequence begins to repeat.

4) Use recursion!
