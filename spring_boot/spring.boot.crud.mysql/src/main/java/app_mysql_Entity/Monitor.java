package app_mysql_Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="monitor")
public class Monitor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

}
