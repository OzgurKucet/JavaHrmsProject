package hrmsproject.hrms.entities.concretes;

import java.util.Date;

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
@Table(name = "candidates")
@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Candidate extends User{
		
	@Column(name = "nationality_id")
	private String nationalityId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "birthday_date")
	private Date date;
	
	@Column(name = "verify")
	private boolean verify;

	public Candidate(String email, String password, String nationalityId, String firstName, String lastName, Date date,
			boolean verify) {
		super(email, password);
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.verify = verify;
	}
	
	
}
