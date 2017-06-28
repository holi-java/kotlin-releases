package com.holi.kotlin.features

import com.natpryce.hamkrest.absent
import com.natpryce.hamkrest.assertion.assert
import com.natpryce.hamkrest.present
import org.junit.Test
import kotlin.reflect.KClass
import kotlin.reflect.KFunction

class InlineFunctionDefaultValueFunctionalParametersTest {

    @Test
    fun `inline functional parameters in inline function`() {
        inlined {
            assert.that(lambda(this::`inline functional parameters in inline function`), absent())
        }
    }

    @Test
    fun `doesn't inline functional parameters in common function`() {
        noninline {
            assert.that(lambda(this::`doesn't inline functional parameters in common function`), present())
        }
    }


    private fun lambda(target: KFunction<*>): KClass<*>? {
        return target.javaClass.enclosingClass?.let { parent ->
            try {
                return Class.forName("${parent.name}\$${target.name}\$1").kotlin
            } catch(e: ClassNotFoundException) {
                return null
            }
        }
    }
}


inline fun inlined(@Suppress("UNUSED_PARAMETER") block: () -> Unit = {}) = Unit

fun noninline(@Suppress("UNUSED_PARAMETER") block: () -> Unit = {}) = Unit