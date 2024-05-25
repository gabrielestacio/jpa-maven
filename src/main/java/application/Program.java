package application;

import domain.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {
    public static void main(String[] args) {
        Person p1 = new Person(null, "Carlos da Silva", "carlos@gmail.com");
        Person p2 = new Person(null, "Joaquim Torres", "joaquim@gmail.com");
        Person p3 = new Person(null, "Ana Maria", "ana@gmail.com");

        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-maven")) {
            EntityManager em = emf.createEntityManager();

            //Inserir dados
            /*em.getTransaction().begin();
            em.persist(p1);
            em.persist(p2);
            em.persist(p3);
            em.getTransaction().commit();*/

            //Buscar dados
            /*Person p = em.find(Person.class, 2);
            System.out.printf(p.toString());*/

            //Remover dados
            /*em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();*/

            em.close();
        }
    }
}
