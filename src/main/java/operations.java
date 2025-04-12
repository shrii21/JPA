import java.util.List;

import org.hibernate.query.Query;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class operations {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=factory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee=entityManager.find(Employee.class, 5);
		
		// to display the data 
		Query query=(Query) entityManager.createQuery("from Employee");
		List<Employee> list=query.list();
		for(Employee e:list) {
			System.out.println(e.getName());
		}
		
		
		// to delete the data 
//		entityManager.remove(employee);
//		entityManager.getTransaction().commit();
//		entityManager.close();
//		factory.close();
		
		
		// to update the data -- data will update from the database
//		employee.setName("name update");
//		entityManager.persist(employee);
//		entityManager.getTransaction().commit();
//		entityManager.close();
//		factory.close();
		
		
		// find -to see the data which present on id 4
//		System.out.println("name found is:");
//		System.out.println(employee.getName());
		

	}

}
