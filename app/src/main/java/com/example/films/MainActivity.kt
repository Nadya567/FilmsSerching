package com.example.films

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var data = DataClass()

        val button: Button = findViewById(R.id.button_press)
        val textView: TextView = findViewById(R.id.text_view)

        button.setOnClickListener(){
            textView.text = Object.number1.toString() //data.text + data.number
        }

        var c = Class()
        c.ForFun()

    }
}

data class DataClass(var text: String = "Hello ", var number : Int = 5)
{


}

class Class()
{
    var string: String = ""

    fun ForFun()
    {
        for(i in 1..5)
        {
            println(i)
            Thread.sleep(1_000)
        }

        var i = 0
        while(i != 5)
        {
            println(i)
            Thread.sleep(1_000)
            i++
        }
    }

}

object Object
{
    val number1: Int = 5
}