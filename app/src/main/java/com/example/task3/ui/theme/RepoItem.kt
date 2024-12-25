package com.example.task3.ui.theme

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task3.R
import com.example.task3.ui.theme.screens.issues_list.Issue
import com.example.task3.ui.theme.screens.issues_list.fakeIssueList

@Composable
fun RepoItem(
    Issue:Issue,
    modifier: Modifier = Modifier,
    onItemClick:()->Unit
    ) {
    Modifier.padding(top = 20.dp)
    Row (
        Modifier.fillMaxWidth()
            .padding(8.dp)
            .background(
                color = Color.White,
                MaterialTheme.shapes.large
            )
            .clickable {
                onItemClick()
            }

    ){
        Image(
            modifier = Modifier.padding(start = 20.dp , end =20.dp)
                .size(50.dp),
           painter= painterResource(R.drawable.t3),
            contentDescription = null
        )
        Column {
            Row {
                Text(
                    modifier = Modifier.padding(bottom = 10.dp)
                        .weight(1f),
                    text = Issue.title,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold,
                    style = Typography.bodyLarge

                )
                Text(
                    text = Issue.status,
                    style = Typography.bodyLarge,
                    modifier = Modifier.padding(end = 20.dp),

                )

            }



            Text(
                modifier = Modifier.padding(bottom = 10.dp),
                text = Issue.description,
                style = Typography.bodyLarge

            )
            Text(
                modifier = Modifier.padding(bottom = 12.dp),
                text = "Created At ${Issue.createdAt}" ,
                        style = Typography.bodyLarge,
                maxLines = 1

            )
        }

    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFB4AFB0

)
@Composable
private fun PreviewRepoItem() {
    Task3Theme {
        RepoItem(onItemClick ={}, Issue = fakeIssueList.first() )
    }

}