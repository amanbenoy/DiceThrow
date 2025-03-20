package edu.temple.dicethrow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class DiceViewModel : ViewModel() {

    private var dieSides: Int = 6

    private val currentRoll : MutableLiveData<Int> by lazy{
        MutableLiveData()
    }

    fun setCurrentRoll(roll: Int) {
        currentRoll.value = roll
    }

    fun getCurrentRoll() : LiveData<Int> {
        return currentRoll
    }

    fun rollDie(){
        setCurrentRoll(Random.nextInt(dieSides) + 1)
    }
}