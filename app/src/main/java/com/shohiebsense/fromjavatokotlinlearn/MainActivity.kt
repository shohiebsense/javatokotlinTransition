package com.shohiebsense.fromjavatokotlinlearn

import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.shohiebsense.fromjavatokotlinlearn.manipulasiobjek.MultipleConstructorObjCall
import com.shohiebsense.fromjavatokotlinlearn.manipulasiobjek.ObjectManipulation
import com.shohiebsense.fromjavatokotlinlearn.utilutils.ActivityFactory
import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.view.View
import com.shohiebsense.fromjavatokotlinlearn.fragment.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        helloWorldTextView.setText("RRRRRR")
        howAreYouTextView.setOnClickListener {
            startActivity(Intent(this,FragmentHostActivity::class.java))
        }

        init()
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }
    fun init(){
        var manipulation = ObjectManipulation()
        manipulation.callConstructor();

        var anuu = MultipleConstructorObjCall("name")
        anuu.jalankan()
    }

    fun imageViewClicked(){
        ActivityFactory.goToFragment(this, HomeFragment())
    }


}
