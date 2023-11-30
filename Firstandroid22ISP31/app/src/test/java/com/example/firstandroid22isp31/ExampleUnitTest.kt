package com.example.firstandroid22isp31

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private var calculator=Calculator()
    @Test
    fun addition_isCorrect() {
        assertEquals(13.0, calculator.Add(6.0,7.0),0.1)
        assertEquals(16.0, calculator.Add(6.0,10.0),0.1)
        assertEquals(20.0, calculator.Add(11.0,9.0),0.1)
    }
    @Test
    fun subtraction_isCorrect() {
        assertEquals(-1.0, calculator.Sub(6.0,7.0),0.1)
        assertEquals(-4.0, calculator.Sub(6.0,10.0),0.1)
        assertEquals(2.0, calculator.Sub(11.0,9.0),0.1)
    }
}