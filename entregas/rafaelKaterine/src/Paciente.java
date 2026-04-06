class Paciente{
    private String nombre;
    private String DNI;

    public Paciente(String nombre, String DNI){
        this.nombre = nombre;
        this.DNI = DNI;
    }
    public void mostrar(){
        Console console = new Console();
        console.writeln("Paciente: " + this.nombre + " DNI: " + this.DNI);
    }
}