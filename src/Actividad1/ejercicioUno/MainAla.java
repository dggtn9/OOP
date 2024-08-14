package Actividad1.ejercicioUno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainAla {
    public static void main(String[] args) {
        Ala ala = new Ala();
        Ala alita = new Ala();

        ala.cambiarColor("blue");
        System.out.println( ala.obtenerColor());

        ala.asignarMaterial("aluminio");

        ala.asignarEnvergadura(265);

        ala.flap();
        alita.flap();
    }

}