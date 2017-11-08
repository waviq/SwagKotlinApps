package com.mastahcode.waviq.swagapps.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.mastahcode.waviq.swagapps.R
import com.mastahcode.waviq.swagapps.models.Category

/**
 * Created by Waviq on 11/9/17.
 *
 */
class CategoryAdapter (val context: Context, val categories: List<Category>) : BaseAdapter() {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView : View
        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)

        val categoryImage : ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName : TextView = categoryView.findViewById(R.id.categoryName)

        val category = categories[position]

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)
        categoryName.text = category.title

        println("Id: $resourceId")

        return categoryView

    }

    override fun getItem(position: Int): Any {
        return categories [position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
}