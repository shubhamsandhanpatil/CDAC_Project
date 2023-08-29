package comEmergency.Management.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
@Table(name = "incident")
public class incident {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idIncident;
	private String Description;
	private String location;
	private String severity;
	private String status;
	
	public incident() {
		super();
	}
	public Integer getIdIncident() {
		return idIncident;
	}
	public void setIdIncident(Integer idIncident) {
		this.idIncident = idIncident;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public incident(Integer idIncident, String description, String location, String severity, String status) {
		super();
		this.idIncident = idIncident;
		Description = description;
		this.location = location;
		this.severity = severity;
		this.status = status;
	}
	
}
