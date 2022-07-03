package br.com.joaobosco.appfootball.ui;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import br.com.joaobosco.appfootball.databinding.ActivityMainBinding;

/**
 * Created by João Bosco on 03/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}
