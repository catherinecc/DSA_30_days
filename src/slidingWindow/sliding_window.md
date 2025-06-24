# 🔍 Sliding Window Cheatsheet (with Top Interview Problems)

| 🧠 Type             | 💡 Use When...                              | 🔍 Core Idea                          | 🧪 Top Interview Problems |
|---------------------|---------------------------------------------|---------------------------------------|---------------------------|
| **Fixed-size**       | Window size is always `k`                   | Expand right, shrink left after `k`   | - Max Sum of K Elements – LC 643<br>- Max Average Subarray I – LC 643<br>- Max Consecutive Ones – LC 485 |
| **Variable-size**    | Window changes based on a condition         | Shrink left only when condition breaks| - Max Consecutive Ones III – LC 1004<br>- Longest Subarray with Sum ≤ K – LC 209<br>- Longest Substring with At Most K Distinct – LC 340 |
| **Count-based**      | Need frequency or uniqueness tracking       | Use HashMap/Set to maintain state     | - Longest Substring Without Repeating Characters – LC 3<br>- Minimum Window Substring – LC 76<br>- Longest Repeating Character Replacement – LC 424 |
| **Two-pointer**      | Sorted arrays or substring search problems  | Left and right move independently     | - 3Sum – LC 15<br>- Subarray Product Less Than K – LC 713<br>- Remove Duplicates from Sorted Array – LC 26 |


Best time to Buy and sell stock
![image](https://github.com/user-attachments/assets/7d819ee5-eca8-4ac6-96cc-28ad7e09de05)
As shown in image, if ( price[i] < price[i-] ) left=i; This guarantees to maximise the difference.
