package com.example.tecsup.pools;

import com.example.tecsup.pools.Entidades.Question;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface pollsInterface {
    @GET("questions/")
    Call<List<Question>> ListarPreguntas();
    @FormUrlEncoded
    @POST("questions/")
    Call<Question>CrearPregunta(@Field("question_text") String question_text);
    @PUT("questions/<id>/")
    Call<Question>ActualizarPregunta(@Path("id")int id,
                                     @Field("question_text")String question_text);
    @DELETE("questions/<id>/")
    Call EliminarPregunta(@Path("id")int id);
}
