package Actividad1.EjercicioTres;

public class MotorDeAvion {
    String marca;
    Integer caballosFuerza;
    float empuje;



    public void asignarMarca(String marcaAsignada){
        marca = marcaAsignada;

    }

    public void asignarCaballosFuerza(Integer caballosFuerzaAsignado){
        caballosFuerza = caballosFuerzaAsignado;

    }


    public void mostrarMotor(){
        System.out.println("Marca :"+marca);
        System.out.println("Caballos de fuerza :"+caballosFuerza);
        System.out.println("Empuje:"+empuje);

    }
    public void  detener(){
        System.out.println("STOP");

        }



}
