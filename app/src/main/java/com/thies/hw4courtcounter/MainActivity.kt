package com.thies.hw4courtcounter

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.thies.hw4courtcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /*var scoreTeamA = 0
    var scoreTeamB = 0*/
    private lateinit var binding: ActivityMainBinding
    private val counterViewModel:CounterViewModel by viewModels()
    //private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Log.d(TAG, "Got a CounterViewModel:$counterViewModel")
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View?) {
        // scoreTeamA++
        counterViewModel.addOneForTeamA()
        displayForTeamA(counterViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View?) {
        // scoreTeamA += 2
        counterViewModel.addTwoForTeamA()
        displayForTeamA(counterViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View?) {
        // scoreTeamA += 3
        counterViewModel.addThreeForTeamA()
        displayForTeamA(counterViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View?) {
        // scoreTeamB++
        counterViewModel.addOneForTeamB()
        displayForTeamB(counterViewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View?) {
        // scoreTeamB += 2
        counterViewModel.addTwoForTeamB()
        displayForTeamB(counterViewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View?) {
        // scoreTeamB += 3
        counterViewModel.addThreeForTeamB()
        displayForTeamB(counterViewModel.scoreTeamB)
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View?) {
        // scoreTeamA = 0
        // scoreTeamB = 0
        counterViewModel.resetScores()
        displayForTeamA(counterViewModel.scoreTeamA)
        displayForTeamB(counterViewModel.scoreTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = binding.teamAScore
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = binding.teamBScore
        scoreView.text = score.toString()
    }
}