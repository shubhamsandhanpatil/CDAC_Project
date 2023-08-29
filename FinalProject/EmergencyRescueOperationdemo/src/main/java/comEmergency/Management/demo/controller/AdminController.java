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

import comEmergency.Management.demo.Entity.admin;
import comEmergency.Management.demo.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired 
	private AdminService adminService;
	
	// Save operation
    @PostMapping("/admins")
    public admin saveDepartment(
     @RequestBody admin admin)
    {
        return adminService.saveadmin(admin);
    }
	
 // Read operation
    @GetMapping("/admins")
    public List<admin> fetchDepartmentList()
    {
        return adminService.fetchadminList();
    }
	
 // Update operation
    @PutMapping("/admins/{id}")
    public admin
    updateDepartment(@RequestBody admin department,
                     @PathVariable("id") Integer adminId)
    {
        return adminService.updateadmin(
            department, adminId);
    }
 // Delete operation
    @DeleteMapping("/admins/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Integer adminId)
    {
        adminService.deleteadminById(
            adminId);
        return "Deleted Successfully";
    }
    
   
}
