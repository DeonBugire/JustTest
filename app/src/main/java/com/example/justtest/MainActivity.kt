package com.example.justtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.justtest.Data.RepositoryOfCatsData
import com.example.justtest.presentation.CardOfCatPresentation
import com.example.justtest.presentation.ColorButtonPresentation
import com.example.justtest.ui.theme.JustTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JustTestTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        for (CatCardData in RepositoryOfCatsData()) {
                            CardOfCatPresentation(
                                name = CatCardData.nameOfCat,
                                breed = CatCardData.breedOfCat
                            )
                        }
                        ColorButtonPresentation()
                    }

                }
            }
        }
    }
}



