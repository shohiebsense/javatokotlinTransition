package com.shohiebsense.fromjavatokotlinlearn.fragment

import android.app.Fragment
import android.util.Log
import android.widget.TextView
import com.shohiebsense.fromjavatokotlinlearn.R

/**
 * Created by shohiebsense on 21/06/17.
 */

class SecondFragment : Fragment() {

    lateinit  var testTextView : TextView

    fun init(){
        testTextView.setText("secondfragment")
        Log.e("shohiebsense ","telah sampai ke second fr")
    }

}