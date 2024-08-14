package Actividad1.EjercicioDos;

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
        System.out.println("Fabricante :"+fabricante);
        System.out.println("Numero modos :"+numeroModos);
        System.out.println("Tipo sistema:"+tipoSistema);

    }
   }

