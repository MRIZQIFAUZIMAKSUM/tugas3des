package com.MRIZQIFAUZIMAKSUM.tugas3des

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
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

        recyclerView = findViewById(R.id.recycler_view_item)
        gridLayoutManager = GridLayoutManager(applicationContext, 3,LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInlist()
        alphaAdapters = AlphaAdapters(applicationContext, arrayList!!)
        recyclerView?.adapter = alphaAdapters
    }
    private fun setDataInlist():ArrayList<AlphaChar>{

        var items:ArrayList<AlphaChar> = ArrayList()
        items.add(AlphaChar(R.drawable.letter_a, "char A"))
        items.add(AlphaChar(R.drawable.letter_b, "char B"))
        items.add(AlphaChar(R.drawable.letter_c, "char C"))
        items.add(AlphaChar(R.drawable.letter_d, "char D"))
        items.add(AlphaChar(R.drawable.letter_e, "char E"))
        items.add(AlphaChar(R.drawable.letter_f, "char F"))
        items.add(AlphaChar(R.drawable.letter_g, "char G"))
        items.add(AlphaChar(R.drawable.letter_h, "char H"))
        items.add(AlphaChar(R.drawable.letter_i, "char I"))
        items.add(AlphaChar(R.drawable.letter_j, "char J"))
        items.add(AlphaChar(R.drawable.letter_k, "char K"))
        items.add(AlphaChar(R.drawable.letter_l, "char L"))
        items.add(AlphaChar(R.drawable.letter_m, "char M"))
        items.add(AlphaChar(R.drawable.letter_n, "char N"))
        items.add(AlphaChar(R.drawable.letter_o, "char O"))
        items.add(AlphaChar(R.drawable.letter_p, "char P"))
        items.add(AlphaChar(R.drawable.letter_q, "char Q"))
        items.add(AlphaChar(R.drawable.letter_r, "char R"))
        items.add(AlphaChar(R.drawable.letter_s, "char S"))
        items.add(AlphaChar(R.drawable.letter_t, "char T"))
        items.add(AlphaChar(R.drawable.letter_u, "char U"))
        items.add(AlphaChar(R.drawable.letter_v, "char V"))
        items.add(AlphaChar(R.drawable.letter_w, "char W"))
        items.add(AlphaChar(R.drawable.letter_q, "char X"))
        items.add(AlphaChar(R.drawable.letter_y, "char Y"))
        items.add(AlphaChar(R.drawable.letter_z, "char Z"))
        return items
    }
}