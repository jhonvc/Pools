package com.example.tecsup.pools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.tecsup.pools.Entidades.Question;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://172.23.8.251:8000/polls/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        pollsInterface servicios=retrofit.create(pollsInterface.class);
        Call<List<Question>>call=servicios.ListarPreguntas();
        call.enqueue(new Callback<List<Question>>() {
            @Override
            public void onResponse(Call<List<Question>> call, Response<List<Question>> response) {
                for(Question q :  response.body())
                    Log.e("Question", q.question_text);
            }

            @Override
            public void onFailure(Call<List<Question>> call, Throwable t) {
                Log.e("Error",t.toString());

            }
        });
        Call<Question> call1 = servicios.CrearPregunta("Profe supenda las clases en hallowen XD");
        call1.enqueue(new Callback<Question>() {
            @Override
            public void onResponse(Call<Question> call, Response<Question> response) {

            }

            @Override
            public void onFailure(Call<Question> call, Throwable t) {

            }
        });
    }
}
