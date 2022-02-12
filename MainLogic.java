package onetomanyrelation;
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
	    
	    Customer c2 = new Customer();
	    c2.setCustomerId(102);
	    c2.setCustomerName("kumar");
	    
	    Vendor v1 = new Vendor();
	    v1.setVendorId(201);
	    v1.setVendorName("FlipKart");
	    
        Set s = new HashSet();
        
        s.add(c1);
        s.add(c2);
        
        v1.setObj(s);
        
        session.save(v1);
	    t.commit();  
		session.close();

	}

}
