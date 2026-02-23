package com.jabama.screen.host.alguritm

/**
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false



Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/

class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayList<Char>()
        if (s.length <= 1) return false
        for (i in 0..(s.length - 1)) {
            when (s[i]) {
                '{' -> stack.add(s[i])
                '[' -> stack.add(s[i])
                '(' -> stack.add(s[i])
            }

            when {
                s[i] == '}' -> if (stack.removeLastOrNull() != '{') return false else continue
                s[i] == ']' -> if (stack.removeLastOrNull() != '[') return false else continue
                s[i] == ')' -> if (stack.removeLastOrNull() != '(') return false else continue
            }
        }

        return stack.isEmpty()
    }

    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for(i in 0..s.length -1) {
            when(s[i]) {
                '{', '[' , '(' ->   stack.addLast(s[i])

                '}' -> if (stack.removeLastOrNull() != '{') return false else continue
                ')' -> if (stack.removeLastOrNull() != '(') return false else continue
                ']' -> if (stack.removeLastOrNull() != '[') return false else continue
            }
        }

        return stack.isEmpty()
    }
}