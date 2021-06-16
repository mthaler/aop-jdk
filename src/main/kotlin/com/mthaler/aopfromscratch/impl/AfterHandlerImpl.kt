package com.mthaler.aopfromscratch.impl

import com.mthaler.aopfromscratch.AfterHandler
import java.lang.reflect.Method

class AfterHandlerImpl : AfterHandler() {

    override fun handleAfter(proxy: Any, method: Method, args: Array<Any>) {
        //Provide your own cross cutting concern
        println("Handling after actual method execution ........")
    }
}