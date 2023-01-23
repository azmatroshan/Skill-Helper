package google.solution.skillhelper.presentation.navigation

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import google.solution.skillhelper.R
import java.util.Vector

sealed class AppScreen(val route: String){
    object Home: AppScreen("home")
    object Courses: AppScreen("courses")
    object Scholarship: AppScreen("scholarship")
    object Profile: AppScreen("profile")
}

sealed class NavItem(
    @StringRes val title: Int,
    val icon: Int,
    val navRoute: String
){
    object Home: NavItem(R.string.home, R.drawable.ic_home ,"home")
    object Courses: NavItem(R.string.courses, R.drawable.ic_course,"courses")
    object Scholarship: NavItem(R.string.scholarship, R.drawable.ic_scholarship,"scholarship")
    object Profile: NavItem(R.string.profile, R.drawable.ic_profile,"profile")
}