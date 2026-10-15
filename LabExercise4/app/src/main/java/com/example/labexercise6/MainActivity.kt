package com.example.labexercise6



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.labexercise6.data.AppDatabase
import com.example.labexercise6.ui.CustomerApp
import com.example.labexercise6.ui.CustomerViewModel
import com.example.labexercise6.ui.CustomerViewModelFactory
import com.example.labexercise6.theme.LabExercise6Theme

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