package android.pointblanck.com.dota

import android.os.Bundle
import android.pointblanck.com.dota.databinding.FragHerosBinding
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HerosFragment : Fragment() {
    var viewModel: MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        var mBinding = FragHerosBinding.inflate(inflater, container, false)
        var adapter = HeroAdapter()
        mBinding.herosList.layoutManager = LinearLayoutManager(context)
        mBinding.herosList.adapter = adapter
        val decoration = DividerItemDecoration(context, LinearLayoutManager.VERTICAL)
        mBinding.herosList.addItemDecoration(decoration)



        viewModel?.heroesList?.observe(this, Observer {
            Log.i("livedata", "onchange called")
            adapter.setHeroesList(it)
        })
        return mBinding.root

    }
}