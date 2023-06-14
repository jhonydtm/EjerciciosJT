/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author jhony
 */
public class Aplicacion {
    public static void main(String[] args) {
        
    }
     public static void Matricula() {
     String nombre,facultad;
        double importe=0,mensualidad=0,igv=0,mfinal=0,matricula=0;
        Scanner entrada=new Scanner(System.in);

        System.out.print("Ingrese nombre de postulante: ");
        nombre=entrada.next();
        System.out.print("Ingrese Facultad: ");
        facultad=entrada.next();

        switch(facultad){
            case "sistemas":
            case "SISTEMAS":
                  matricula = 350;
                  mensualidad= 650;
                  break;
            case "derecho":
                  matricula=300;
                  mensualidad=550;
                  break;
            case "Ing.Sistemas":
                  matricula=300;
                  mensualidad=500;
                  break;
            case "Medicina":
                  matricula=310;
                  mensualidad=460;
                  break;
            case "contabilidad":
                  matricula=280;
                  mensualidad=490;
                  break;
            case "administracion":
                  matricula=360;
                  mensualidad=520;
                  break;
            default:
                  System.out.println("La Facultad ingresado no es correcto");
                  System.exit(0);
        }
             igv= 0.18 * (matricula + mensualidad);
             mfinal= matricula + mensualidad + igv;

             System.out.println("La matricula es: " + matricula);
             System.out.println("La mensualidad es: " + mensualidad);
             System.out.println("El IGV es: " + igv);
             System.out.println("El Monto Final es: " + mfinal);
    }
     
     
    public static void cajerosutomatico() {
     final int saldo_inicial=1000;
        int opcion;
        double ingreso,saldoActual,retiro;
        Scanner entrada=new Scanner(System.in);

        System.out.println("1. Ingresar dinero a la cuenta");
        System.out.println("2. Retirar dinero de la cuenta.");
        System.out.println("3. Salir"); 
        
        System.out.print("Ingresar un numero:");
        opcion=entrada.nextInt();

        switch(opcion){
            case 1 :
                System.out.println("Digite la cantidad que desea ingresar en cuenta: ");
                ingreso=entrada.nextDouble();
                saldoActual=saldo_inicial+ingreso;
                System.out.println("El saldo Actual es: " + saldoActual);
                break;
            case 2 :
                System.out.print("Digite la cantidad que desea retirar: ");
                retiro=entrada.nextDouble();
                if(retiro<=saldo_inicial){
                saldoActual=saldo_inicial-retiro;
                System.out.println("Dinero en cuenta: "+saldoActual);
                }
                else{
                System.out.println("No cuenta con el saldo suficiente");
                }
                break;
            case 3:
                break;
          }    
      }
    
    
    public static void TiendaMorales() {
       String dia;
   double monto_compra,descuento, total1, total2;
   Scanner entrada= new Scanner (System.in);

    System.out.print("Ingrese el monto de compra: ");
    monto_compra=entrada.nextInt();
    System.out.print("Ingrese el dia de semana: ");
    dia=entrada.next();
    
    descuento= 0.15*monto_compra;
    total1 = monto_compra - descuento;
    total2=monto_compra;

    if(dia.equals("martes")||dia.equals("jueves")){
        System.out.println("El Descuento es: "+ descuento);
        System.out.println("El total es: " + total1);
    }
    else{
        System.out.println("El total es: " + total2);
    }
   } 
    
    
    public static void descuentofarmacias() {
     double valor, descuento, recargo,total;
    String tipo_pago;
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Ingrese el valor de la compra: ");
    valor = entrada.nextDouble();
    System.out.print("Ingrese tipo de pago: ");
    tipo_pago=entrada.next();
    descuento=0.05*valor;
    recargo=0.03*valor;
    
    if(tipo_pago.equalsIgnoreCase("contado")){
        System.out.println("El descuento es: " + descuento);
        total= valor - descuento;
        System.out.println("El total es: " + total);
    }
    else{
        System.out.println("El recargo es: " + recargo);
        total=valor + recargo;
        System.out.println("El total es: " + total);
    }
   } 
    
    
    public static void iniciosecion() {
      String nombre,clave;
        Scanner entrada = new Scanner(System.in);

    System.out.print("Ingrese Nombre de usuario: ");
    nombre = entrada.nextLine();
    System.out.print("Ingrese Clave de usuario: ");
    clave = entrada.nextLine();

        if(nombre.equals("Jhony") && clave.equals("1728202670")){
        System.out.println("Bienvenido al Sistema");
        }
        else{
        System.out.println("Nombre de Usuario o contraseña Incorrecto");
        }
      } 
    
    
}
