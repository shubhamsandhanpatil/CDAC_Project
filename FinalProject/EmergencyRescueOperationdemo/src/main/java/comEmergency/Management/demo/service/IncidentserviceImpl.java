package comEmergency.Management.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comEmergency.Management.demo.Entity.admin;
import comEmergency.Management.demo.Entity.incident;
import comEmergency.Management.demo.repository.IncidentRepository;
@Service
public class IncidentserviceImpl  implements IncidentService{

	@Autowired
	private IncidentRepository incidentRepository;
	@Override
	public incident saveincident(incident incident) {
		return incidentRepository.save(incident);
	}

	@Override
	public List<incident> fetchincidentList() {
		return (List<incident>)incidentRepository.findAll();
	}

	@Override
	public incident updateincident(incident incident, Integer idincident) {
		incident incidentDB = incidentRepository.findById(idincident).get();
		 if (Objects.nonNull(incident.getSeverity())
		            && !"".equalsIgnoreCase(
		            		incident.getSeverity())) {
			 incidentDB.setSeverity(incident.getSeverity());
		        }
		 
		 if (Objects.nonNull(incident.getStatus())
		            && !"".equalsIgnoreCase(
		            		incident.getStatus())) {
			 incidentDB.setStatus(incident.getStatus());  
			
		        }
		return incidentRepository.save(incidentDB);
	}

	@Override
	public void deletincidentById(Integer idincident) {
		// TODO Auto-generated method stub
		incidentRepository.deleteById(idincident);
	}

	@Override
	public Integer findByincident(incident incident) {
		// TODO Auto-generated method stub
		return null;
	}

}
