import java.util.Date;

public class RunAutomovilStatic {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru","Imprezo");


        auto.setCilindrada(2.5);
        auto.setColor(Color.ROJO);
        Automovil mazda = new Automovil("Mazda","MT-24",Color.NARANJA);
//        mazda.setFabricante("Mazda");
//        mazda.setModelo("MT-24");
        mazda.setCilindrada(3.6);
        mazda.setColor(Color.AZUL);
        mazda.setTipoAutomovil(TipoAutomovil.HATCHBACK);

        Automovil nissan = new Automovil("Nissan","Navara",Color.NARANJA);
        Automovil nissan2 = new Automovil("Nissan","Navara",Color.BLANCO);

        System.out.println("son iguales : "+(nissan == nissan2));
        System.out.println("son iguales : "+(nissan.equals(nissan2)));
        System.out.println(nissan.detalle());

        System.out.println(auto.detalle());
        System.out.println(mazda.detalle());
        System.out.println(auto.acelerar(3000));
        System.out.println(auto.frenar());
        Automovil.setColorPatente("Verde");


    }


}
