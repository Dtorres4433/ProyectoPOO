package Caramel_and_Coffee;

public class Menu {
	 int cantProdTotal = 5;
     int idproductos[] = new int[]{100, 200, 300, 400, 500};
     String nombres[] = new String[]{"Pizaaguette", "Dulce de tres leches", "Frozzen de Naranja-Frutilla", "Milkshake de Nutella", "Americano"};
     double precios[] = new double[]{3.75, 2.5, 2.0, 4.75, 2.0};

    public void mostrarProductos(int[] id, String[] np, double[] pp, int cant){
    System.out.println();
    System.out.println("Nuestros Productos");
    System.out.println("==============================\n");
    for(int i = 0; i<cant;i++){
        System.out.println(id[i] + " - " + np[i] + " - "+ pp[i]);
    }
}
}
