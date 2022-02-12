package onetoonerelation;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class MainLogic {

	public static void main(String[] args) {
	
		Session session = HibernateUtil.getSessionFactory().openSession();

	    Transaction t = session.beginTransaction();
	    
	    Customer c1 = new Customer();
	    c1.setCustomerId(101);
	    c1.setCustomerName("varun");
	
	    Vendor vendor = new Vendor();
	    vendor.setVendorId(201);
	    vendor.setVendorName("FlipKart");
	    
               
        session.save(vendor);
	    t.commit();  
		session.close();

	}

}
