package br.com.fabricadapizzace;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InicializacaoTeste {

    protected static EntityManagerFactory entityManagerFactory;
    protected static EntityManager entityManager;

    @BeforeClass
    public static void setupBeforeClass(){
        entityManagerFactory = Persistence.createEntityManagerFactory("PIZZARIA_PU");
    }

    @AfterClass
    public static void tearDownAfterClass(){
        entityManagerFactory.close();
    }

    @Before
    public void setup(){
        entityManager = entityManagerFactory.createEntityManager();
    }

    @After
    public void tearDown(){
        entityManager.close();
    }


}
