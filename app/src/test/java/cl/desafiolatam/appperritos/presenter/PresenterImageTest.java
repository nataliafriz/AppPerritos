package cl.desafiolatam.appperritos.presenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import cl.desafiolatam.appperritos.model.ImageBreeds;
import cl.desafiolatam.appperritos.view.ImageAdapter;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class PresenterImageTest {

    @Mock
    PresenterViewImage presenterViewImage;
    PresenterImage presenterImage;


    @Before
    public void setUp() throws Exception {
      /*  MockitoAnnotations.openMocks(this);
       presenterImage = new PresenterImage (presenterViewImage);*/

    }

    @Test
    public void showInfo() {
      /*  //GIVEN
        List<String> message = null;
        //WHEN
        presenterImage.showInfoImage(message);
        //THEN
        Mockito.verify(viewImage,Mockito.times(1)).showInfoImage(null);
*/
    }

    @Test
    public void showInfoImage() {
    }
}