package com.example.progressbarkot10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val prg=findViewById<ProgressBar>(R.id.progressBar)
        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            var barStatus=0
            Thread {
                while (barStatus < 100) {
                    barStatus += 1
                    try {
                        Thread.sleep(20)
                        prg.progress = barStatus
                    } catch (exp: InterruptedException) {
                        exp.printStackTrace()
                    }
                }
            }.start()
        }
    }
}