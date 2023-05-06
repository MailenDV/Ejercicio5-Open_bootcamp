package poo.sininterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        cocheCRUDV1 cocheCRUDV1 = new cocheCRUDV1();

        coche Ferrari = new coche("Ferrari", "SF-23", 2023, true);
        coche RedBull = new coche("RedBull", "RB-19", 2023, true);
        coche Mercedes = new coche("Mercedes", "W-14", 2023, true);

        System.out.println(Ferrari);

        // guardar coches
        cocheCRUDV1.save(Ferrari);
        cocheCRUDV1.save(RedBull);
        cocheCRUDV1.save(Mercedes);


        // consultar coches
        List<coche> coches = cocheCRUDV1.findAll();
        System.out.println(coches);

         */

        //usamos v2

        cocheCRUDV2 cocheCRUDV2 = new cocheCRUDV2();

        coche Ferrari = new coche("Ferrari", "SF-23", 2023, true);
        coche RedBull = new coche("RedBull", "RB-19", 2023, true);
        coche Mercedes = new coche("Mercedes", "W-14", 2023, true);

        System.out.println(Ferrari);



        // consultar coches
        List<coche> coches = cocheCRUDV2.recuperarCoches();
        System.out.println(coches);

    }
}
