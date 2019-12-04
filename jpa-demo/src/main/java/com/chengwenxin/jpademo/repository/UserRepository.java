package com.chengwenxin.jpademo.repository;

import com.chengwenxin.jpademo.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value = "select * from user where id = ?1",nativeQuery = true)
    User findUserById(Long id);

    @Query(value = "select * from user",nativeQuery = true)
    Page<User> findUserByPage(Pageable pageable);
}
