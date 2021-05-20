public class Automovil {
    private String fabricante;
    private String modelo;
    private Color color;
    private double cilindrada;
    private int capacidadTanque=40;
    private static String colorPatente = "Naranja";
    public static final Integer VELOCIDAD_MAX_CARRETERA = 200;

    private TipoAutomovil tipoAutomovil;

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadTanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public String detalle(){
        String stringBuilder = "auto fabricante = " + this.fabricante +
                "\nauto modelo = " + this.modelo +
                "\nauto color = " + this.color +
                "\nauto cilindrada = " + this.cilindrada+
                "\nauto patente = "+Automovil.colorPatente;
        return stringBuilder;
    }

    public String acelerar(int rpm){
        return "el auto "+fabricante+" acelerando a "+rpm+" rpm";
    }

    public String frenar(){
        return fabricante+" "+modelo+" frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar +"\n "+frenar;
    }
    public float calcularConsumo(int km, float porcetajeBencina){

        return km/(porcetajeBencina*capacidadTanque);
    }
    public String leerFabricante(){
        return this.fabricante;
    }
    public String leerModelo(){
        return this.modelo;
    }
    public Color leerColor(){
        return this.color;
    }
    public double leerCilindrada(){
        return this.cilindrada;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.fabricante.equals(a.fabricante)
                && this.modelo !=null && this.modelo.equals(a.modelo));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}

