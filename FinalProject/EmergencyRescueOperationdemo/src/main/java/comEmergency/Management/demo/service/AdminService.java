package comEmergency.Management.demo.service;

import java.util.List;

import comEmergency.Management.demo.Entity.admin;

public interface AdminService {

	// Save operation
    admin saveadmin(admin admin);
 
    // Read operation
    List<admin> fetchadminList();
 
    // Update operation
    admin updateadmin(admin admin,Integer idAdmin);
 
    // Delete operation
    void deleteadminById(Integer idAdmin);
    
    //find by Id
   Integer findByAdmin(admin admin);
}
