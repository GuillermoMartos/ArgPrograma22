package practica1;

import practica1.models.Fabrica;
import practica1.services.MakeAuto;
import practica1.services.TaskAuto;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Fabrica autito=new Fabrica("audi", 4);
        Fabrica kangoo=new Fabrica("kangoo", 5);
        TaskAuto doAuto = new MakeAuto();
        doAuto.registrar(autito);
        doAuto.registrar(kangoo);
    }
}
