package com.demo.mogoex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Document(collection = "users")

public class UserDomain {



    @Id
    private String userId;
    private String name;
    private String userAccount;
    private String userOrg;

    private List<Address> addresses;
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserOrg() {
        return userOrg;
    }

    public void setUserOrg(String userOrg) {
        this.userOrg = userOrg;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "UserDomain{" +
                "name='" + name + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userOrg='" + userOrg + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
