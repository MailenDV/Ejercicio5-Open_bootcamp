package poo.coninterfaces;

import poo.sininterfaces.coche;

import java.util.List;

public class CocheCRUDMySQL implements CocheCRUD, CocheReader{
    @Override
    public void save(coche coche) {

    }

    @Override
    public List<coche> findAll() {
        return null;
    }

    @Override
    public void delete(coche coche) {

    }
}
