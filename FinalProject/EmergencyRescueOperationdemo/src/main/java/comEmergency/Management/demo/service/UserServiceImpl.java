package comEmergency.Management.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comEmergency.Management.demo.Entity.admin;
import comEmergency.Management.demo.Entity.user;
import comEmergency.Management.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public user saveuser(user user) {
		return userRepository.save(user);
	}

	@Override
	public List<user> fetchuserList() {
		return (List<user>)userRepository.findAll();
	}

	@Override
	public user updateuser(user user, Integer iduser) {
		user userDB = userRepository.findById(iduser).get();
		 if (Objects.nonNull(user.getName())
		            && !"".equalsIgnoreCase(
		            		user.getName())) {
			 userDB.setName(user.getName());
		        }
		 
		 if (Objects.nonNull(user.getPassword())
		            && !"".equalsIgnoreCase(
		            		user.getPassword())) {
			 userDB.setPassword(user.getPassword());
		        }
		return userRepository.save(userDB);
	}

	@Override
	public void deleteuserById(Integer iduser) {
		// TODO Auto-generated method stub
		userRepository.deleteById(iduser);
	}

	@Override
	public user findByuser(user user) {
		// TODO Auto-generated method stub
		return null;
	}

}
