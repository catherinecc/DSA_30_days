When to use recursion?
When you can break it down into smaller problems
Return ==> remove from call stack
-> When a function calls itself, it adds a new layer to the call stack. 
Once the function completes, it removes that layer from the stack.

Base case -> ALways the simplest case, the one that can be solved directly without further recursion.

Space complexity - each call takes up space on the call stack. eg: 0(n) for n recursive calls.

Think of the smallest subproblem, find its solution, and then build up from there.

Bottom up approach -> Start with the simplest case and build up to the full problem.

Steps to solve any recursion problem:
1. Identify the sub problem
2. Write the recurrence relation
3. Write the base case
4. Draw the recursion tree
5. In the recursion tree,
   6. Draw the recursion tree on pen and paper
   7. Check the debugger to see how execution happens