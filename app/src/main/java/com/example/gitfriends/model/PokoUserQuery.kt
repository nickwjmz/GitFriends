package com.example.gitfriends.model

data class PokoUserQuery(
    var incomplete_results: Boolean,
    var items: List<Item>,
    var total_count: Int
)