package br.com.joaobosco.appfootball.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import br.com.joaobosco.appfootball.databinding.ItemMatchBinding;
import br.com.joaobosco.appfootball.model.Match;
import br.com.joaobosco.appfootball.ui.DetailActivity;

import static br.com.joaobosco.appfootball.util.Constants.EXTRA_MATCH;

/**
 * Created by João Bosco on 11/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
public class MatchesAdapter extends RecyclerView.Adapter<MatchesAdapter.MyViewHolder> {

    private final List<Match> matches;

    public MatchesAdapter(List<Match> matches) {
        this.matches = matches;
    }

    public List<Match> getMatches() {
        return matches;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMatchBinding binding = ItemMatchBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Context context = holder.itemView.getContext();
        Match match = matches.get(position);

        Glide.with(context).load(match.getHomeTeam().getImage()).circleCrop().into(holder.binding.imgHomeTeam);
        holder.binding.txtHomeTeamName.setText(match.getHomeTeam().getName());
        if (match.getHomeTeam().getScore() != null) {
            holder.binding.txtHomeTeamScore.setText(String.valueOf(match.getHomeTeam().getScore()));
        }
        Glide.with(context).load(match.getAwayTeam().getImage()).circleCrop().into(holder.binding.imgAwayTeam);
        holder.binding.txtAwayTeamName.setText(match.getAwayTeam().getName());
        if (match.getAwayTeam().getScore() != null) {
            holder.binding.txtAwayTeamScore.setText(String.valueOf(match.getAwayTeam().getScore()));
        }

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra(EXTRA_MATCH, match);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return matches.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private final ItemMatchBinding binding;

        public MyViewHolder(ItemMatchBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
