package cl.desafiolatam.appperritos.model;

import java.util.List;

public class ImageBreeds {

    private List<String> messageImage;
    private String statusImage;

    public ImageBreeds(List<String> messageImage, String statusImage) {
        this.messageImage = messageImage;
        this.statusImage = statusImage;
    }

    public List<String> getMessageImage() {
        return messageImage;
    }

    public void setMessageImage(List<String> messageImage) {
        this.messageImage = messageImage;
    }

    public String getStatusImage() {
        return statusImage;
    }

    public void setStatusImage(String statusImage) {
        this.statusImage = statusImage;
    }

    @Override
    public String toString() {
        return "ImageBreeds{" +
                "messageImage=" + messageImage +
                ", statusImage='" + statusImage + '\'' +
                '}';
    }
}
