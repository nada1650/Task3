package com.example.task3.ui.theme.screens.issues_list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task3.ui.theme.RepoItem

@Composable
fun IssuesList(onItemClick:()->Unit) {
    LazyColumn(
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(fakeIssueList){repoItem->
            RepoItem (
                Issue = repoItem,
                onItemClick = onItemClick
            )

        }
    }
}


