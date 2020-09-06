package com.yudaiogawa.testbox

import org.junit.Test
import org.assertj.core.api.Assertions.*

internal class CalcTest {

    private val sut = Calc()

    @Test
    fun times() {
        val act: Int = sut.times(2, 3)
        val exp = 6
        assertThat(act).isEqualTo(exp)
    }

    @Test
    fun times02() {
        val act: Int = sut.times(0, 3)
        val exp = 0
        assertThat(act).isEqualTo(exp)
    }

    @Test
    fun divide() {
        val act: Double = sut.divide(6, 2)
        val exp = 3.0
        assertThat(act).isEqualTo(exp)
    }

    @Test
    fun divide02() {
        val act: Double = sut.divide(3, 2)
        val exp = 1.5
        assertThat(act).isEqualTo(exp)
    }

    @Test(expected = IllegalArgumentException::class)
    fun divide03() {
        sut.divide(0, 0)
    }
}
