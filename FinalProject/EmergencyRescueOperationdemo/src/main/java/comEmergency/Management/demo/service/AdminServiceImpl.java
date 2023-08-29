package comEmergency.Management.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comEmergency.Management.demo.Entity.admin;
import comEmergency.Management.demo.repository.AdminRepository;
@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public admin saveadmin(admin admin) {
		
		return adminRepository.save(admin);
	}

	@Override
	public List<admin> fetchadminList() {
		return (List<admin>)adminRepository.findAll();
	}

	@Override
	public admin updateadmin(admin admin, Integer idAdmin) {
		admin admDB = adminRepository.findById(idAdmin).get();
		 if (Objects.nonNull(admin.getAdminName())
		            && !"".equalsIgnoreCase(
		            		admin.getAdminName())) {
			 admDB.setAdminName(admin.getAdminName());  
			 
		        }
		 
		 if (Objects.nonNull(admin.getAdminPassword())
		            && !"".equalsIgnoreCase(
		            		admin.getAdminPassword())) {
			 admDB.setAdminPassword(admin.getAdminPassword());
		        }
		return adminRepository.save(admDB);
	}
	@Override
	public void deleteadminById(Integer idAdmin) {
    adminRepository.deleteById(idAdmin);
		
	}

	@Override
	public Integer findByAdmin(admin admin) {
		
		return null;
	}

	

}
