package com.example.cheshbonhanefeshdaily

import androidx.annotation.StringRes
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost

enum class CheshbonScreen(@StringRes val title : Int) {
    Home(title = R.string.home_page),
    History(title = R.string.history),
    Stats(title = R.string.stats)
}

@Composable
fun CheshbonAppBar() {

}

@Composable
fun CheshbonApp(

) {

}