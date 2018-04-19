package edu.washington.ronney.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val status : TextView = findViewById<View>(R.id.playerStatus) as TextView


        //player 1
        val hp1 : TextView = findViewById<View>(R.id.hp1) as TextView
        val add1 = findViewById<View>(R.id.add1) as Button
        val add51 = findViewById<View>(R.id.add51) as Button
        val sub1 = findViewById<View>(R.id.sub1) as Button
        val sub51 = findViewById<View>(R.id.sub51) as Button

        //player 2
        val hp : TextView = findViewById<View>(R.id.hp) as TextView
        val add2 = findViewById<View>(R.id.add2) as Button
        val add3 = findViewById<View>(R.id.add3) as Button
        val sub2 = findViewById<View>(R.id.sub2) as Button
        val sub = findViewById<View>(R.id.sub) as Button

        //player 3
        val hp2 : TextView = findViewById<View>(R.id.hp2) as TextView
        val add4 = findViewById<View>(R.id.add4) as Button
        val add5 = findViewById<View>(R.id.add5) as Button
        val sub4 = findViewById<View>(R.id.sub4) as Button
        val sub3 = findViewById<View>(R.id.sub3) as Button

        //player 4
        val hp3 : TextView = findViewById<View>(R.id.hp3) as TextView
        val add6 = findViewById<View>(R.id.add6) as Button
        val add7 = findViewById<View>(R.id.add7) as Button
        val sub6 = findViewById<View>(R.id.sub6) as Button
        val sub5 = findViewById<View>(R.id.sub5) as Button

        //player 1 listeners
        add1.setOnClickListener() {
            val text = hp1.getText().toString().toInt() + 1;
            hp1.setText(text.toString())
        }

        add51.setOnClickListener() {
            val text = hp1.getText().toString().toInt() + 5;
            hp1.setText(text.toString())
        }

        sub1.setOnClickListener() {
            val text = hp1.getText().toString().toInt() - 1;
            hp1.setText(text.toString())
            if (text <= 0) {
                status.setText(status.getText().toString() + " Player 1 LOSES!")
                add1.setEnabled(false)
                add51.setEnabled(false)
                sub1.setEnabled(false)
                sub51.setEnabled(false)
            }
        }

        sub51.setOnClickListener() {
            val text = hp1.getText().toString().toInt() - 5;
            hp1.setText(text.toString())
            if (text <= 0) {
                status.setText(status.getText().toString() + " Player 1 LOSES!")
                add1.setEnabled(false)
                add51.setEnabled(false)
                sub1.setEnabled(false)
                sub51.setEnabled(false)
            }
        }

        //player 2 listeners
        add2.setOnClickListener() {
            val text = hp.getText().toString().toInt() + 1;
            hp.setText(text.toString())
        }

        add3.setOnClickListener() {
            val text = hp.getText().toString().toInt() + 5;
            hp.setText(text.toString())
        }

        sub2.setOnClickListener() {
            val text = hp.getText().toString().toInt() - 1;
            hp.setText(text.toString())
            if (text <= 0) {
                status.setText(status.getText().toString() + " Player 2 LOSES!")
                add2.setEnabled(false)
                add3.setEnabled(false)
                sub2.setEnabled(false)
                sub.setEnabled(false)
            }
        }

        sub.setOnClickListener() {
            val text = hp.getText().toString().toInt() - 5;
            hp.setText(text.toString())
            if (text <= 0) {
                status.setText(status.getText().toString() + " Player 2 LOSES!")
                add2.setEnabled(false)
                add3.setEnabled(false)
                sub2.setEnabled(false)
                sub.setEnabled(false)
            }
        }

        //player 3 listeners
        add4.setOnClickListener() {
            val text = hp2.getText().toString().toInt() + 1;
            hp2.setText(text.toString())
        }

        add5.setOnClickListener() {
            val text = hp2.getText().toString().toInt() + 5;
            hp2.setText(text.toString())
        }

        sub4.setOnClickListener() {
            val text = hp2.getText().toString().toInt() - 1;
            hp2.setText(text.toString())
            if (text <= 0) {
                status.setText(status.getText().toString() + " Player 3 LOSES!")
                add4.setEnabled(false)
                add5.setEnabled(false)
                sub4.setEnabled(false)
                sub3.setEnabled(false)
            }
        }

        sub3.setOnClickListener() {
            val text = hp2.getText().toString().toInt() - 5;
            hp2.setText(text.toString())
            if (text <= 0) {
                status.setText(status.getText().toString() + " Player 3 LOSES!")
                add4.setEnabled(false)
                add5.setEnabled(false)
                sub4.setEnabled(false)
                sub3.setEnabled(false)
            }
        }


        //player 4 listeners
        add6.setOnClickListener() {
            val text = hp3.getText().toString().toInt() + 1;
            hp3.setText(text.toString())
        }

        add7.setOnClickListener() {
            val text = hp3.getText().toString().toInt() + 5;
            hp3.setText(text.toString())
        }

        sub6.setOnClickListener() {
            val text = hp3.getText().toString().toInt() - 1;
            hp3.setText(text.toString())
            if (text <= 0) {
                status.setText(status.getText().toString() + " Player 4 LOSES!")
                add6.setEnabled(false)
                add7.setEnabled(false)
                sub6.setEnabled(false)
                sub5.setEnabled(false)
            }
        }

        sub5.setOnClickListener() {
            val text = hp3.getText().toString().toInt() - 5;
            hp3.setText(text.toString())
            if (text <= 0) {
                status.setText(status.getText().toString() + " Player 4 LOSES!")
                add6.setEnabled(false)
                add7.setEnabled(false)
                sub6.setEnabled(false)
                sub5.setEnabled(false)
            }
        }
    }
}
