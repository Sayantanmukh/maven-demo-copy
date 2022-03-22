package manen.demo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDemo {
	public static void main(String[] args) {

		System.out.println("Start");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = factory.createEntityManager();

		Employee emp1 = new Employee(101, "Sonu", 50000);
		Employee emp2 = new Employee(102, "Gonu", 60000);
		Employee emp3 = new Employee(103, "Tonu", 55000);

		em.getTransaction().begin();

//		em.persist(emp1); // insert
//		em.persist(emp2); // insert
//		em.persist(emp3); // insert
//		em.merge(emp); // update
//		em.remove(emp); // delete
		
		emp2.setSalary(65000);
		em.merge(emp2);
		
		Employee empData = em.find(Employee.class, 101); // select
		em.getTransaction().commit();
		System.out.println(emp2.toString());
		System.out.println("End");
		

	}

}
