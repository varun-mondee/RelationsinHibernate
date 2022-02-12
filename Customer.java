package onetoonerelation;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "cid")
	private int CustomerId;
	
	@Column(name = "customername")
	private String customerName;

	@OneToOne(fetch = FetchType.LAZY, targetEntity = Vendor.class, cascade = CascadeType.ALL)

	private Vendor vendor;
	
	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	

}
