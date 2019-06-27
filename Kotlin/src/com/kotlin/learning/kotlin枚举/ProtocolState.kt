package com.kotlin.learning.kotlin枚举

enum class ProtocolState {
    WAITING{
        override fun signal(): ProtocolState {
             return  WAITING
        }
    },
    TALKING{
        override fun signal(): ProtocolState {
            return  TALKING
         }
    }
    ;

    abstract fun signal():ProtocolState
}