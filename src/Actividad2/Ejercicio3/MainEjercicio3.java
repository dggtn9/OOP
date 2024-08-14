package Actividad2.Ejercicio3;

import Actividad2.Ejercicio3.Pantalla;
import Actividad2.Ejercicio3.Televisor;

public class MainEjercicio3 {
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla(true,25,"HD");
        Televisor tele1 = new Televisor("sony", "jhv", 2004, 'a', 65, true,pantalla);
        Televisor tele2 = new Televisor("lg", "jjkv", 2021, 'b', 42, false,pantalla);

        tele1.apagar();
        tele2.encender();
        tele1.conocerEstado();
        tele2.conocerEstado();

    }

}

