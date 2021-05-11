package com.example.android.funfact

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class factAdapter(context : Context, fact :List<factModel>) : ArrayAdapter<factModel>(context , 0 , fact) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        var fact = getItem(position)
        if (view == null){
            view = LayoutInflater.from(parent.context).inflate(R.layout.fact_item , parent , false)
        }

        val logo = view?.findViewById<ImageView>(R.id.imageLogo)
        val name = view?.findViewById<TextView>(R.id.name)

        fact?.logo?.let{
            logo?.setImageResource(fact.logo)
        }

        view?.setOnClickListener {
            val intent = Intent (parent.context , DetailedActivity::class.java)
            intent.putExtra(LOGO_EXTRAs , fact?.logo)
            intent.putExtra(NAME_EXTRAs , fact?.name)
            intent.putExtra(FACT_EXTRAs , fact?.fact)
            parent.context.startActivity(intent)
        }

        name?.text = fact?.name
        return view!!
    }

    companion object {
        val LOGO_EXTRAs = "logo extras"
        val NAME_EXTRAs = "name extra"
        val FACT_EXTRAs = "fact_extra"
    }
}