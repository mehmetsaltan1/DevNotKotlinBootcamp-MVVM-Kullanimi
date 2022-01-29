package com.example.mvvmkullanimi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
     var sonuc = MutableLiveData<String>()
    init {
        sonuc = MutableLiveData<String>("0")
    }
    fun toplamaYap(alinanSayi1:String,alinanSayi2:String) {

        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()
        val toplama = sayi1 + sayi2
        sonuc.value  = toplama.toString()
    }
    fun carpmaYap(alinanSayi1:String,alinanSayi2:String) {

        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()
        val carpma = sayi1 * sayi2
        sonuc.value = carpma.toString()
    }
}