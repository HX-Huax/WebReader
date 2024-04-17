package com.bluestar.WebReader.repository;

import com.bluestar.WebReader.domain.User;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findByUname(String uname);

    User findByUnameAndPassword(String uname,String password);
}
