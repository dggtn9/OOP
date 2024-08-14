package Actividad2.Ejercicio2;

import Actividad2.Ejercicio1.Televisor;

public class MainEjercicio2 {
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla(true,25,"HD");
        Televisor tele1 = new Televisor("sony", "jhv", 2004, 'a', 65, true);
        Televisor tele2 = new Televisor("lg", "jjkv", 2021, 'b', 42, false);

        System.out.println(tele1);
        System.out.println(tele2);


    }

}

