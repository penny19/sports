package badminton.entity;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by penny19 on 15/11/24.
 */
public interface UserRepository extends JpaRepository<TUser, Integer> {

}
