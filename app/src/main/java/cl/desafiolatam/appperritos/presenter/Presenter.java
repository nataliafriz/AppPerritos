package cl.desafiolatam.appperritos.presenter;

import cl.desafiolatam.appperritos.model.ImageBreeds;
import cl.desafiolatam.appperritos.model.ListBreeds;

public class Presenter {
    ImageBreeds imageBreeds;
    ListBreeds listBreeds;
    PresenterView view;

    public Presenter(ImageBreeds imageBreeds, ListBreeds listBreeds, PresenterView view) {
        this.imageBreeds = imageBreeds;
        this.listBreeds = listBreeds;
        this.view = view;
    }

}

