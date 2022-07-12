package br.com.joaobosco.appfootball.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.joaobosco.appfootball.databinding.ActivityDetailBinding
import br.com.joaobosco.appfootball.model.Match
import br.com.joaobosco.appfootball.util.Constants.Companion.EXTRA_MATCH
import com.bumptech.glide.Glide

/**
 * Created by João Bosco on 05/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        loadMatchFromExtra()
    }

    private fun loadMatchFromExtra() {
        intent?.extras?.getParcelable<Match>(EXTRA_MATCH)?.let { match ->
            Glide.with(this).load(match.place.image).into(binding.ivPlace)
            supportActionBar?.title = match.place.name

            binding.tvDescription.text = match.description

            Glide.with(this).load(match.homeTeam.image).into(binding.imgHomeTeam)
            binding.rbHomeTeamStars.rating = match.homeTeam.stars.toFloat()
            binding.tvHomeTeamName.text = match.homeTeam.name
            if (match.homeTeam.score != null) {
                binding.tvHomeTeamScore.text = match.homeTeam.score.toString()
            }

            Glide.with(this).load(match.awayTeam.image).into(binding.imgAwayTeam)
            binding.rbAwayTeamStars.rating = match.awayTeam.stars.toFloat()
            binding.tvAwayTeamName.text = match.awayTeam.name
            if (match.awayTeam.score != null) {
                binding.tvAwayTeamScore.text = match.awayTeam.score.toString()
            }
        }
    }

}