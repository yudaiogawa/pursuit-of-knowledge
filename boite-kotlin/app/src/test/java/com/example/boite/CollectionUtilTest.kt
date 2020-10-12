package com.example.boite

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.*
import org.junit.Test
import org.junit.Before

internal class CollectionUtilTest {

    private lateinit var sut: CollectionUtil

    @Test
    fun rtnIntArray4elem() {
        val act: IntArray = sut.rtnIntArray4elem(0, 1, 0, 0)
        assertThat(act.asList(), hasSize(4))
    }

    @Before
    fun setup() {
        this.sut = CollectionUtil()
    }
}
