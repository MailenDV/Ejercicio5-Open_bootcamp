package poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

public class cocheCRUDV1 {

    //Estructura de datos
    private List<coche> coches = new ArrayList<>();


    //OPERACIONES CRUD

    // CREATE - guardar un coche

    public void save(coche coche){

        coches.add(coche);
    }

    public List<coche> findAll(){
        return coches;
    }

}
