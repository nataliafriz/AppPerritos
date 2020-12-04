package cl.desafiolatam.appperritos.model;

import java.util.List;
import java.util.Map;

public class ListBreeds {

    private Map<String, ListBreeds> message;
    private String status;

    public ListBreeds(Map<String, ListBreeds> message, String status) {
        this.message = message;
        this.status = status;
    }

    public Map<String, ListBreeds> getMessage() {
        return message;
    }

    public void setMessage(Map<String, ListBreeds> message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "ListBreeds{" +
                "message='" + message + '\'' +
                ", status" + status +
                '}';

    }
}
