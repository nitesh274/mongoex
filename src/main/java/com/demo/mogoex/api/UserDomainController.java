package com.demo.mogoex.api;

import com.demo.mogoex.model.UserDomain;
import com.demo.mogoex.repository.UserDomainRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserDomainController {

    @Autowired
    private UserDomainRepo repo;
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @PostMapping("create")
    public UserDomain postUsers(@RequestBody UserDomain domain) {
        LOG.info("posting  users.");
        return repo.save(domain);
    }

    @GetMapping("fetch")
    public List<UserDomain> getAllUsers() {
        LOG.info("Getting all users.");
        return repo.findAll();
    }

    @GetMapping("fetch/{name}")
    public List<UserDomain> getbyUsername(@PathVariable String name) {
        LOG.info("Getting  user by name");
        return repo.findByName(name);
    }

}
