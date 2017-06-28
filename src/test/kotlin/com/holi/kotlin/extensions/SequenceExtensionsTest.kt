package com.holi.kotlin.extensions

import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class SequenceExtensionsTest {
    private val sequence = sequenceOf(1, 2, 3)

    @Test
    fun pairwise() {
        val pairs = sequence.pairwise().toList()

        assert.that(pairs, equalTo(listOf(1 to 2, 2 to 3)))
    }

    @Test
    fun pairwiseMapping() {
        val pairs = sequence.pairwise { a, b -> a + b }.toList()

        assert.that(pairs, equalTo(listOf(3, 5)))
    }
}