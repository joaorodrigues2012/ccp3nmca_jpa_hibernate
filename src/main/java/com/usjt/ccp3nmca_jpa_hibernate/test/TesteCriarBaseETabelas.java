package com.usjt.ccp3nmca_jpa_hibernate.test;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("usjtPU");

    }
}

