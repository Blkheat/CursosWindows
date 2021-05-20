public class RunAutomovilEnum {
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

//        TipoAutomovil tipoSubaru = auto.getTipoAutomovil();
//        System.out.println("tipo subaru : "+tipoSubaru.getNombre());


    }


}
