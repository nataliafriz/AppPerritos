package cl.desafiolatam.appperritos.model;

import java.util.List;

public interface PresenterRepository {

    void showInfo(List<String> breedsOfList);
    void showInfoImage(List<String> imageListBreeds);

}
