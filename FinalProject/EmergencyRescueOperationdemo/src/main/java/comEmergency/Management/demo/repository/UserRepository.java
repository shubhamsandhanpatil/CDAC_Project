package comEmergency.Management.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comEmergency.Management.demo.Entity.user;
@Repository
public interface UserRepository   extends JpaRepository<user, Integer>{

}
