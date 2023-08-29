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
public class NotificationController {
	@Autowired 
	private AdminService adminService;
	
	// Save operation
    @PostMapping("/GiveNotificayion")
    public admin saveDepartment(
     @RequestBody admin admin)
    {
        return adminService.saveadmin(admin);
    }
	
 // Read operation
    @GetMapping("/notificationlist")
    public List<admin> fetchDepartmentList()
    {
        return adminService.fetchadminList();
    }

}
