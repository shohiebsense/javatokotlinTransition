package com.shohiebsense.fromjavatokotlinlearn.utilutils

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.util.Log
import com.shohiebsense.fromjavatokotlinlearn.FragmentHostActivity

/**
 * Created by shohiebsense on 20/06/17.
 */

class ActivityFactory {
    companion object{
        fun goToFragment(context : Context, fragment : Fragment){
            val intent = Intent(context, FragmentHostActivity::class.java)
          /*  intent.putExtra("FRAGMENT_NAME", fragment.javaClass.name)*/
            Log.e("shohiebsense ","keklikkan");
            context.startActivity(intent)
        }

        fun goToFragmentWithResult(activity : Activity, resultCode : Int){
            val intent = Intent(activity, FragmentHostActivity::class.java)
            ActivityCompat.startActivityForResult(activity, intent, resultCode,null)
        }
    }
}
