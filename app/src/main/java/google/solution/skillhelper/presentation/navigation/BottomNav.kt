package google.solution.skillhelper.presentation.navigation

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import google.solution.skillhelper.R

@Composable
fun BottomNav(
    navController: NavController
){
    val items = listOf(
        NavItem.Home,
        NavItem.Courses,
        NavItem.Scholarship,
        NavItem.Profile
    )
    BottomNavigation(
        backgroundColor = Color.Black,
        modifier = Modifier
            .clip(RoundedCornerShape(25.dp,25.dp))
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach{ item ->
            BottomNavigationItem(
                icon = { Icon(imageVector = ImageVector.vectorResource(id = item.icon), contentDescription = null) },
                selected = currentRoute==item.navRoute,
                onClick = { navController.navigate(item.navRoute) },
                label = { Text(text = stringResource(id = item.title)) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(alpha = 0.4f)
            )
        }
    }
}