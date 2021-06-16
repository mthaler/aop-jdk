package com.mthaler.aopfromscratch

import java.lang.reflect.Proxy

fun getProxy(
    targetObject: Any,
    handlers: List<AbstractHandler>
): Any? {
    var proxyObject: Any? = null
    return if (handlers.size > 0) {
        proxyObject = targetObject
        for (i in handlers.indices) {
            handlers[i].targetObject = proxyObject
            proxyObject = Proxy.newProxyInstance(
                targetObject.javaClass
                    .classLoader, targetObject.javaClass
                    .interfaces, handlers[i]
            )
        }
        proxyObject
    } else {
        targetObject
    }
}