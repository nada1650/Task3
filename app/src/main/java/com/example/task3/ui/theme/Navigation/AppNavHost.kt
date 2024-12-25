package com.example.task3.ui.theme.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.task3.ui.theme.RepoItem
import com.example.task3.ui.theme.screens.issues_list.IssuesList

@Composable
fun AppNavHost() {
    val navController=rememberNavController()
    NavHost(
        navController = navController,
        startDestination="issues_list"

    ){
        composable(route = "issues_list"){
            IssuesList(onItemClick = {
                navController.navigate("repo_details")
            }
            )
        }

        composable(route = "repo_details"){

        }

    }
}