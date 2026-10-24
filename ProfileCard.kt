package com.example.myapplication 

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

data class Student(
    val name: String,
    val program: String,
    val gpa: String,
    val email: String,
    val city: String
)

@Composable
fun StudentCard(
    student: Student,
    modifier: Modifier = Modifier
) {
    // TODO: Task 2 fills this in
}

@Preview(showBackground = true)
@Composable
private fun StudentCardPreview() {
    MyApplicationTheme {
        StudentCard(
            student = Student(
                name = "Fajr Abuzoah",
                program = "Computer Science",
                gpa = "4.50",
                email = "fajr@example.com",
                city = "Jubail"
            )
        )
    }
}