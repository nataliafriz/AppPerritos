package cl.desafiolatam.appperritos.view;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.desafiolatam.appperritos.model.ListBreeds;

public class BreedsAdapter extends RecyclerView.Adapter<BreedsAdapter.BreedsVH> {

    private List<ListBreeds> listBreeds;

    @NonNull
    @Override
    public BreedsVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BreedsAdapter.BreedsVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listBreeds.size();
    }

    public class BreedsVH extends RecyclerView.ViewHolder {

        public BreedsVH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
