package com.example.trot_list

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //1 네비게이션 만들기

        //2 프레그먼트 만들고 네비게이션에 연결
         // 2.1 프레그먼트에서 버튼 누르면 이동하기

        //3 리사이클러뷰
    }
}