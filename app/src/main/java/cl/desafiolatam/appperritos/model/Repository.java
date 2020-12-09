package cl.desafiolatam.appperritos.model;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.appperritos.api.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {
    private static final String TAG = "Repository";

    private PresenterRepository presenterRepository;

    public void setPresenterRepository(PresenterRepository presenterRepository) {
        this.presenterRepository = presenterRepository;

    }

    public void loadInfo() {
        RetrofitClient.getRetrofitInstance().getAllBreeds().enqueue(new Callback<Breeds>() {
            @Override
            public void onResponse(Call<Breeds> call, Response<Breeds> response) {
                Log.d(TAG, "onResponse: " + response.body());
                List<String> breedsOfList = new ArrayList<>();
                breedsOfList.add(response.body().getStatus());
                breedsOfList.addAll(response.body().getMessage());
                presenterRepository.showInfo(breedsOfList);
            }

            @Override
            public void onFailure(Call<Breeds> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.toString());
            }
        });
    }

}
