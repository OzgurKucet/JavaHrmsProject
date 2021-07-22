package hrmsproject.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Table(name = "employees")
@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Employee extends User{
	
	@Column(name = "first_name")
	private String fistName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "verify")
	private boolean verify;

	public Employee(String email, String password, String fistName, String lastName, boolean verify) {
		super(email, password);
		this.fistName = fistName;
		this.lastName = lastName;
		this.verify = verify;
	}
	
	
	
}
