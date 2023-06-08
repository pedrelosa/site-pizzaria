package br.com.fabricadapizzace.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inicializacao {

    protected static EntityManagerFactory entityManagerFactory;
    protected static EntityManager entityManager;

    public static void setupBeforeClass(){
        entityManagerFactory = Persistence.createEntityManagerFactory("PIZZARIA_PU");
    }

    public static void tearDownAfterClass(){
        entityManagerFactory.close();
    }

    public void setup(){
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void tearDown(){
        entityManager.close();
    }


}
