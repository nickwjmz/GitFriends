package com.example.gitfriends.model.dataclasses

import com.example.gitfriends.model.dataclasses.Item

data class PokoUserQuery(
    var incomplete_results: Boolean,
    var items: List<Item>,
    var total_count: Int
)