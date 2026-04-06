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
        console.writeln("Consulta:");
        paciente.mostrar();
        medico.mostrar();
        console.writeln("Fecha: " + fecha);
        console.writeln("Diagnóstico: " + diagnostico);
        console.writeln("Tratamiento: " + tratamiento);
    }
}