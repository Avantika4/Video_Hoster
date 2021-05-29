package VideoHoster.repository;

import VideoHoster.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VideoRepo extends JpaRepository<Image,Integer> {

    @Query("SELECT i from Image i where i.title =:title")
    public Image getImageByTitle(String title);

}
