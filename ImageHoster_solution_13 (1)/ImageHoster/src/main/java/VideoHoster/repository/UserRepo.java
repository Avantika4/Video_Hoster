package VideoHoster.repository;

import VideoHoster.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    @Query("select u from User u where u.username=:keyword")
    public User finduserbyUsername(String keyword);
}
