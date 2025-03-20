package edu.temple.dicethrow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    val currentRoll : MutableLiveData<Int> by lazy{
        MutableLiveData()
    }

    fun setCurrentRoll(roll: Int) {
        currentRoll.value = roll
    }

    fun getCurrentRoll() : LiveData<Int> {
        return currentRoll
    }
}