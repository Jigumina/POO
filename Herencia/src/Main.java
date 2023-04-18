public class Main {
    public static void main(String[] args) {
    Taxi  tax = new Taxi("Automovil", 4, 4, "Chebrolete", 2004, "nose", 33000, "Abierto", "Av pirules");
        System.out.println(tax);
        tax.recoger();
        tax.avaznar();
        tax.destino();
    }

}