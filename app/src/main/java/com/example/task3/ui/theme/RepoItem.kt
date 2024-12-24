package com.example.task3.ui.theme

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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

@Composable
fun RepoItem(modifier: Modifier = Modifier) {
    Modifier.padding(top = 20.dp)
    Row (
        Modifier.fillMaxWidth()
            .padding(8.dp)
            .background(
                color = Color.White,
                MaterialTheme.shapes.large
            )

    ){
        Image(
            modifier = Modifier.padding(start = 20.dp , end =20.dp)
                .size(50.dp),
           painter= painterResource(R.drawable.t3),
            contentDescription = null
        )
        Column {
            Text(
                    modifier = Modifier.padding(bottom = 10.dp),
                text = "Bump pyarrow from 7 october",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Bold,
                style = Typography.bodyLarge

                )


            Text(
                modifier = Modifier.padding(bottom = 10.dp),
                text = "NONE",
                style = Typography.bodyLarge

            )
            Text(
                modifier = Modifier.padding(bottom = 12.dp),
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append("Created At : ")
                    }
                    append("2023-11-9 ,23:pm ")
                },
                        style = Typography.bodyLarge,
                maxLines = 1

            )
        }
        Text(
            text = "Open",
            style = Typography.bodyLarge,
            modifier = Modifier.padding(end = 20.dp),
            textAlign = TextAlign.Right


        )

    }
}

@Preview(
    showBackground = true
)
@Composable
private fun PreviewRepoItem() {
    Task3Theme {
        RepoItem()
    }

}