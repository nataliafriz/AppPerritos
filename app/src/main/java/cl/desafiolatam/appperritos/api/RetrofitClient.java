package cl.desafiolatam.appperritos.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final  String BASE_URL = "https://dog.ceo/api/";
    private static Retrofit retrofit;

    private RetrofitClient () {

    }

    public static Api getRetrofitInstance(){
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return  retrofit.create(Api.class);
    }
    }
