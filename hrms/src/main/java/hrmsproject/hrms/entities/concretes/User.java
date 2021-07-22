package hrmsproject.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "users")
@Inheritance(strategy=InheritanceType.JOINED)
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")	
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private int id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;

	public User(String email, String password) {		
		this.email = email;
		this.password = password;
	}
	
	
	
}
