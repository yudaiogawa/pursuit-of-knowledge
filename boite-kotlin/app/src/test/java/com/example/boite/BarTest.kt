package com.example.boite

import org.junit.Test
import org.junit.Before
import org.junit.Assert.assertThat
import org.hamcrest.CoreMatchers.*

internal class BarTest {

    private lateinit var sut: Bar

    @Test
    fun test() {
        assertThat(Bar(3.0).pie, `is`(3.0)) // 4 constructor
        assertThat(sut.rtn(2), `is`(12.56))
    }

    @Before
    fun setup() {
        this.sut = Bar()
    }
}
