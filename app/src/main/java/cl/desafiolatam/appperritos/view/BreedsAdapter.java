package cl.desafiolatam.appperritos.view;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.desafiolatam.appperritos.R;

public class BreedsAdapter extends RecyclerView.Adapter<BreedsAdapter.BreedsVH> {

    private static final String TAG = "Repository";


    private List<String> breeds;

    public BreedsAdapter(List<String> breeds) {
        this.breeds = breeds;
    }

    @NonNull
    @Override
    public BreedsVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);

        return new BreedsVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BreedsAdapter.BreedsVH holder, int position) {

        String breedsOfList = breeds.get(position);
        Log.d(TAG, "onBindViewHolder: "+ breedsOfList);
        holder.bind(breedsOfList);

    }

    @Override
    public int getItemCount() {
        return breeds.size();
    }

    public void update (List<String> breedsOfList) {
        breeds.clear();
        breeds.addAll(breedsOfList);
        notifyDataSetChanged();
    }

    public class BreedsVH extends RecyclerView.ViewHolder {
        private TextView txBreeds;
        public BreedsVH(@NonNull View itemView) {
            super(itemView);
            txBreeds = itemView.findViewById(R.id.textView);
        }

        public void bind(String b ){

            txBreeds.setText(b);
        }
    }


}
