package openjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("openjpa", System.getProperties());

        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        Person person = new Person();
        person.setName("Ignacio Andreu");
        person.setMail("plunchete AT gmail DOT com");
        em.persist(person);

        em.getTransaction().commit();

        em.close();

	}

}
