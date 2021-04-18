package com.gonzalez.jesus.misnotas

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter


class AdaptadorNotas: BaseAdapter(){
    var context: Context
    var notas = ArrayList<Nota>()

    constructor(context: Context, notas: ArrayList<Nota>){
        this.context = context
        this.notas = notas
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return null;
    }

    override fun getItem(position: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(position: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }


}