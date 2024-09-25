package com.example.onlineshop.adapter

import android.content.Context
import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.ImageViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.onlineshop.R
import com.example.onlineshop.databinding.ViewholderBrandBinding
import com.example.onlineshop.databinding.ViewholderColorBinding
import com.example.onlineshop.databinding.ViewholderSizeBinding
import com.example.onlineshop.model.BrandModel

class SizeAdapter(private val items: MutableList<String>) :
    RecyclerView.Adapter<SizeAdapter.Viewholder>() {

    private var selectedPosition = -1
    private var lastSelectedPosition = -1
    private lateinit var context: Context

    class Viewholder(val binding: ViewholderSizeBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SizeAdapter.Viewholder {
        context = parent.context
        val binding = ViewholderSizeBinding.inflate(
            LayoutInflater.from(context),
            parent,
            false
        )
        return Viewholder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: SizeAdapter.Viewholder, position: Int) {

        holder.binding.sizeTxt.text = items[position]
        holder.binding.root.setOnClickListener {
            lastSelectedPosition = selectedPosition
            selectedPosition = holder.adapterPosition
            notifyItemChanged(lastSelectedPosition)
            notifyItemChanged(selectedPosition)
        }

        if (selectedPosition == position) {
            holder.binding.colorLayout.setBackgroundResource(R.drawable.grey_bg_selected)
            holder.binding.sizeTxt.setTextColor(context.resources.getColor(R.color.purple))
        } else {
            holder.binding.colorLayout.setBackgroundResource(R.drawable.grey_bg)
            holder.binding.sizeTxt.setTextColor(context.resources.getColor(R.color.black))
        }
    }
}
