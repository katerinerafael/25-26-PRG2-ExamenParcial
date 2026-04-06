class Consulta{
    private Paciente paciente;
    private Medico medico;
    private FechaHora fecha;
    private String diagnostico;
    private String tratamiento;

    public Consulta(Paciente paciente, Medico medico, FechaHora hora, String diagnostico, String tratamiento){
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = hora;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }
    public void mostrar(){
        Console console = new Console();
        console.writeln("--- DETALLE DE CONSULTA ---");
        this.paciente.mostrar();
        this.medico.mostrar();
        console.writeln("Diagnóstico: " + this.diagnostico);
        console.writeln("Tratamiento: " + this.tratamiento);
        console.writeln("---------------------------");
    }
}