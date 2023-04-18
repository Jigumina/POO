public class Automovil extends Vehiculo {
    protected String marca;
    protected float año;
    protected String modelo;

    public Automovil() {
    }

    public Automovil(String tipo, int ruedas, int capacidad, String marca, float año, String modelo) {
        super(tipo, ruedas, capacidad);
        this.marca = marca;
        this.año = año;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getAño() {
        return año;
    }

    public void setAño(float año) {
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", año=" + año +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ruedas=" + ruedas +
                ", capacidad=" + capacidad +
                '}';
    }
    public void tocarClaxon(){
        System.out.println("pipi");
    }
    public void frenadoDemano(){
        System.out.println("Se ha usado el freno de mano");
    }
}
