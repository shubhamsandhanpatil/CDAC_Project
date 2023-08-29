package comEmergency.Management.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comEmergency.Management.demo.Entity.admin;

@Repository
public interface AdminRepository extends JpaRepository<admin, Integer> {

}
