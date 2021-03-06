package cn.edu.kmust.store.user.repository;

import cn.edu.kmust.store.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    User findUserByName(String name);

    User findUserByNameAndPassword(String name,String password);

}
