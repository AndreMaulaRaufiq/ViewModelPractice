package com.example.viewmodelpractice

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var angka = 0

    fun tambahAngka() {
        angka++
    }
}
