package comEmergency.Management.demo.service;

import java.util.List;

import comEmergency.Management.demo.Entity.admin;
import comEmergency.Management.demo.Entity.incident;

public interface IncidentService {

	
	// Save operation
    incident saveincident(incident incident);
 
    // Read operation
    List<incident> fetchincidentList();
 
    // Update operation
    incident updateincident(incident incident,Integer idincident);
 
    // Delete operation
    void deletincidentById(Integer idincident);
    
    //find by Id
   Integer findByincident(incident incident);
}
