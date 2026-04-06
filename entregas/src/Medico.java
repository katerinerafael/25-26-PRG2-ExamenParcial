class Medico {
    private String nombre;
    private String especialidad;
    private Horario horario;

    public Medico(String nombre, String especialidad){
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    public Medico(String nombre){
        this.nombre = nombre;
    }
    public void editarEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    public void mostrar(){
        console.writeln("Medico: " + nombre + " | Especialidad: " + especialidad);
    }
    public void asignarHorario(Horario horario){
        this.horario = horario;
    }
}
