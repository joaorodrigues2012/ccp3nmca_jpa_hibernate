package com.usjt.ccp3nmca_jpa_hibernate.test;

import com.usjt.ccp3nmca_jpa_hibernate.model.JPAUtil;
import com.usjt.ccp3nmca_jpa_hibernate.model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteInsereUmUsuario {

    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        Usuario u = new Usuario();

        u.setNome("Ana");
        u.setFone("123456789");
        u.setEmail("ana@usjt.br");
        manager.persist(u);
        transaction.commit();
    }

}
