package Actividad1.ejercicioUno;

public class Ala {
    private String color;
    String tipoDeMaterial;
    float envergadura;

    public void cambiarColor(String colorNuevo){
        color = colorNuevo;
    }
    public void asignarMaterial(String material){
        tipoDeMaterial=material;
    }

    public void asignarEnvergadura(Integer distancia){
        envergadura = distancia;
    }
    //Si voy a devolver valor debo usar return dentro del metodo
    public String obtenerColor(){
        return color;
    }

    public void flap(){
        System.out.println("Flapeooo:):)");
    }
    public void mostrarAla(){
        System.out.println("Color :"+color);
        System.out.println("Tipo de material :"+tipoDeMaterial);
        System.out.println("Emvergadura:"+envergadura);

    }
}
