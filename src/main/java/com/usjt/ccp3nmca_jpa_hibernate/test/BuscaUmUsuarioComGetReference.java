package com.usjt.ccp3nmca_jpa_hibernate.test;

import com.usjt.ccp3nmca_jpa_hibernate.model.JPAUtil;
import com.usjt.ccp3nmca_jpa_hibernate.model.Usuario;

import javax.persistence.EntityManager;

public class BuscaUmUsuarioComGetReference {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        Usuario u = manager.getReference(Usuario.class, 1L);
        System.out.println("Já executou a query?");
        System.out.println(u);
        System.out.println("E agora?");
        manager.close();
        JPAUtil.close();
    }
}
