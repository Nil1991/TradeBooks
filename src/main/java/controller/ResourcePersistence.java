/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Nil
 */
public class ResourcePersistence {
       private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrocaLivros");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
}
