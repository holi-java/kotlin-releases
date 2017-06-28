package com.holi.kotlin.extensions

import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import java.math.BigInteger
import java.math.BigInteger.*

class BigNumberExtensionsTest {
    private val ten = TEN
    private val two = BigInteger("2")

    @Test
    fun plus() {
        assert.that(ten + two, equalTo(valueOf(12)))
    }

    @Test
    fun minus() {
        assert.that(ten - two, equalTo(valueOf(8)))
    }

    @Test
    fun multiply() {
        assert.that(ten * two, equalTo(valueOf(20)))
    }

    @Test
    fun div() {
        assert.that(ten / two, equalTo(valueOf(5)))
    }

    @Test
    fun `bitwise inverse`() {
        assert.that(ten.not(), equalTo(valueOf(10.inv())));
    }
}