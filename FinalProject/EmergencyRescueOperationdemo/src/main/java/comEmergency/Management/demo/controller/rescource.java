package comEmergency.Management.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import comEmergency.Management.demo.Entity.admin;
import comEmergency.Management.demo.service.AdminService;

@RestController
public class rescource {
	@Autowired 
	private AdminService adminService;
	
	// Save operation
    @PostMapping("/addnewRescource")
    public admin saveDepartment(
     @RequestBody admin admin)
    {
        return adminService.saveadmin(admin);
    }
	
 // Read operation
    @GetMapping("/rescources")
    public List<admin> fetchDepartmentList()
    {
        return adminService.fetchadminList();
    }
    @DeleteMapping("/rescource/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Integer adminId)
    {
        adminService.deleteadminById(
            adminId);
        return "Deleted Successfully";
    }

}
