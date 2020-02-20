package com.example.gitfriends.model.dataclasses

data class Item(
    var avatar_url: String,
    var followers_url: String,
    var gravatar_id: String,
    var html_url: String,
    var id: Int,
    var login: String,
    var node_id: String,
    var organizations_url: String,
    var received_events_url: String,
    var repos_url: String,
    var score: Double,
    var subscriptions_url: String,
    var type: String,
    var url: String
)