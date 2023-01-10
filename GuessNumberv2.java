/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessnumberv2;

import java.util.Scanner;

/**
 *
 * @author Lliurex
 */
public class GuessNumberv2 {

    /**
     * @param args the command line arguments
     */
    static int intentos;
    static int numeroDeCifras;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
//establecerValoresIniciales();
        do {
            opcion = menu();
            switch (opcion) {
                case 1: configurar();
                    break;
                case 2: //jugar();
                    break;
                case 3: //mostrarEstadisticas();
                    break;
                case 4: mostrarReglas();
                    break;
                case 0:
                    System.out.println("------------FIN DE PROGRAMA------------");
                    break;
            }
        } while (opcion != 0);
    } //fin del método main
    
    public static int menu(){
        int respuesta; 
        System.out.println("1 -> Configurar");
        System.out.println("2 -> Jugar");  
        System.out.println("3 -> Estadísticas");
        System.out.println("4 -> Reglas del juego");
        System.out.println("0 -> FIN");
        do{ 
        System.out.print("Opción: " );
        respuesta = sc.nextInt();
        }while (respuesta > 4 || respuesta < 0);
    return respuesta;
    }
    
    public static void mostrarReglas(){
        System.out.println("--------------------REGLAS--------------------");
        System.out.println("El número a adivinar será inicialmente de tres o cuatro cifras según lo decida el ordenador.");
        System.out.println("Si el número es de 3 cifras se dispondrá de 5 intentos para adivinarlo.");
        System.out.println("Si se trata de un número de 4 cifras el usuario dispondrá de 7 intentos.");
        System.out.println("El número introducido debe tener las mismas cifras que el número a adivinar.");
        System.out.println("Si en una cifra pone < el número que buscas será menor");
        System.out.println("Si en una cifra pone > el número que buscas será mayor");
    }
    public static void configurar() {
        System.out.println("-----------------CONFIGURACION-----------------");
        int numeroDeCifras, intentos;
        do{
          System.out.print("Introduce número máximo de cifras (>= 3 y <= 6): ");
          numeroDeCifras = sc.nextInt();
        } while (numeroDeCifras < 3 || numeroDeCifras > 6);
      do{
          System.out.print("Introduce número de intentos ( >= 2): ");
          intentos = sc.nextInt();
      } while (intentos < 2);
    menu();
    }
//RESTO DE MÉTODOS
} //llave de cierre de class

