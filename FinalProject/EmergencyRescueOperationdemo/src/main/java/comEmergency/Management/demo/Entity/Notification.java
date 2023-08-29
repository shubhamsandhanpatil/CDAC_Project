package comEmergency.Management.demo.Entity;


	import java.time.LocalDateTime;

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

public class Notification {

		    @Id
		    @GeneratedValue(strategy = GenerationType.AUTO)
		    private Integer NotificationId;
		    private String Message;
		    private Integer RecipientUserId;
		    private LocalDateTime Time; 
		    private String Status;
		   
		    
	}



