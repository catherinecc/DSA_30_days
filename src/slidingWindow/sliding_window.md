# 🔍 Sliding Window Cheatsheet (Minimal)

| 🧠 Type             | 💡 Use When...                              | 🔍 Core Idea                          |
|---------------------|---------------------------------------------|---------------------------------------|
| **Fixed-size**       | Window size is always `k`                   | Expand right, shrink left after `k`   |
| **Variable-size**    | Window size changes based on a condition    | Shrink left only when condition breaks|
| **Count-based**      | Track frequency or uniqueness in window     | Use HashMap/Set to track window state |
| **Two-pointer**      | Sorted arrays / subsequences problems       | Left and right move independently     |
