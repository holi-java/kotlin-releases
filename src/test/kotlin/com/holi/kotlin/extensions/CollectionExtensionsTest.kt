package com.holi.kotlin.extensions

import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import java.util.*

class CollectionExtensionsTest {

    @Test
    fun fill() {
        val list = mutableListOf(3, 4, 5)

        list.fill(1)

        assert.that(list, equalTo(listOf(1, 1, 1)))
    }

    @Test
    fun shuffle() {
        val list = MutableList(20) { UUID.randomUUID() };

        val copied = list.toList()

        assert.that(list.apply { shuffle() }, !equalTo(copied))
    }


    @Test
    fun shuffled() {
        val list = List(20) { UUID.randomUUID() };

        val copied = list.toList()

        assert.that(list.shuffled(), !equalTo(copied))
        assert.that(list, equalTo(copied))
    }


    @Test
    fun chunked() {
        val list = listOf(1, 2, 3, 4)

        assert.that(list.chunked(3), equalTo(listOf(listOf(1, 2, 3), listOf(4))))
        assert.that(list.chunked(3) { it.map { it * 2 } }, equalTo(listOf(listOf(2, 4, 6), listOf(8))))
    }


    @Test
    fun windowed() {
        val list = listOf(1, 2, 3, 4)

        assert.that(list.windowed(3, 1), equalTo(listOf(listOf(1, 2, 3), listOf(2, 3, 4), listOf(3, 4), listOf(4))))
        assert.that(list.windowed(3, 2), equalTo(listOf(listOf(1, 2, 3), listOf(3, 4))))
    }
}