package Actividad1.EjercicioTres;

public class MainMotorDeAvion {
    public static void main(String[] args) {
        MotorDeAvion motor1 = new MotorDeAvion();
        MotorDeAvion motor2 = new MotorDeAvion();

        motor1.asignarCaballosFuerza(380000);
        motor2.asignarCaballosFuerza(35600);
        motor1.asignarMarca("ford");
        motor2.asignarMarca("toyota");

        motor1.mostrarMotor();


    }

}
