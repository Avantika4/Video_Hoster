package VideoHoster.service;

import VideoHoster.model.Tag;
import VideoHoster.repository.TagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TagService {
    @Autowired
    private TagRepo tagRepo;

   public Tag getbyTagname(String tittle)
   {
    return  tagRepo.findbyTag(tittle);
   }

    public Tag createTag(Tag tag) {
        try{
            tagRepo.save(tag);
            return  tag;
        }
        catch (Exception e)
        {
            return null;
        }
    }
}
