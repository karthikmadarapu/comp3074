package com.example.labexercise4



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.labexercise4.data.AppDatabase
import com.example.labexercise4.ui.CustomerApp
import com.example.labexercise4.ui.CustomerViewModel
import com.example.labexercise4.ui.CustomerViewModelFactory
import com.example.labexercise4.theme.LabExercise6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val database = AppDatabase.getDatabase(applicationContext)

        setContent {
            LabExercise6Theme {
                val viewModel: CustomerViewModel = viewModel(
                    factory = CustomerViewModelFactory(database.customerDao())
                )
                CustomerApp(viewModel)
            }
        }
    }
}