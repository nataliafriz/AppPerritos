package cl.desafiolatam.appperritos.view;

import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


import java.util.List;

import cl.desafiolatam.appperritos.R;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageVH> {

    private static final String TAG = "Repository";



    private List<String> image ;

    public ImageAdapter(List<String> image) {
        this.image = image;
    }
    @NonNull
    @Override
    public ImageVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_image,parent,false);

        return new ImageVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageVH holder, int position) {

        String imagenBreeds = image.get(position);
        Log.d(TAG, "onBindViewHolder: "+ imagenBreeds);
        holder.bind(imagenBreeds);

    }

    @Override
    public int getItemCount() {
        return image.size();
    }
    public void update (List<String> imageBreeds){
        image.clear();
        image.addAll(imageBreeds);
        notifyDataSetChanged();
    }

    public class ImageVH extends RecyclerView.ViewHolder {
        private ImageView imageBreeds;
        private Context context;

        public ImageVH(@NonNull View itemView) {
            super(itemView);
            imageBreeds = itemView.findViewById(R.id.imageBreeds);
        }

        public void bind(String i) {

            Glide.with(context).load(i).into(imageBreeds);
        }
    }
}
