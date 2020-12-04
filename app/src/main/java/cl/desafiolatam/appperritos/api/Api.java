package cl.desafiolatam.appperritos.api;

import java.util.List;

import cl.desafiolatam.appperritos.model.ImageBreeds;
import cl.desafiolatam.appperritos.model.ListBreeds;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("breeds/list/")
    Call <List<ListBreeds>> getAllBreeds();
    @GET("breed/{breed}/images/")
    Call <ImageBreeds> getImageBreeds();
}
