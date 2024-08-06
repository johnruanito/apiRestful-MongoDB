package com.rpbp.apiRestMongo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rpbp.apiRestMongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {


    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<User>> findAll(){
        User ruan = new User("1","ruan pablo","ruan@email.com");
        User barbosa = new User("2","Barbosa Pinto","barbosa@email.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(ruan, barbosa));
        return ResponseEntity.ok().body(list);
    }

}
