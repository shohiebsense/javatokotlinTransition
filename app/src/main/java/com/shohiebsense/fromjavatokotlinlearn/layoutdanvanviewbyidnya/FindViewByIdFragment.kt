package com.shohiebsense.fromjavatokotlinlearn.layoutdanvanviewbyidnya

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.shohiebsense.fromjavatokotlinlearn.R
import kotlinx.android.synthetic.main.fragment_findviewbyid.*

/**
 * Created by shohiebsense on 06/07/17.
 */

class FindViewByIdFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    /*override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v = inflater?.inflate(R.layout.fragment_findviewbyid,container, false)


        return v
    }
*/
    //bisa langsung spt ini
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View?
    = inflater?.inflate(R.layout.fragment_findviewbyid, container, false )

    //manipulasi view di onviewcreated saja.
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        titleTextView.setText("iNI namanya judul")

        storyTextView.setText("namanya berubahh")




    }
}