import java.util.Arrays;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {
        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "producto 4";
        productos[1] = "producto 2";
        productos[2] = "producto 3";
        productos[3] = "producto 1";
        productos[4] = "producto 5";
        productos[5] = "producto 6";
        productos[6] = "producto 7";
        Arrays.sort(productos);
        System.out.println("Usando for");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice "+i+" : "+productos[i]);
        }

        for (int i = 0; i < total/2; i++) {
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;
        }
        System.out.println("Usando for");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice "+i+" : "+productos[i]);
        }


    }
}
