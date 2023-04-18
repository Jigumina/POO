public class Vehiculo {
    protected String tipo;
    protected int ruedas;
    protected int capacidad;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, int ruedas, int capacidad) {
        this.tipo = tipo;
        this.ruedas = ruedas;
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", ruedas=" + ruedas +
                ", capacidad=" + capacidad +
                '}';
    }
    public void avaznar(){
        System.out.println("El " + tipo + " está avanzando....");
    }
    public void detenerse(){
        System.out.println("El" + tipo + "se detuvo");
    }

}
