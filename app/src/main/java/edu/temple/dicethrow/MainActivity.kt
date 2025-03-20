package edu.temple.dicethrow

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceViewModel : DiceViewModel by lazy{
            ViewModelProvider(this)[DiceViewModel::class.java]
        }


        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, DieFragment().setDieSides(20))
            .replace(R.id.fragmentContainerView2, DieFragment().setDieSides(12))
            .commit()

        findViewById<Button>(R.id.rollDiceButton).setOnClickListener {
           diceViewModel.rollDie()
        }
    }
}