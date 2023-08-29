package comEmergency.Management.demo.service;

import java.util.List;

import comEmergency.Management.demo.Entity.user;

public interface UserService {
	// Save operation
    user saveuser(user user);
 
    // Read operation
    List<user> fetchuserList();
 
    // Update operation
    user updateuser(user user,Integer iduser);
 
    // Delete operation
    void deleteuserById(Integer iduser);
    
    //find by Id
    user findByuser(user user);
}
