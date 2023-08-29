package comEmergency.Management.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
public class admin {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer idAdmin;
	    private String adminName;
	    private String adminPassword;
	    
		public admin() {
			super();
		}
		public admin(Integer idAdmin, String adminName, String adminPassword) {
			super();
			this.idAdmin = idAdmin;
			this.adminName = adminName;
			this.adminPassword = adminPassword;
		}
		public Integer getIdAdmin() {
			return idAdmin;
		}
		public void setIdAdmin(Integer idAdmin) {
			this.idAdmin = idAdmin;
		}
		public String getAdminName() {
			return adminName;
		}
		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}
		public String getAdminPassword() {
			return adminPassword;
		}
		public void setAdminPassword(String adminPassword) {
			this.adminPassword = adminPassword;
		}
		
	   
}
