package com.karting.backend.Repository;

import com.karting.backend.Documents.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, Serializable> {

    @RestResource(path = "name", rel = "name")
    public List<User> findByName(@Param("name")String name);

    @RestResource(path = "delete", rel = "delete")
    public long deleteByNameOrId(@Param("name")String name, @Param("id")String id);

}
