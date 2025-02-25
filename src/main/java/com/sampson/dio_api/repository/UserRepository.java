package com.sampson.dio_api.repository;

import com.sampson.dio_api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(User user){
        if(user.getId()==null){
            System.out.println("SAVE");
        } else {
            System.out.println("UPDATE");
        }
        System.out.println(user);
    }

    public void deleteById(Long id){
        System.out.printf("DELETE/id: %d%n",id);
    }

    public List<User> findAll(){
        System.out.println("LIST");
        List<User> users = new ArrayList<>();
        users.add(new User(1L,"Joao","password"));
        users.add(new User(2L, "maria", "password"));
        return users;
    }

    public User findById(Long id){
        System.out.printf("Find/id: %d%n",id);
        return new User(1L,"Joao","password");
    }

    public User findByUsername(String name){
        System.out.println("Find/username: " + name);
        return new User(1L,"Joao","password");
    }


}
