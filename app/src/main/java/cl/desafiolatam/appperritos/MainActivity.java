package cl.desafiolatam.appperritos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.appperritos.databinding.ActivityMainBinding;
import cl.desafiolatam.appperritos.model.Repository;
import cl.desafiolatam.appperritos.presenter.Presenter;
import cl.desafiolatam.appperritos.presenter.PresenterView;
import cl.desafiolatam.appperritos.view.BreedsAdapter;


public class MainActivity extends AppCompatActivity implements PresenterView {

  //  private static final String TAG = "Repository";

    private Presenter presenter;
    private BreedsAdapter adapter;
    private RecyclerView recyclerview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this, new Repository());
        adapter=new BreedsAdapter(new ArrayList<>());
        recyclerview=findViewById(R.id.recyclerBreeds);
        recyclerview.setLayoutManager(new LinearLayoutManager(getParent()));
        recyclerview.setAdapter(adapter);

    }

    @Override
    public void showInfo(List<String> breedOfList) {
      //  Log.d(TAG, "showInfo: Mostrando la info en Main Activity" + breedOfList.toString());
        adapter.update(breedOfList);
    }
}