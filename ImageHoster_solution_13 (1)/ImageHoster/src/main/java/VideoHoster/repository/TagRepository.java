package VideoHoster.repository;

import VideoHoster.model.Tag;
import org.springframework.stereotype.Repository;

@Repository
public abstract class TagRepository implements TagRepo {




    public Tag findbyTag(String tagName) {
        return findbyTag(tagName);
    }
}
