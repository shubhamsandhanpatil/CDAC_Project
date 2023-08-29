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

import comEmergency.Management.demo.Entity.incident;
import comEmergency.Management.demo.service.IncidentService;

@RestController
public class IncidentControll {

	@Autowired
	private IncidentService incidentService;

@PostMapping("/AddIncident")    //add new user 
 public incident Creataincident(@RequestBody incident incident ) {
	return incidentService.saveincident(incident);
	}
 
 @GetMapping("/Incidentlist") //get all user
    public List<incident>ListOfincident()
    {
    	return incidentService.fetchincidentList();
    }
    @PutMapping("/UpdateIncident/{id}")
    public incident
    updateuser(@RequestBody incident incident,
                     @PathVariable("id") Integer incidentID)
    {
        return incidentService.updateincident(incident, incidentID)  ;  
        	
    }
    @DeleteMapping("/Incident/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Integer incidentID)
    {
    	incidentService.deletincidentById(incidentID);
        return "Deleted Successfully";
    }
}
