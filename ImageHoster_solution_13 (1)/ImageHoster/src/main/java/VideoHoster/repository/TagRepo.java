package VideoHoster.repository;

import VideoHoster.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepo extends JpaRepository<Tag,Integer> {
    @Query("SELECT t from Tag t where t.name =:tagName")
    public  Tag findbyTag(String tagName);

}
