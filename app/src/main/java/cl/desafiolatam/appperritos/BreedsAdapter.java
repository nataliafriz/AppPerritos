package cl.desafiolatam.appperritos;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.desafiolatam.appperritos.model.ListBreeds;

public class BreedsAdapter extends RecyclerView.Adapter<BreedsAdapter.DogVH> {

    List<ListBreeds> listBreeds;
    Context context;

    public BreedsAdapter(List<ListBreeds> listBreeds,Context context) {
        this.listBreeds = listBreeds;
        this.context = context;
    }


    @NonNull
    @Override
    public DogVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DogVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class DogVH extends RecyclerView.ViewHolder {

        public DogVH(@NonNull View itemView) {
            super(itemView);
        }
    }
    }

