package com.shohiebsense.fromjavatokotlinlearn.loop

/**
 * Created by shohiebsense on 15/06/17.
 */

class Loop{

    lateinit var anu : ArrayList<String>;



    //switch case
    fun switchCase(){
        var score = 9;
        var grade = when(score){
            9,10 -> "Mantap"
            in 1..5 -> "biasa"
            in 6..8 -> "boleh"
            else -> "fail"
        }
    }

    //for loop
    fun forLoop(){
        //for(int i = 0; i <= 10; i++){}
        for(i in 1 .. 10){}

        //for(int i = 0; i < 10; i++){}
        for(i in 0 until 10){}

        //for(int i = 10; i > 0; i--){}
        for(i in 10 .. 1){}

        //foreach
        for(setiapAnu in anu){

        }

        //atau
        anu.forEach {  }





    }
}