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

    public List<String> loadInfo() {
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
        return null;
    }

    public void loadInfoImage () {
       /* RetrofitClient.getRetrofitInstance().getImageBreeds().enqueue(new Callback<ImageBreeds>() {
            @Override
            public void onResponse(Call<ImageBreeds> call, Response<ImageBreeds> response1) {
                Log.d(TAG, "onResponse: image " + response1.body());
                List<String> imageListBreeds = new ArrayList<>();
                imageListBreeds.add(response1.body().getStatusImage());
                presenterRepository.showInfoImage(imageListBreeds);

            }

            @Override
            public void onFailure(Call<ImageBreeds> call, Throwable x) {
                Log.d(TAG, "onFailure: " + x.toString());


            }
        });*/
    }
}

