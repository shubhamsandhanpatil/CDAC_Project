package comEmergency.Management.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import comEmergency.Management.demo.Entity.user;
import comEmergency.Management.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	 @PostMapping("/user")    //add new user 
	 public user saveuser(@RequestBody user user ) {
		return userService.saveuser(user);
		}
	 
	 @GetMapping("/users") //get all user
	    public List<user> fetchUserList()
	    {
	        return userService.fetchuserList();
	    }
	    
	    @PutMapping("/user/{id}")
	    public user
	    updateuser(@RequestBody user user,
	                     @PathVariable("id") Integer userID)
	    {
	        return userService.updateuser(user, userID);
	    }
	 // Delete operation
	    @DeleteMapping("/user/{id}")
	    public String deleteDepartmentById(@PathVariable("id")
	                                       Integer userId)
	    {
	        userService.deleteuserById(userId);
	        return "Deleted Successfully";
	    }
}
