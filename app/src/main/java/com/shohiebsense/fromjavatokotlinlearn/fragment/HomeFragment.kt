package com.shohiebsense.fromjavatokotlinlearn.fragment

import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.shohiebsense.fromjavatokotlinlearn.FragmentHostActivity
import com.shohiebsense.fromjavatokotlinlearn.R
import java.io.FileDescriptor
import java.io.PrintWriter

/**
 * Created by shohiebsense on 20/06/17.
 */

open class HomeFragment : Fragment() {

    lateinit  var testTextView : TextView
    var isRefresh : Boolean = false

    fun init(){
        Log.e("shohiebsenes ", "telah sampailah")

    }


    fun anu(){
        (activity as FragmentHostActivity).setFragmentAddToBackStack(SecondFragment())
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        testTextView.setText("diubah")
    }
}