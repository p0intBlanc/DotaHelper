package android.pointblanck.com.dota

import android.content.Context
import android.pointblanck.com.dota.databinding.HeroListItemLayoutBinding
import android.pointblanck.com.dota.heroes.HeroStat
import android.pointblanck.com.dota.network.RetrofitManager
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class HeroAdapter : RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    var heroesList: ArrayList<HeroStat> = ArrayList()
    var context: Context? = null;


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        context = parent.context
        return HeroViewHolder(HeroListItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return heroesList.size
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.mBinding.heroName.text = heroesList[position].localizedName
        Glide.with(context!!).load(RetrofitManager.BASE_URL + heroesList[position].img).apply(Trans).into(holder.mBinding.heroIcon)
    }

    fun setHeroesList(value: List<HeroStat>?) {
        value?.let {
            heroesList.clear()
            heroesList.addAll(it)
            notifyDataSetChanged()
        }

    }

    class HeroViewHolder(var mBinding: HeroListItemLayoutBinding) : RecyclerView.ViewHolder(mBinding.root) {
        init {

        }
    }

}