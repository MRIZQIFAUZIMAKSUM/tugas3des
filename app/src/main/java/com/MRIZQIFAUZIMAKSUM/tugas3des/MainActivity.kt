package com.MRIZQIFAUZIMAKSUM.tugas3des

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import andoridx.recyleview.widget.GridLayoutManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinerLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.MRIZQIFAUZIMAKSUM.tugas3des.adapter.AlphaAdapters
import com.MRIZQIFAUZIMAKSUM.tugas3des.model.AlphaChar

class MainActivity : AppCompatActivity() {

    private var recyclerView:RecyclerView ?=null
    private var gridLayoutManager:GridLayoutManager ?=null
    private var arrayList:ArrayList<AlphaChar> ?=null
    private var alphaAdapters:AlphaAdapters ? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView =findViewById(R.id.my_recycler_view)
        gridLayoutManager = GridLayoutManager(applicationContext,LinearLayoutManager.Vertical,false)
        recyclerView?.LayoutManager =gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList =setDataInlist()
        alphaAdapters =AlphaAdapters()
    }
}