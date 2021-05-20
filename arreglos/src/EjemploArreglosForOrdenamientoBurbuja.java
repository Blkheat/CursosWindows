import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void main(String[] args) {
        String[] productos = new String[7];
       

        productos[0] = "producto 4";
        productos[1] = "producto 2";
        productos[2] = "producto 3";
        productos[3] = "producto 1";
        productos[4] = "producto 5";
        productos[5] = "producto 6";
        productos[6] = "producto 7";

        int total = productos.length;
        int contador =0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                if (productos[i].compareTo(productos[j])<0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println(contador);

//        Arrays.sort(productos);
//        System.out.println("Usando for");



        for (int i = 0; i < total; i++) {
            System.out.println("para indice "+i+" : "+productos[i]);
        }
//
//        for (int i = 0; i < total/2; i++) {
//            String actual = productos[i];
//            String inverso = productos[total-1-i];
//            productos[i] = inverso;
//            productos[total-1-i] = actual;
//        }
//        System.out.println("Usando for");
//        for (int i = 0; i < total; i++) {
//            System.out.println("para indice "+i+" : "+productos[i]);
//        }


    }
}
