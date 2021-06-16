# aop-jdk
Aspect-oriented programming example using JDP proxy

Aspect-oriented programming (AOP) is a programming paradigm that aims to increase modularity by allowing the separation of cross-cutting concerns. It does so by adding additional behavior to existing code without modifying the code itself.

In AOP, aspects enable the modularization of concerns such as transaction management, logging or security that cut across multiple types and objects (often termed crosscutting concerns). AOP is one of the features provided by the Spring framework and is used by the Spring framework to e.g. implement support for @Transaction and @Secured.

The code in this repository is a port of the code from [Create your own AOP in Java](https://www.javacodegeeks.com/2015/03/create-your-own-aop-in-java.html) to Kotlin.
