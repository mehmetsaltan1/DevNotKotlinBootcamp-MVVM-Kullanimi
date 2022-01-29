package com.example.mvvmkullanimi

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.mvvmkullanimi.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = DataBindingUtil.setContentView(this, R.layout.activity_main)
        tasarim.mainActivityNesnesi = this
        tasarim.hesaplamaSonucu = "0"
       /* buttonToplama.setOnClickListener {

        }
        buttonCarpma.setOnClickListener {

        }*/
    }

    fun buttonToplamaTikla(alinanSayi1:String,alinanSayi2:String) {

        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()
        val toplama = sayi1 + sayi2
        tasarim.hesaplamaSonucu = toplama.toString()
    }

    fun buttonCarpmaTikla(alinanSayi1:String,alinanSayi2:String) {

        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()
        val carpma = sayi1 * sayi2
        tasarim.hesaplamaSonucu  = carpma.toString()
    }
}