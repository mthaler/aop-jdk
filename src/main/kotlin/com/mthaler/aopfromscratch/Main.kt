package com.mthaler.aopfromscratch

import com.mthaler.aopfromscratch.impl.AfterHandlerImpl
import com.mthaler.aopfromscratch.impl.BeforeHandlerImpl

fun main(args: Array<String>) {
    val calcImpl = CalculatorImpl()
    val before = BeforeHandlerImpl()
    val after = AfterHandlerImpl()
    val handlers = listOf(before, after)
    val proxy = getProxy(calcImpl, handlers) as Calculator
    val result = proxy.calculate(20, 10)
    println("FInal Result :::$result")
}