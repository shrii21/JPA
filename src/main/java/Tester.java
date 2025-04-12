import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Tester {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=factory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee=new Employee();
		employee.setName("farhan");
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
		
	}

}
