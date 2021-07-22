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
@Table(name = "employers")
@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor

public class Employer extends User{
		
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "web_site")
	private String webSite;
	
	@Column(name = "verify")
	private boolean verify;
	
	@Column(name = "user_confirm")
	private boolean userConfirm;

	public Employer(String email,String password,String companyName, String phoneNumber, String webSite, boolean verify, boolean userConfirm) {
		super(email,password);
		this.companyName = companyName;
		this.phoneNumber = phoneNumber;
		this.webSite = webSite;
		this.verify = verify;
		this.userConfirm = userConfirm;
	}
	
	
}
