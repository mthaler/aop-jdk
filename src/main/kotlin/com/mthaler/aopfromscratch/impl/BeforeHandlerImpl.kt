package com.mthaler.aopfromscratch.impl

import com.mthaler.aopfromscratch.BeforeHandler
import java.lang.reflect.Method

class BeforeHandlerImpl : BeforeHandler() {

    override fun handleBefore(proxy: Any, method: Method, args: Array<Any>) {
        //Provide your own cross cutting concern
        println("Handling before actual method execution ........")
    }
}