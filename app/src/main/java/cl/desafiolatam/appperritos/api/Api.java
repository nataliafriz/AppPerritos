package cl.desafiolatam.appperritos.api;

import cl.desafiolatam.appperritos.model.ImageBreeds;
import cl.desafiolatam.appperritos.model.Breeds;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("breeds/list/")
    Call <Breeds> getAllBreeds();
    @GET("breed/{breed}/images/")
    Call <ImageBreeds> getImageBreeds();
}
