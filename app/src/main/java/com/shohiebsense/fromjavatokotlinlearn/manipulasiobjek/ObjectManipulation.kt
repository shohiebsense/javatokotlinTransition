package com.shohiebsense.fromjavatokotlinlearn.manipulasiobjek

import android.util.Log
import java.io.File
import java.util.logging.Logger

/**
 * Created by shohiebsense on 15/06/17.
 */

class ObjectManipulation {


    //if(object instance of Car){
    //}
    fun manipulate(a : Car){
        if(a is Car){
            var anu = a as Car

            //atau
            var ana = a
        }
    }


    fun casting(){

    }

    fun callConstructor(){
        //final File file = new File("file.txt");
        val file = File("file.txt")
        var nameOnly = OptionalArgumentUser("nama")
        var nameAndLastName = OptionalArgumentUser("name","lastName")
        var nameAndBirthDate = OptionalArgumentUser("name","lastname","24 jun 95")
        Log.e("shohiebsense ", nameAndBirthDate.birthDate)
        //SETTER
        nameAndBirthDate.birthDate = "1212"
        Log.e("shohiebsense ", nameAndBirthDate.birthDate)
        //manggil utils
        Log.e("shohiebsense ", UtilsExample.getAngkaTujuh().toString() + " " +UtilsExample.Utils.getAngkaDelapan())

        Log.e("shohiebsense ", nameAndLastName.getCombineNameAndLastName())
    }






    //Pojo, include getter and setter
    class Car {
        data class Car(var noPol : String, var age : Int)
    }

    //multipleConstructor

    class Orang{
        //constructor(name : String, parent : Orang) : this(name)
    }

    //public final class User{}
    class User{

    }

    //public class User{}
    open class NormalUser{

    }

    //optionalArguments / Constructors
    open class OptionalArgumentUser(var name : String, var lastName : String = "", var birthDate : String = ""){


        fun getCombineNameAndLastName() : String {
            return name + lastName
        }
    }




}