For any array of size n, number of subsequences = 2ⁿ
Why is the count 2ⁿ?
For each element in the array/string of size n, you have two choices:
Include it OR 
Exclude it

So the total number of combinations is:
2 choices for the first element × 2 choices for the second element × ... × 2 choices for the nth element
2 × 2 × 2 × ... (n times) = 2ⁿ
