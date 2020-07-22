package com.karting.backend.repository;

import com.karting.backend.documents.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, Serializable> {

    @RestResource(path = "name", rel = "name")
    public List<User> findByName(@Param("name")String name);

    @RestResource(path = "delete", rel = "delete")
    public long deleteByName(@Param("name")String name);

}
