package google.solution.skillhelper.presentation.navigation

import android.accounts.Account
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import google.solution.skillhelper.presentation.screens.ScreenCourse
import google.solution.skillhelper.presentation.screens.ScreenHome
import google.solution.skillhelper.presentation.screens.ScreenProfile
import google.solution.skillhelper.presentation.screens.ScreenScholarship

@Composable
fun NavigationHost(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNav(
                navController = navController
            )
        }
    ){
        Column(modifier = Modifier.padding(it)) {
            NavHost(
                navController = navController,
                startDestination = AppScreen.Home.route
            ){
                composable(route = AppScreen.Home.route){ ScreenHome() }
                composable(route = AppScreen.Courses.route){ ScreenCourse() }
                composable(route = AppScreen.Scholarship.route){ ScreenScholarship() }
                composable(route = AppScreen.Profile.route){ ScreenProfile() }
            }
        }
    }
}