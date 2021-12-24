package com.example.kotlin1_homework4.fragments.fragment_three

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin1_homework4.databinding.ListItemBinding

class FragmentThreeAdapter(private val context: Context, private val list: MutableList<String>):
    RecyclerView.Adapter<FragmentThreeAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val operation = list[position]
        holder.bind(operation)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MyViewHolder(listItemBinding: ListItemBinding)
        : RecyclerView.ViewHolder(listItemBinding.root){

            private val binding = listItemBinding

            fun bind (operation: String) {
                binding.tvListItem.text = operation
            }
    }
}
