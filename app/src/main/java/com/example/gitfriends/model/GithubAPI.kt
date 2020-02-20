package com.example.gitfriends.model

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubAPI {
    // https://api.github.com/
    // Example URL: search?q=kenya+in%3Alogin&type=Users

    fun initRetrofit(): GithubAPI {
        var retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        var api = retrofit.create(GithubAPI::class.java)
        return api
    }
    /*
     * Find users via various criteria. This method returns up to 100 results per page.
     * Should be read from the search box in MainActivity and resubmitted every time
     * the field is updated.
     *
     * {octo in:login} matches users with the word "octo" in their username.
     * GET /search/users
     */
    @GET("search")
    fun getUserList(@Query("q") word: String) : Call<PokoUserQuery>


    /*
     * Provides publicly available information about someone with a GitHub account.
     * This Request should be called when a user item is clicked on in the MainActivity.
     *
     * GET /users/:username
     */
    @GET("users/{username}")
    fun getSingleUser(@Path("username") username: String) : Call<SingleUser>


    /*
     * Return a list of a specific User's repos. Should populate the UserProfile activity
     * in the RecyclerView.
     *
     * GET /users/:username/repos
     */
    @GET("users/{username}/repos")
    fun getUserRepos(@Path("username") username: String) : Call<UserRepos>

}