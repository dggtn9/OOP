package EjercicioDos;

public class SistemaDeControlDeVuelo {
    String fabricante;
    Integer numeroModos;
    String tipoSistema;

    public void cambiarModo(String nuevoTipoSistema){
        tipoSistema = nuevoTipoSistema;

    }


    public void asignarFabricante(String fabricanteAsignado){
        fabricante = fabricanteAsignado;

    }

    public void asignarSistema(String sistemaAsignado){
        tipoSistema = sistemaAsignado;

    }

    public String mostrarModo(){
        return tipoSistema;

    }

    public String mostrarFabricante(){
        return fabricante;

    }
    public void mostrarSistema(){
        System.out.println("Marca :"+fabricante);
        System.out.println("Caballos de fuerza :"+numeroModos);
        System.out.println("Empuje:"+tipoSistema);

    }
   }

