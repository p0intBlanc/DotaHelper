package android.pointblanck.com.dota.network.ApiInterface

import android.pointblanck.com.dota.heroes.HeroStat
import retrofit2.Call
import retrofit2.http.GET


interface OpenDataMainInterface {

    @GET("/api/heroStats")
    fun getHeroes(): Call<List<HeroStat>>
}