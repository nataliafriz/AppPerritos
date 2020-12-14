package cl.desafiolatam.appperritos.presenter;

import java.util.List;

import cl.desafiolatam.appperritos.model.PresenterRepository;
import cl.desafiolatam.appperritos.model.Repository;

public class PresenterImage implements PresenterRepository {

    PresenterViewImage viewImage;
    Repository repository;

    public PresenterImage(PresenterViewImage viewImage, Repository repository) {
        this.viewImage = viewImage;
        this.repository = repository;
        repository.setPresenterRepository(this);
        repository.loadInfoImage();
    }

    @Override
    public void showInfo(List<String> breedsOfList) {

    }

    @Override
    public void showInfoImage(List<String> imageListBreeds) {
        viewImage.showInfoImage(imageListBreeds);

    }
}
