package com.tg8.repo;

import com.tg8.entity.TUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by penny19 on 15/11/24.
 */
public interface UserRepository extends JpaRepository<TUser, Integer> {

}
