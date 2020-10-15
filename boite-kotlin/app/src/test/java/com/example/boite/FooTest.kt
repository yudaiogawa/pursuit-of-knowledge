package com.example.boite

import org.junit.Test
import org.junit.Before
import org.junit.Assert.assertThat
import org.hamcrest.CoreMatchers.*

internal class FooTest {

    private lateinit var sut: Foo

    @Test
    fun test() {
        assertThat(sut.rtn(24), `is`("FIZZ"))
        assertThat(sut.rtn(50), `is`("BUZZ"))
        assertThat(sut.rtn(15), `is`("FIZZBUZZ"))
        assertThat(sut.rtn(1024), `is`("1024"))
    }

    @Before
    fun setup() {
        this.sut = Foo()
    }
}
