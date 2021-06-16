package com.mthaler.aopfromscratch

class CalculatorImpl : Calculator {

    override fun calculate(a: Int, b: Int): Int {
        return a / b
    }
}