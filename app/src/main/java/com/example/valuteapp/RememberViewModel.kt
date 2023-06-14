package com.example.valuteapp

import androidx.lifecycle.ViewModel

class RememberViewModel() : ViewModel() {

    private var bul: Boolean = false

    fun getBul(bol: Boolean = bul): Boolean {
        return bol
    }
}