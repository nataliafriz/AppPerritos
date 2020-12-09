package cl.desafiolatam.appperritos.presenter;

import java.util.List;

import cl.desafiolatam.appperritos.model.PresenterRepository;
import cl.desafiolatam.appperritos.model.Repository;

public class Presenter implements PresenterRepository {

    PresenterView view;
    Repository repository;

    public Presenter(PresenterView view, Repository repository) {
        this.view = view;
        this.repository = repository;
        repository.setPresenterRepository(this);
        repository.loadInfo();
    }


    @Override
    public void showInfo(List<String> breedsOfList) {
        view.showInfo(breedsOfList);
    }


}

