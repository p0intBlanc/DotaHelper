package android.pointblanck.com.dota.network

import android.pointblanck.com.dota.network.ApiInterface.OpenDataMainInterface
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.logging.HttpLoggingInterceptor


object RetrofitManager {
    internal var retrofit: Retrofit? = null
    val BASE_URL = "https://api.opendota.com"

    init {
        retrofit = Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(getOkHttpClient())
            .build()
    }

    fun getOpenDotaInterface(): OpenDataMainInterface? {

        return retrofit?.create(OpenDataMainInterface::class.java)
    }

    fun getOkHttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
        val httpLoggingInterceptor = HttpLoggingInterceptor()
// See http://square.github.io/okhttp/3.x/logging-interceptor/ to see the options.
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        builder.networkInterceptors().add(httpLoggingInterceptor)

        return builder.build()
    }
}