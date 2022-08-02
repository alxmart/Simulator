package me.dio.simulator.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.dio.simulator.data.MatchesAPI;
import me.dio.simulator.databinding.ActivityMainBinding;
import me.dio.simulator.domain.Team;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MatchesAPI matchesAPI;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        


        setupHttpClient();
        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();

    }

    private void setupHttpClient() {
    // Tudo que o Retrofit precisa para funcionar
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://alxmart.github.io/matches-simulator-api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MatchesAPI = retrofit.create(MatchesAPI.class);
    }

    private void setupMatchesList() {

        // TODO listar as partidas consumindo a nossa API

    }

    private void setupMatchesRefresh() {

        // TODO Atualizar as partidas no Swipe
    }

    private void setupFloatingActionButton() {

        // TODO: Criar evento para click e simular partidas


    }
}
