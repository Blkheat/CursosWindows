import java.util.Random;

public class ClaseRandom {
    public static void main(String[] args) {
        String[] colores = {"azul","rojo","verde","morado"};
        double random = Math.random();
        System.out.println(random);
        random =random* colores.length;
        random = Math.floor(random);
        System.out.println("Colores = "+colores[(int)random]);

        Random random1 = new Random();
        int randomint = random1.nextInt();

        System.out.println(randomint);
    }
}
