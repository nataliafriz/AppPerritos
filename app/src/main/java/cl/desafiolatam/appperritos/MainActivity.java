package cl.desafiolatam.appperritos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.appperritos.model.Repository;
import cl.desafiolatam.appperritos.presenter.Presenter;
import cl.desafiolatam.appperritos.presenter.PresenterView;
import cl.desafiolatam.appperritos.presenter.PresenterViewImage;
import cl.desafiolatam.appperritos.view.BreedsAdapter;


public class MainActivity extends AppCompatActivity implements PresenterView, PresenterViewImage {

  //  private static final String TAG = "Repository";

    private Presenter presenter;
    private BreedsAdapter adapter;
    private RecyclerView recyclerview;
  //  private PresenterImage presenterImage;
  //  private ImageAdapter imageAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  presenterImage = new PresenterImage(this, new Repository());
        presenter = new Presenter(this, new Repository());
        adapter = new BreedsAdapter(new ArrayList<>());
     //   imageAdapter = new ImageAdapter(new ArrayList<>());
        recyclerview = findViewById(R.id.recyclerView);
        recyclerview.setLayoutManager(new LinearLayoutManager(getParent()));
        recyclerview.setAdapter(adapter);
   //     recyclerview.setAdapter(imageAdapter);

    }

    @Override
    public void showInfo(List<String> breedOfList) {
      //  Log.d(TAG, "showInfo: Mostrando la info en Main Activity" + breedOfList.toString());
        adapter.update(breedOfList);
    }

    @Override
    public void showInfoImage(List<String> imageListBreeds) {
    //  imageAdapter.update(imageListBreeds);
    }
}