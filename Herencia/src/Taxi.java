public class Taxi extends Automovil {
    private int taximetro;
    private String casquete;
    private String estacion;

    public Taxi() {
    }

    public Taxi(String tipo, int ruedas, int capacidad, String marca, float año, String modelo, int taximetro, String casquete, String estacion) {
        super(tipo, ruedas, capacidad, marca, año, modelo);
        this.taximetro = taximetro;
        this.casquete = casquete;
        this.estacion = estacion;
    }

    public int getTaximetro() {
        return taximetro;
    }

    public void setTaximetro(int taximetro) {
        this.taximetro = taximetro;
    }

    public String getCasquete() {
        return casquete;
    }

    public void setCasquete(String casquete) {
        this.casquete = casquete;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "taximetro=" + taximetro +
                ", casquete='" + casquete + '\'' +
                ", estacion='" + estacion + '\'' +
                ", marca='" + marca + '\'' +
                ", año=" + año +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ruedas=" + ruedas +
                ", capacidad=" + capacidad +
                '}';
    }
    public void destino(){
        System.out.println("yendo hacia destino...");
    }
    public void recoger(){
        System.out.println("recogiendo personas....");
    }
}