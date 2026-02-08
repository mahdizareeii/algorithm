package com.jabama.screen.host.alguritm

class Solution {
    fun isPalindrome(x: Int): Boolean {
        return x.toString() == x.toString().reversed()
    }

    fun isPalindrome(x: Int): Boolean {
        if(x < 0) return false

        var original = x
        var reversed = 0
        while(original > 0) {
            val lastDigit = original % 10
            reversed = reversed * 10 + lastDigit
            original /= 10
        }

        return reversed == x
    }
}