package JPA_LAB;
import java.util.*;
import javax.persistence.*;
import com.*;





public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
		EntityManagerFactory em = Persistence.createEntityManagerFactory("LabPU");
		EntityManager entityManager=em.createEntityManager();
		Ticket t=new Ticket("Delhi","Manali",200.0f,121220);
		
		//Student s=new Student("Harsh", 400, 3);
		
		
		Teacher teacher=new Teacher(101, "adhyapak", "Science");
		
		List<Student> studentList=new ArrayList<>();
		studentList.add(new Student(1, "vidyarthi", 3,teacher));
		teacher.setStudentList(studentList);
		
		Person p=new Person("naam","naam@surname.com",9953270104l);
		
		Employee e=new Employee("raghubir","development","developer");
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(t);
		entityManager.persist(teacher);
		entityManager.persist(p);
		entityManager.persist(e);
		entityManager.flush();
		entityManager.getTransaction().commit();
	}
}
