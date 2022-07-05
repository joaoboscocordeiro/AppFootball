package br.com.joaobosco.appfootball.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.joaobosco.appfootball.databinding.ActivityDetailBinding

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
    }

}