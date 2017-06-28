package com.holi.kotlin.extensions

import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.hasElement
import org.junit.Test
import java.io.Serializable
import kotlin.reflect.KClass
import kotlin.reflect.full.superclasses

class SerializableRegexTest {

    @Test
    fun isASerializable() {
        assert.that(Regex::class.superclasses, hasElement<KClass<*>>(Serializable::class))
    }
}