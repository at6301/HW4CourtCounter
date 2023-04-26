package com.thies.hw4courtcounter

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

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

     // Adding functions from MainActivity for TEAM A
     fun oneForTeamA() {
         scoreTeamA++
     }
     fun twoForTeamA() {
         scoreTeamA += 2
     }
     fun threeForTeamA() {
         scoreTeamA += 3
     }

     // Adding functions from MainActivity for TEAM B
     fun oneForTeamB() {
         scoreTeamB++
     }
     fun twoForTeamB() {
         scoreTeamB += 2
     }
     fun threeForTeamB() {
         scoreTeamB += 3
     }
     fun resetScores() {
         scoreTeamA = 0
         scoreTeamB = 0
     }



 }
