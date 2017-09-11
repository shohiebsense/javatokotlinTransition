package com.shohiebsense.fromjavatokotlinlearn.usingstring

/**
 * Created by shohiebsense on 14/06/17.
 */

class UsingString {

    //ga ada properti
    fun plainString() {
        var biasa = "shohiebsense"
    }

    //final String biasa = "shohiebsense"
    fun finalString() {
        val biasa = "shohiebsese";
    }

    //String initiateString;
    //initiateString = null;
    fun initiateString() {
        var othername: String?
        //othername = null
    }

    //if(getLengthText != null){
    //int length = getLengthText.length();
    //}
    fun checkNull(anu : String){
        anu.let {
            var anuLength = anu.length
        }

        //or
        var anuLength = anu?.length

    }


    //String firstName = "shohieb";
    //String lastName = "ahmad";
    //String message = firstName + " " + lastName';;
    fun combineString(firstName : String, lastName : String) : String{
        return "my name is $firstName $lastName"
    }

    //String text = x > 5 ? "x>5" : "x<=5";
    fun checkString(x : Int) : String{
        return if(x > 5) "x > 5" else "x<=5"
    }

    //checkNulledString
    //String message;
    fun checkNulledString(message : String) : Int {
        return message.length
    }





}