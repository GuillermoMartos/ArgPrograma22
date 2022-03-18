package practica1.services;

import practica1.models.Fabrica;

public class MakeAuto implements TaskAuto {

    @Override
    public void registrar(Fabrica auto) {
        System.out.println(auto + " creado");
        
    }
    
}
