
package Ejercicio;

public class Fibonacci {
    public int tamaño;
    public String nombre;
    
    

    public Fibonacci(int valores, String nombre) {
        this.tamaño = valores;
        this.nombre = nombre;
    }
    public Fibonacci(){
    }
     public void mostrarSerie(){
        System.out.println(this.nombre+" de tamaño "+this.tamaño+":");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println();
    }
      int fibonacci(int n)
    {
        if (n>1){
           return fibonacci(n-1) + fibonacci(n-2); //funcion recursiva
        }
        else if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        else{ //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1; 
        }
    }
}
