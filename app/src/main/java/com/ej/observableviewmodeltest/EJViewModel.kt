package com.ej.observableviewmodeltest

import androidx.databinding.ObservableInt

class EJViewModel : ObservableViewModel(){
    val scoreA = ObservableInt(0)
    val scoreB = ObservableInt(0)

    fun aPlus1() {
        scoreA.set(scoreA.get() + 1)
    }

    fun bPlus1() {
        scoreB.set(scoreB.get() + 1)
    }

    private fun ObservableInt.increment(){
        set(get()+1)
    }
}