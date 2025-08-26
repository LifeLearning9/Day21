# Day21: You are given a string s consisting of words and spaces. A word is defined as a sequence of non-space characters. Return the length of the last word in the string.

**Test Cases**
1. Input: Hello World      Output: 5
2. Input: fly me   to   the moon   Output:4

**Intuition**
1. The last word is the group of characters after the last space in the string.
2. If there are trailing spaces, they don’t matter → use .trim() to remove them.
3. Then, scanning from the end of the trimmed string and counting characters until a space is found gives the last word’s length.
4. This avoids processing the entire string unnecessarily and directly focuses on the last word.

**Algorithm Flow**
1. Read the string s.
2. Remove trailing and leading spaces using .trim().
3. Start scanning from the end of the string.
4.Initialize length = 0.
5. For each character from the end:
6. If it’s not a space → increment length.
7. If a space is found → stop (because we’ve counted the last word).
8. Print length.

**Complexity Analysis**

Time Complexity: O(n).
Space Complexity: O(1)
