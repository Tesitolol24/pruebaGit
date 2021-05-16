public class Automovil {
    private String nombreDueño;
    private String nombreAuto;
    private String marca;
    private int ruedas;
    private int puertas;
    private double peso;

    public Automovil(String nombreDueño, String nombreAuto, String marca, int ruedas, int puertas, double peso) {
        this.nombreDueño = nombreDueño;
        this.nombreAuto = nombreAuto;
        this.marca = marca;
        this.ruedas = ruedas;
        this.puertas = puertas;
        this.peso = peso;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getNombreAuto() {
        return nombreAuto;
    }

    public void setNombreAuto(String nombreAuto) {
        this.nombreAuto = nombreAuto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDatosAutomovil(){
        return "El dueño del carro es: "+nombreDueño+" su marca es: "+marca+" y el nombre del auto es: "+nombreAuto;
    }
}
