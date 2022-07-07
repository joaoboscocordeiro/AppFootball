package br.com.joaobosco.appfootball.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.joaobosco.appfootball.data.MatchesRepository
import br.com.joaobosco.appfootball.databinding.ActivityMainBinding
import br.com.joaobosco.appfootball.ui.adapter.MatchesAdapter

/**
 * Created by João Bosco on 06/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
class MainActivity(
    private val repository: MatchesRepository
): AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val matchesAdapter by lazy { MatchesAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();


    }

    private suspend fun setupHttpClient() {
        repository.getMatches()
    }

    private fun setupMatchesList() {

        with(binding.rvMatches) {
            adapter = matchesAdapter
            layoutManager = LinearLayoutManager(context)
            addItemDecoration(
                DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
            )
        }
    }

    private fun setupMatchesRefresh() {
        // TODO: Atualizar as partidas na ação de swipe.
    }

    private fun setupFloatingActionButton() {
        // TODO: Criar evento de click e simulação de partidas.
    }

}