
class Cliente {
        public static void main(String[] args) {

        Console console = new Console();

        Paciente maria= new Paciente("Maria P", "12345678A");
        Paciente pedro= new Paciente("Pedro S", "87654321B");
        maria.mostrar();
        pedro.mostrar();

        Horario horarioDRjuan = new Horario("Lunes", "Viernes", 9, 13);
        Horario horarioDRAna = new Horario("Lunes", "Viernes", 16, 20);

        Medico drJuan = new Medico("DR Juan", "Cardiologia");
        Medico drAna = new Medico("DR Ana", "Dermatologia");
        drJuan.asignarHorario(horarioDRjuan);
        drAna.asignarHorario(horarioDRAna);


        drJuan.mostrar();
        drAna.mostrar();

        FechaHora fecha = new FechaHora(10, 5, 2026, 11);
        Consulta consulta = new Consulta(maria, drJuan, fecha, "Revision", "Seguimiento en 10 dias");
        consulta.mostrar();
    }
        
}
