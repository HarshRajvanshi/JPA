package JPA_LAB;
import javax.persistence.*;
import com.Ticket;
import com.Person;
import com.Employee;
import com.Student;


public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
		EntityManagerFactory em = Persistence.createEntityManagerFactory("LabPU");
		EntityManager entityManager=em.createEntityManager();
		Ticket t=new Ticket("Delhi","Manali",200.0f,121220);
		
		Student s=new Student("Harsh", 400, 3);
		
		Person p=new Person("naam","naam@surname.com",9953270104l);
		
		Employee e=new Employee("raghubir","development","developer");
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(t);
		entityManager.persist(s);
		entityManager.persist(p);
		entityManager.persist(e);
		entityManager.flush();
		entityManager.getTransaction().commit();
	}
}
