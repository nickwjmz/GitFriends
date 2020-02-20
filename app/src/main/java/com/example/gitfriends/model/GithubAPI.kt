package com.example.gitfriends.model

import com.example.gitfriends.model.dataclasses.PokoUserQuery
import com.example.gitfriends.model.dataclasses.SingleUser
import com.example.gitfriends.model.dataclasses.UserRepos
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubAPI {
    // user_repositories_url: "https://api.github.com/users/{user}/repos{?type,page,per_page,sort}",
    // user_search_url: "https://api.github.com/search/users?q={query}{&page,per_page,sort,order}"

    /*
     * Find users via various criteria. This method returns up to 100 results per page.
     * Should be read from the search box in MainActivity and resubmitted every time
     * the field is updated.
     *
     * {octo in:login} matches users with the word "octo" in their username.
     * GET /search/users
     */
    @GET("search/users")
    fun getUserList(
        @Query("q") word: String
    ) : Call<PokoUserQuery>


    /*
     * Provides publicly available information about someone with a GitHub account.
     * This Request should be called when a user item is clicked on in the MainActivity.
     *
     * GET /users/:username
     */
    @GET("users/{username}")
    fun getSingleUser(
        @Path("username") username: String
    ) : Call<SingleUser>


    /*
     * Return a list of a specific User's repos. Should populate the UserProfile activity
     * in the RecyclerView.
     *
     * GET /users/:username/repos
     */
    @GET("users/{username}/repos")
    fun getUserRepos(
        @Path("username") username: String
    ): Call<UserRepos>

}