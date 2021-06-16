package com.mthaler.aopfromscratch

import java.lang.reflect.Method

abstract class AfterHandler : AbstractHandler() {

    abstract fun handleAfter(proxy: Any?, method: Method?, args: Array<Any>?)

    override fun invoke(proxy: Any, method: Method, args: Array<Any>): Any {
        val result = method.invoke(targetObject, *args)
        handleAfter(proxy, method, args)
        return result
    }
}