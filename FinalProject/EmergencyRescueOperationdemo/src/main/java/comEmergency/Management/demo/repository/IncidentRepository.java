package comEmergency.Management.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import comEmergency.Management.demo.Entity.incident;

public interface IncidentRepository  extends JpaRepository<incident, Integer> {

}
