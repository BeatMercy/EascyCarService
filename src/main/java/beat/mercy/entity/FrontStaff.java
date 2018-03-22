package beat.mercy.entity;

import javax.persistence.Entity;

@Entity
public class FrontStaff extends Staff {

	private String comNom;

	public String getComNom() {
		return comNom;
	}

	public void setComNom(String comNom) {
		this.comNom = comNom;
	}
	
	
}
