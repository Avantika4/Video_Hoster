package VideoHoster.repository;

import VideoHoster.model.User;
import org.springframework.stereotype.Repository;

//The annotation is a special type of @Component annotation which describes that the class defines a data repository\

@Repository
public abstract class UserRepository implements UserRepo {

    public User finduserbyUsername(String user)
    {
        return finduserbyUsername(user);
    }
}