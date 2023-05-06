package poo.coninterfaces;

import poo.sininterfaces.coche;

import java.util.List;

// se declaran los metodos, no se implementan
public interface CocheCRUD {

    void save(coche coche);

    List<coche> findAll();

    void delete(coche coche);
}
