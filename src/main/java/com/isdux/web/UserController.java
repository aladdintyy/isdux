package com.isdux.web;

import com.isdux.mapper.datasource.UserRoleMapper;
import com.isdux.model.datasource.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired(required = false)
    private UserRoleMapper userRoleMapper;
	
    //	@RequestMapping("/getUsers")
    //	public List<User> getUsers() {
    //		List<User> users=user1Mapper.getAll();
    //		return users;
    //	}
    //
    //    @RequestMapping("/getUserOne")
    //    public User getUserOne() {
    //        User user = user2Mapper.getOne((long) 2);
    //        return user;
    //    }
    //
    //    @RequestMapping("/getUser")
    //    public User getUser(Long id) {
    //    	User user=user2Mapper.getOne(id);
    //        return user;
    //    }

    @RequestMapping("/getRole")
    public UserRole getRole() {
        UserRole userRole=userRoleMapper.selectByPrimaryKey("1");
        return userRole;
    }

    //    @RequestMapping("/add")
    //    public void save(User user) {
    //        user2Mapper.insert(user);
    //    }
    //
    //    @RequestMapping(value="update")
    //    public void update(User user) {
    //        user2Mapper.update(user);
    //    }
    //
    //    @RequestMapping(value="/delete/{id}")
    //    public void delete(@PathVariable("id") Long id) {
    //        user1Mapper.delete(id);
    //    }
}