package com.usjt.ccp3nmca_jpa_hibernate.test;

import com.usjt.ccp3nmca_jpa_hibernate.model.JPAUtil;
import com.usjt.ccp3nmca_jpa_hibernate.model.Usuario;

import javax.persistence.EntityManager;

public class BuscaUmUsuarioUsandoFind {

    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        Usuario u =manager.find(Usuario.class, 1L);
        System.out.println(u);
        manager.close();
        JPAUtil.close();
    }
}
