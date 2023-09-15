package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.annotation.SuppressLint
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var backUp:String = "0"

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Numbers
        val b0: Button = findViewById(R.id.b0)
        val b1: Button = findViewById(R.id.b1)
        val b2: Button = findViewById(R.id.b2)
        val b3: Button = findViewById(R.id.b3)
        val b4: Button = findViewById(R.id.b4)
        val b5: Button = findViewById(R.id.b5)
        val b6: Button = findViewById(R.id.b6)
        val b7: Button = findViewById(R.id.b7)
        val b8: Button = findViewById(R.id.b8)
        val b9: Button = findViewById(R.id.b9)
        //Special actions
        val bAC: Button = findViewById(R.id.bAC)
        val bSpecial: Button = findViewById(R.id.bSpecial)
        val bResult: Button = findViewById(R.id.bResult)
        val bComma: Button = findViewById(R.id.bComma)
        //Operators
        val bSplit: Button = findViewById(R.id.bSplit)
        val bMultiply: Button = findViewById(R.id.bMultiply)
        val bSubtract: Button = findViewById(R.id.bSubtract)
        val bAdd: Button = findViewById(R.id.bAdd)
        //TextView
        val textViewResult:TextView = findViewById(R.id.textViewResult)

        b0.setOnClickListener{
            textViewResult.text = (b0.text).toString()
            backUp = textViewResult.text.toString()
        }

        b1.setOnClickListener{
            textViewResult.text = (b1.text).toString()
            backUp = textViewResult.text.toString()
        }

        b2.setOnClickListener{
            textViewResult.text = (b2.text).toString()
            backUp = textViewResult.text.toString()
        }

        b3.setOnClickListener{
            textViewResult.text = (b3.text).toString()
            backUp = textViewResult.text.toString()
        }

        b4.setOnClickListener{
            textViewResult.text = (b4.text).toString()
            backUp = textViewResult.text.toString()
        }

        b5.setOnClickListener{
            textViewResult.text = (b5.text).toString()
            backUp = textViewResult.text.toString()
        }
        b6.setOnClickListener{
            textViewResult.text = (b6.text).toString()
            backUp = textViewResult.text.toString()
        }
        b7.setOnClickListener{
            textViewResult.text = (b7.text).toString()
            backUp = textViewResult.text.toString()
        }
        b8.setOnClickListener{
            textViewResult.text = (b8.text).toString()
            backUp = textViewResult.text.toString()
        }

        b9.setOnClickListener{
            textViewResult.text = (b9.text).toString()
            backUp = textViewResult.text.toString()
        }

        bAC.setOnClickListener{
            textViewResult.text = (0).toString()
            backUp = textViewResult.text.toString()
        }

        bSpecial.setOnClickListener{
            textViewResult.text = "null"
            backUp = textViewResult.text.toString()
        }

        bSplit.setOnClickListener{
            textViewResult.text = (bSplit.text).toString()
            backUp = textViewResult.text.toString()
        }

        bMultiply.setOnClickListener{
            textViewResult.text = (bMultiply.text).toString()
            backUp = textViewResult.text.toString()
        }

        bSubtract.setOnClickListener{
            textViewResult.text = (bSubtract.text).toString()
            backUp = textViewResult.text.toString()
        }

        bAdd.setOnClickListener{
            textViewResult.text = (bAdd.text).toString()
            backUp = textViewResult.text.toString()
        }

        bComma.setOnClickListener{
            textViewResult.text = (bComma.text).toString()
            backUp = textViewResult.text.toString()
        }
    }

    override fun onResume(){
        super.onResume()
        val text:TextView = findViewById(R.id.textViewResult)
        text.text = backUp
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("textViewResult", backUp)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        backUp = savedInstanceState.getString("textViewResult", "").toString()
    }

}