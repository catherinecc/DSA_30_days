# 🔍 Sliding Window Cheatsheet

Sliding Window is a powerful pattern used to solve problems involving subarrays or substrings.

---

## 🧠 Types of Sliding Window

| Pattern                | Description                                                       | Key Actions                                                                                                                                       | When to Use                                                            |
|------------------------|-------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------|
| **Fixed-size window**  | Window has a fixed length `k`                                     | - Expand `right` <br> - Shrink `left` when size exceeds `k` <br> - Track max/min/sum                                                              | Max sum of `k` elements, average of `k`, etc.                          |
| **Variable-size window** | Window grows and shrinks based on a dynamic condition             | - Expand `right` <br> - Shrink `left` while condition is violated <br> - Track result as `right - left + 1`                                       | Longest substring without repeat, max 1-zero flip, sum constraints     |
| **Count-based window** | Tracks frequencies or uniqueness of elements using a map/set      | - Use HashMap or Set <br> - Maintain conditions like “unique” or “at most `k`” <br> - Shrink left as needed                                       | Longest substring with at most `k` distinct chars                      |
| **Two-pointer**        | Optimized variation often used for sorted arrays or subsequences | - One pointer expands <br> - Other catches up to maintain condition                                                                              | Closest sum to target, subsequence match                              |

---

## 💡 Examples by Type

| Problem                                                       | Window Type              | Description                                                |
|---------------------------------------------------------------|--------------------------|------------------------------------------------------------|
| Max sum of `k` elements                                       | Fixed                    | Track sum over window of size `k`                          |
| Longest substring without repeating characters                | Variable + Count-based   | Shrink when repeat occurs using HashMap                    |
| Max consecutive 1s with at most `k` zero flips                | Variable                 | Count zeros, shrink when zeros exceed `k`                 |
| Smallest subarray with sum ≥ `target`                        | Variable                 | Shrink as long as sum ≥ target                             |
| Longest substring with at most `k` distinct characters        | Variable + Count-based   | Use HashMap to track character counts                      |

---

## 🧪 Sliding Window Template (Java)
```java
int left = 0;
for (int right = 0; right < nums.length; right++) {
    // expand the window

    // shrink the window if condition breaks
    while (/* condition */) {
        // shrink from left
        left++;
    }

    // update result
}
