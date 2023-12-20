package com.example.android_view.FragmentKotlin_TuHoc

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.android_view.R
import kotlinx.android.synthetic.main.activity_main_kotlin.*   // 

class MainActivityKotlin : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin)



        btn_mainAcitivityKotlin.setOnClickListener {
            Toast.makeText(this@MainActivityKotlin, "Tự học lập trình android", Toast.LENGTH_LONG).show()
        }




    }
}