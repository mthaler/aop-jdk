package com.mthaler.aopfromscratch

import java.lang.reflect.Method

abstract class BeforeHandler : AbstractHandler() {

    abstract fun handleBefore(proxy: Any, method: Method, args: Array<Any>)

    override fun invoke(proxy: Any, method: Method, args: Array<Any>): Any {
        handleBefore(proxy, method, args)
        return method.invoke(targetObject, *args)
    }
}