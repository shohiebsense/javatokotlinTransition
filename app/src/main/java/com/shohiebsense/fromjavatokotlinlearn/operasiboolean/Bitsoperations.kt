package com.shohiebsense.fromjavatokotlinlearn.operasiboolean

/**
 * Created by shohiebsense on 15/06/17.
 */

class Bitsoperations{


    //final int andResult
    fun andResult(a: Boolean, b : Boolean) : Boolean {
        val andResult = a and b
        return andResult
    }

    //or
    fun orResult() : String{
        var a : Boolean = true
        var b : Boolean = false
        var result = a or b
        return " $result "
    }

    //xor
    fun xorResult(a : Boolean, b : Boolean) : Boolean{
        return a xor b
    }








}