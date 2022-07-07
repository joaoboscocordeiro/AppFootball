package br.com.joaobosco.appfootball.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import br.com.joaobosco.appfootball.databinding.ItemMatchBinding
import br.com.joaobosco.appfootball.domain.Match

/**
 * Created by João Bosco on 06/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
class MatchesAdapter : RecyclerView.Adapter<MatchesAdapter.MatchViewHolder>() {

    class MatchViewHolder(binding: ItemMatchBinding) : RecyclerView.ViewHolder(binding.root)

    private lateinit var binding: ItemMatchBinding

    private val differCallback = object : DiffUtil.ItemCallback<Match>() {
        override fun areItemsTheSame(oldItem: Match, newItem: Match): Boolean {
            return oldItem.homeTeam == newItem.homeTeam
        }

        override fun areContentsTheSame(oldItem: Match, newItem: Match): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchViewHolder {
        binding = ItemMatchBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MatchViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MatchViewHolder, position: Int) {
        val match = differ.currentList[position]

        holder.itemView.apply {
            binding.txtHomeTeamName.text = match.homeTeam.name
            binding.txtAwayTeamName.text = match.awayTeam.name
        }
    }

    override fun getItemCount(): Int = differ.currentList.size

}