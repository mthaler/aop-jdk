package com.mthaler.aopfromscratch

class CalculatorImpl : Calculator {

    override fun calculate(a: Int, b: Int): Int {
        println("**********Actual Method Execution**********");
        return a / b
    }
}