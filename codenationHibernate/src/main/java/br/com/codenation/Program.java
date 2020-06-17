package br.com.codenation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("contas");
        factory.close();
    }
}
