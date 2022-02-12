package onetomanyrelation;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "vendor")
public class Vendor {
	
	@Id
	@Column(name = "vid")
	private int vendorId;
	
	@Column(name = "vname")
	private String vendorName;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Customer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "fkvid", referencedColumnName = "vid")
	 
	private Set obj;

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public Set getObj() {
		return obj;
	}

	public void setObj(Set obj) {
		this.obj = obj;
	}
	
}
