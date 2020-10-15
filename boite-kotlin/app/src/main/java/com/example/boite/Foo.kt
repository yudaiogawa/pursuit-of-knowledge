package com.example.boite

class Foo {

    fun rtn(x: Int): String {
        val fizz = "FIZZ"
        val buzz = "BUZZ"

        return when {
            x % 15 == 0 -> fizz + buzz
            x % 3 == 0 -> fizz
            x % 5 == 0 -> buzz
            else -> x.toString()
        }
    }
}
