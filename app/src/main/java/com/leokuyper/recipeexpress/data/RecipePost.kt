package com.leokuyper.recipeexpress.data

import com.google.firebase.Timestamp

class RecipePost (
    var id: String = "",
    val userId: String = "",
    val timestamp: Timestamp = Timestamp.now(),
    val name: String = "",
    val ingredients: String = ""
)

