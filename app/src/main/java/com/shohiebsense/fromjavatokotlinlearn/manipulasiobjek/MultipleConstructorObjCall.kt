package com.shohiebsense.fromjavatokotlinlearn.manipulasiobjek

/**
 * Created by shohiebsense on 15/06/17.
 */
import android.util.Log

class MultipleConstructorObjCall {
    lateinit var name: String
    lateinit var age: String
    lateinit var dbh: String

    constructor(){

    }

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, age: String) {
        this.name = name
        this.age = age
    }

    constructor(name: String, age: String, dbh: String) {
        this.name = name
        this.age = age
        this.dbh = dbh
    }

    fun jalankan(){
        var anu = Anu()
        anu.go()
    }

    internal inner class Anu {
        var multipleConstructorObj = MultipleConstructorObjCall("namadoang")
        var multipleConstructorObj1 = MultipleConstructorObjCall("namadoang", "usia")
        var multipleConstructorObj2 = MultipleConstructorObjCall("namadoang", "usia", "dbh")


        fun go(){
            Log.e("shohiebsense ", multipleConstructorObj.name)
        }

    }
}
