package com.shohiebsense.fromjavatokotlinlearn

import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.shohiebsense.fromjavatokotlinlearn.fragment.HomeFragment
import com.shohiebsense.fromjavatokotlinlearn.layoutdanvanviewbyidnya.FindViewByIdFragment
import java.lang.reflect.Constructor
import java.util.*
import kotlinx.android.synthetic.main.activity_fragment_host.*
/**
 * Created by shohiebsense on 20/06/17.
 */

open class FragmentHostActivity : AppCompatActivity() {
    private lateinit var fragment : Fragment

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_host)
        if(savedInstanceState != null){
            return
        }
        init()
    }

    fun init(){
        //fragmentTransaction.replace(R.id.layout_activity_fragment, fr)
       /* var anu :  String = intent.getStringExtra("FRAGMENT_NAME")
        Log.e("shohiebsense unch ", intent.getStringExtra("FRAGMENT_NAME"));*/
        setFragment(FindViewByIdFragment())
    }

    fun setFragment(fragment : Fragment) {
        this.fragment = fragment
        fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit()
    }

    fun setFragmentAddToBackStack(fragment : Fragment){
        this.fragment = fragment
        fragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack("").commit()

    }

    fun replaceFragment(){
        Log.e("shohiebsense ","replacing")
    }

    override fun onActivityReenter(resultCode: Int, data: Intent?) {
        super.onActivityReenter(resultCode, data)
        Log.e("shohiebsense ","activity reenter")
    }
}