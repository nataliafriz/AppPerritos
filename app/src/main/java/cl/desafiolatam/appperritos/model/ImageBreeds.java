package cl.desafiolatam.appperritos.model;

import java.util.List;

public class ImageBreeds {

    private List<String> image;

    public List<String> getImage() {
        return image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }

    @Override
    public String toString(){
        return "ImageBreeds{" +
                "image=" + image +
                '}';
    }
}
