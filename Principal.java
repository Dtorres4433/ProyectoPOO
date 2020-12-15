/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caramel_and_Coffee;

import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantProdTotal = 5;
        int idproductos[] = new int[]{100, 200, 300, 400, 500};
        String nombres[] = new String[]{"Pizaaguette", "Dulce de tres leches", "Frozzen de Naranja-Frutilla", "Milkshake de Nutella", "Americano"};
        double precios[] = new double[]{3.75, 2.5, 2.0, 4.75, 2.0};
        
        Scanner teclado = new Scanner(System.in);
        
        int codProdCarrito[] = new int[10];
        int cantCarrito[] = new int[10];
        double subtCarrito[] = new double[10];
        
        int cantLineas = 0;
        int op;
        do{
            System.out.println("Bienvenidos a Caramel & Coffee");
            System.out.println("==============================\n");
            System.out.println("Menu de Opciones\n");
            System.out.println("Productos");
            System.out.println("Carrito de compras");
            System.out.println("Pedir en Linea");
            /*System.out.println("Agregar saldo a su cuenta");*/
            System.out.println("Salir");
            System.out.println("Ingrese la opcion deseada: \n");
            op = teclado.nextInt();
            
            switch(op){
                case 1: 
                    Productos(idproductos, nombres, precios, cantProdTotal);
                    break;
                case 2: //Llamar a Compras
                    Carrito(idproductos, nombres, precios, codProdCarrito, cantCarrito, subtCarrito, cantLineas);
                    break;
                case 3: //Hacer pedidos
                    if(cantLineas < 9){
                      cantLineas = Pedidos(idproductos, nombres, precios, codProdCarrito, cantCarrito, subtCarrito, cantLineas, teclado);  
                    }else{
                       System.out.println("-- Usted ha exedido el numero de productos --"); 
                    }
                   
                    break;
                 /*case 4: //Llamar a Compras
                        Scanner opt = new Scanner(System.in);
                        int opcion;
                        int saldact = 0;
                        System.out.println("Su saldo actual es de = $" +saldact);
                        System.out.println("Menu de Opciones\n");
                        System.out.println("Agregar saldo");
                        System.out.println("Salir");
                        System.out.println("Ingrese la opcion deseada: \n");
                        opcion = opt.nextInt();
        
                        switch (opcion) {
                            case 1:
                                
                                break;
                        } while(opcion != 4);
                    break;*/
            }
            
        }while(op != 4);
        double sumaTotal= Carrito(idproductos, nombres, precios, codProdCarrito, cantCarrito, subtCarrito, cantLineas);
         System.out.println("El total es = " +sumaTotal);
        // calcular el total
        // mostrar el total
        
    }

public static void Productos(int[] id, String[] np, double[] pp, int cant){
    System.out.println();
    System.out.println("Nuestros Productos");
    System.out.println("==============================\n");
    for(int i = 0; i<cant;i++){
        System.out.println(id[i] + " - " + np[i] + " - "+ pp[i]);
    }
}

public static double Carrito(int[] id, String[] np, double[] pp, 
        int[]cp_Linea,int[] cantLinea, double[] subt, int cantLineas){
    double suma= 0;
    System.out.println();
    System.out.println("Tu carrito de compras");
    System.out.println("==============================\n");
    for(int i = 0; i<cantLineas;i++){
        int h = BuscarProd(cp_Linea[i], id);// Llamar Busqueda de producto
        System.out.println(cp_Linea[i] + " - " + np[h] + " - "+ pp[h] 
                + " - " +cantLinea[i] +  " - " +subt[i]);
        suma = suma+subt[i];
    }
    return suma;
}
   
public static int BuscarProd(int codBus,int[] productos ){
    int posicion = -1;
    for(int i = 0; i<5; i++){
        if(codBus == productos[i]){
            posicion = i;
        }
    }
    return posicion;
}

public static int Pedidos(int[] id, String[] np, double[] pp, 
        int[]cp_Linea,int[] cantLinea, double[] subt, int cantLineas, Scanner teclado){
            System.out.println("Ingrese el codigo de producto deseado: \n");
            int cod = teclado.nextInt();
            
            int posi = BuscarProd(cod, id);
            if(posi == -1){
                System.out.println("Este producto no existe");
                return cantLineas;
            }
            System.out.println("Ingrese la cantidad deseada: \n");
            int cant = teclado.nextInt();
            cp_Linea[cantLineas] = cod;
            cantLinea[cantLineas] = cant;
            subt[cantLineas] = pp[posi]*cant;
            
            return (cantLineas +1);
}
}
