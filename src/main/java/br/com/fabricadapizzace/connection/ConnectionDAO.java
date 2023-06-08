package br.com.fabricadapizzace.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionDAO<T> {
    public EntityManager getEntityManager(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PIZZARIA_PU");
        return entityManagerFactory.createEntityManager();
    }

    public T salvar(T objeto){
        EntityManager entityManager = this.getEntityManager();

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
        }

        entityManager.close();

        return objeto;

    }

    public T encontrar(T objeto, Long id){
        EntityManager entityManager = this.getEntityManager();

        T t = (T) entityManager.find(objeto.getClass(), id);

        entityManager.close();

        return t;

    }

//    public T atualizar(T objetoAtualizado, Long id){
//        EntityManager entityManager = this.getEntityManager();
//
//
//
//        try {
//
//            T objetoEncontrado = this.encontrar(objetoAtualizado, id);
//
//            objetoEncontrado = objetoAtualizado;
//
//            entityManager.getTransaction().begin();
//
//
//
//
//        }catch (Exception e){
//
//        }
//
//
//    }

    public void deletar(T objeto){
        EntityManager entityManager = this.getEntityManager();

        try {

            entityManager.getTransaction().begin();

            entityManager.remove(objeto);

            entityManager.getTransaction().commit();

        } catch (Exception e) {

            entityManager.getTransaction().rollback();

        }

        entityManager.close();

    }


}
