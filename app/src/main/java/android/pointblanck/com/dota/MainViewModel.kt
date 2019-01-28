package android.pointblanck.com.dota

import android.app.Application
import android.pointblanck.com.dota.heroes.HeroStat
import android.pointblanck.com.dota.network.RetrofitManager
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel(application: Application) : AndroidViewModel(application) {
    var heroesList: MutableLiveData<List<HeroStat>>? = MutableLiveData()

    init {
        RetrofitManager.getOpenDotaInterface()?.getHeroes()?.enqueue(object : Callback<List<HeroStat>> {
            override fun onFailure(call: Call<List<HeroStat>>, t: Throwable) {
                Log.i("herostat", "failed ${t.localizedMessage}")
            }

            override fun onResponse(call: Call<List<HeroStat>>, response: Response<List<HeroStat>>) {

                heroesList?.value =response.body()
                Log.i("herostat", "Live data post value called")
            }

        })
    }


}