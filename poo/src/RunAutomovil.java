import java.util.Date;

public class RunAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru","Imprezo");


        auto.setCilindrada(2.5);
        auto.setColor(Color.AMARILLO);
        Automovil mazda = new Automovil("Mazda","MT-24",Color.ROJO);
//        mazda.setFabricante("Mazda");
//        mazda.setModelo("MT-24");
        mazda.setCilindrada(3.6);
        mazda.setColor(Color.AMARILLO);

        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS);
        Automovil nissan2 = new Automovil("Nissan","Navara",Color.NARANJA);

        System.out.println("son iguales : "+(nissan == nissan2));
        System.out.println("son iguales : "+(nissan.equals(nissan2)));
        System.out.println(nissan.detalle());

        System.out.println(auto.detalle());
        System.out.println(mazda.detalle());
        System.out.println(auto.acelerar(3000));
        System.out.println(auto.frenar());

        System.out.println(mazda.acelerarFrenar(25000));

        System.out.println("kilometros por litro "+auto.calcularConsumo(300,0.75f));

        Date fecha = new Date();
        Automovil auto2 = new Automovil();
        System.out.println(auto2.equals(fecha));

        System.out.println(auto2);
        System.out.println(auto2.toString());
    }


}
