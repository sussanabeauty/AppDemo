package org.sussanacode.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


// git Token: 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


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("system out put")

        Toast.makeText(baseContext, "Printing statement when app is launched on the emulator", Toast.LENGTH_LONG).show()
    }
}