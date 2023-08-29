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
	@NoArgsConstructor
	@AllArgsConstructor
	@Builder

public class Resource {

		    @Id
		    @GeneratedValue(strategy = GenerationType.AUTO)
		    private Integer ResourceId;
		    private String  Name;
		    private Integer Quantity;
		    private Boolean  Availability;
		    
	}

