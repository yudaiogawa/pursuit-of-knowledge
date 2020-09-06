package com.yudaiogawa.testbox

import java.lang.IllegalArgumentException

class Calc {

    fun times(x: Int, y: Int): Int {
        return x * y
    }

    fun divide(x: Int, y: Int): Double {
        if (y == 0) throw IllegalArgumentException()
        return x / y.toDouble()
    }
}
