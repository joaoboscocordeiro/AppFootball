package br.com.joaobosco.appfootball.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.joaobosco.appfootball.R
import br.com.joaobosco.appfootball.databinding.ActivityMainBinding

/**
 * Created by João Bosco on 04/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    
}