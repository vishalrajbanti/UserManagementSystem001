package com.example.UserManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    List<User> UserList;

    //create user
    // add a user
    @PostMapping ("user")
    public String addUser(@RequestBody User myuser){
        UserList.add(myuser);
        return "user added";
    }
     // get userid
    @GetMapping("user/id/userid/{Id}")
    public String getId(@PathVariable Integer Id) {
        for (User user1 : UserList) {
            if (user1.getUserId().equals(Id)) {
                return "user id exist is" + Id;
            }

        }
        return "invalid Id";
    }
    // get all user
    @GetMapping("users")
    public List<User> getAllUser(){
        return UserList;
    }
    //update userinfo
        @PutMapping("user/number/{id}/num")
public String UpdateUserNumber(@PathVariable Integer id,@RequestParam String num) {
            for (User user : UserList) {
                if (user.getUserId().equals(id)) {
                    user.setPhoneNumber(num);
                    return "user :" + num + "updated";
                }

            }
            return "user id invalid can't update number";
        }

    //delete user
    @DeleteMapping("user/del/{id}")
    public String removeUserUserById(@PathVariable Integer id){
        for(User user : UserList){
            if(user.getUserId().equals(id)){
                UserList.remove(user);
                return "userId :" + id + "removed";
            }
        }
        return "Invalid userId";
    }
}
