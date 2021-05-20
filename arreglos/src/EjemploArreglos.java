import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        String[] productos = new String[7];
        productos[0] = "producto 4";
        productos[1] = "producto 2";
        productos[2] = "producto 3";
        productos[3] = "producto 1";
        productos[4] = "producto 5";
        productos[5] = "producto 6";
        productos[6] = "producto 7";

        Arrays.sort(productos);

        System.out.println("productos[0] = "+productos[0]);
        System.out.println("productos[0] = "+productos[1]);
        System.out.println("productos[0] = "+productos[2]);
        System.out.println("productos[0] = "+productos[3]);
    }
}
