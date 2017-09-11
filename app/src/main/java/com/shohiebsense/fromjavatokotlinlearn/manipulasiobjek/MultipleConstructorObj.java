package com.shohiebsense.fromjavatokotlinlearn.manipulasiobjek;

/**
 * Created by shohiebsense on 15/06/17.
 */

public class MultipleConstructorObj {
    String name;
    String age;
    String dbh;

    public MultipleConstructorObj(String name) {
        this.name = name;
    }

    public MultipleConstructorObj(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public MultipleConstructorObj(String name, String age, String dbh) {
        this.name = name;
        this.age = age;
        this.dbh = dbh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDbh() {
        return dbh;
    }

    public void setDbh(String dbh) {
        this.dbh = dbh;
    }


    class Anu {
        MultipleConstructorObj multipleConstructorObj = new MultipleConstructorObj("namadoang");
        MultipleConstructorObj multipleConstructorObj1 = new MultipleConstructorObj("namadoang","usia");
        MultipleConstructorObj multipleConstructorObj2 = new MultipleConstructorObj("namadoang","usia","dbh");
    }
}
