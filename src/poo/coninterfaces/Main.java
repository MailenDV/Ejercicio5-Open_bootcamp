package poo.coninterfaces;

import poo.sininterfaces.coche;

public class Main {

    static CocheCRUD cocheCRUD;

    public static void main(String[] args){

        cocheCRUD.findAll();
        cocheCRUD.save(new coche());

    }
}
