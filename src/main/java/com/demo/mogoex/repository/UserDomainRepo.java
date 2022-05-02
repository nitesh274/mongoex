package com.demo.mogoex.repository;

import com.demo.mogoex.model.UserDomain;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserDomainRepo extends MongoRepository<UserDomain, String> {
    List<UserDomain> findByName(String name);
}
