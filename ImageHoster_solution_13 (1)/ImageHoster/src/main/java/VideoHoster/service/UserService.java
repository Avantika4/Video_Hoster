package VideoHoster.service;

import VideoHoster.model.User;
import VideoHoster.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    //Call the registerUser() method in the UserRepository class to persist the user record in the database
    public void registerUser(User newUser) {
        userRepo.save(newUser);
    }

    public User login(User user) {
        User user1=userRepo.finduserbyUsername(user.getUsername());
        if((user1.getPassword()).equals(user.getPassword()))
        {
            return user1;
        }
        else{
            return null;
        }


    }

}
