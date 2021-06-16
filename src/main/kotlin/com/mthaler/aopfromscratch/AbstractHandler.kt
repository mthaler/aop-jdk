package com.mthaler.aopfromscratch

import java.lang.reflect.InvocationHandler

abstract class AbstractHandler : InvocationHandler {

    var targetObject: Any? = null
}