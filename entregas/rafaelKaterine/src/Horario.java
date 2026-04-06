class Horario{
    public String diaInicio, diaFinal;
    public int horaInicio, horaFinal;

    public Horario(String diaInicio, String diaFinal, int horaInicio, int horaFinal){
        this.diaInicio = diaInicio;
        this.diaFinal = diaFinal;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }
    @Override
    public String toString() {
        return this.diaInicio + " a " + this.diaFinal + " (" + this.horaInicio + ":00 - " + this.horaFinal + ":00)";
    }
}
