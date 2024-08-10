package EjercicioDos;

public class MainSistemaDeControl {
    public static void main(String[] args){
        SistemaDeControlDeVuelo sistema1 = new SistemaDeControlDeVuelo();
        SistemaDeControlDeVuelo sistema2 = new SistemaDeControlDeVuelo();

        sistema1.cambiarModo("piloto");
        sistema2.cambiarModo("manual");
        sistema1.asignarFabricante("USA");
        sistema2.asignarFabricante("ALEMANIA");
        sistema1.asignarSistema("manual");
        sistema2.asignarSistema("automatico");

        sistema1.mostrarSistema();
        sistema2.mostrarSistema();


    }

}
