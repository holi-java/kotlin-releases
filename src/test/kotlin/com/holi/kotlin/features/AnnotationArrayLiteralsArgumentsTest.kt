package com.holi.kotlin.features

import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import kotlin.reflect.full.findAnnotation

annotation class View(val names: Array<String>)

@View(names = ["foo", "bar"])
class AnnotationArrayLiteralsArgumentsTest {

    @Test
    fun `array literal arguments`() {
        val it = AnnotationArrayLiteralsArgumentsTest::class.findAnnotation<View>()!!

        assert.that(it.names.toList(), equalTo(listOf("foo", "bar")))
    }

}