package com.thies.hw4courtcounter

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel


//private const val TAG = "CounterViewModel"
const val CURRENT_SCORE_TEAM_A_KEY = "CURRENT_SCORE_TEAM_A"
const val CURRENT_SCORE_TEAM_B_KEY = "CURRENT_SCORE_TEAM_B"

 class CounterViewModel(private val savedStateHandle: SavedStateHandle):ViewModel() {

     // Adding variables from MainActivity and implementing saved state handle
     var scoreTeamA: Int
     get() = savedStateHandle.get(CURRENT_SCORE_TEAM_A_KEY)?:0
     set(value) = savedStateHandle.set(CURRENT_SCORE_TEAM_A_KEY, value)

     var scoreTeamB: Int
     get() = savedStateHandle.get(CURRENT_SCORE_TEAM_B_KEY)?:0
     set(value) = savedStateHandle.set(CURRENT_SCORE_TEAM_B_KEY, value)

     // Adding functions from MainActivity
     fun addOneForTeamA() {
         scoreTeamA++
     }
     fun addOneForTeamB() {
         scoreTeamB++
     }
     fun addTwoForTeamA() {
         scoreTeamA = scoreTeamA + 2
     }
     fun addTwoForTeamB() {
         scoreTeamB = scoreTeamB + 2
     }
     fun addThreeForTeamA() {
         scoreTeamA = scoreTeamA + 3
     }
     fun addThreeForTeamB() {
         scoreTeamB = scoreTeamB + 3
     }
     fun resetScores() {
         scoreTeamA = 0
         scoreTeamB = 0
     }



 }
