package clases;

public class ClasePrincipal {

    public static void main(String[] args) {
       //para utilizar el metodo extends en la clase, y acceder a la funcion run
        Proceso1 hilo1 = new Proceso1();
        Proceso1 hilo3 = new Proceso1();
        
        //para usar implements en la clase con el metodo Runneable
        Thread hilo2 = new Thread(new Proceso2());
        
        //impresion de los metodos hilo1 e hilo2
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
    }
}
