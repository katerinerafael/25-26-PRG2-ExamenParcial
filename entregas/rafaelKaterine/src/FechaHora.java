class FechaHora {
    private int dia;
    private int mes;
    private int año;
    private int hora;

    public FechaHora(int dia, int mes, int año, int hora){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = hora;}
        
    public FechaHora(int hora){
        this.hora = hora;}

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.año + " a las " + this.hora + ":00";
    }
}
