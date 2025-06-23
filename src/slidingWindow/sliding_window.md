# 🔍 Sliding Window Cheatsheet (Minimal + Examples)

| 🧠 Type             | 💡 Use When...                              | 🔍 Core Idea                          | 🧪 Example Problems |
|---------------------|---------------------------------------------|---------------------------------------|---------------------|
| **Fixed-size**       | Window size is always `k`                   | Expand right, shrink left after `k`   | - Max sum of k elements<br>- LeetCode 643 |
| **Variable-size**    | Window changes based on a condition         | Shrink left only when condition breaks| - Longest subarray with sum ≤ k<br>- Max consecutive 1s with k flips (LC 1004) |
| **Count-based**      | Track frequency/uniqueness in window        | Use HashMap/Set to maintain state     | - Longest substring w/o repeats (LC 3)<br>- At most K distinct chars (LC 340) |
| **Two-pointer**      | Subarrays/subsequences in sorted arrays     | Left and right move independently     | - 2-sum II (sorted)<br>- Minimum window substring (LC 76) |
