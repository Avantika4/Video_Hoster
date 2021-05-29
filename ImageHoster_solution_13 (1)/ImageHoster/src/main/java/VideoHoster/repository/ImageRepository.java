package VideoHoster.repository;

import VideoHoster.model.Image;
import org.springframework.stereotype.Repository;

//The annotation is a special type of @Component annotation which describes that the class defines a data repository
@Repository
public abstract class ImageRepository implements VideoRepo {

    public Image getImageByTitle(String title){
        return getImageByTitle(title);
    }




}
