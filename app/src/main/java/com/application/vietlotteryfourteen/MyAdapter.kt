package com.application.vietlotteryfourteen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.card_layout_lottery.view.*
import kotlinx.android.synthetic.main.card_layout_lottery.view.*

class MyAdapter(private val context: Context, private val myWaysArrayList: ArrayList<MyWays>): PagerAdapter(){
    override fun getCount(): Int {
        return  myWaysArrayList.size //return list of records/items
    }
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        //inflate layout card_layout.xml
        val  view = LayoutInflater.from(context).inflate(R.layout.card_layout_lottery, container, false)

        //getdata
        val model = myWaysArrayList[position]
        val title = model.title
        val description = context.resources.getString(model.description)
        val image = model.image

        //set data to ui views
        view.images.setImageResource(image)
        view.titles.text = title
        view.descriptions.text = description


        //handle item/card click
        view.setOnClickListener{
            Navigator.showContent2(context, "$title \n $description")
        }
        //add view to container
       container.addView(view)
        return view
    }
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}

