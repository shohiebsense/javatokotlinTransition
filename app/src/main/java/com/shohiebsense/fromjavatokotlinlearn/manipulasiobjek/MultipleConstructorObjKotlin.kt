package com.shohiebsense.fromjavatokotlinlearn.manipulasiobjek

/**
 * Created by shohiebsense on 15/06/17.
 */

class MultipleConstructorObjKotlin {
    //berkat anti-null
    var name: String
    var age: String? = ""
    var dbh: String? = ""

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
}
