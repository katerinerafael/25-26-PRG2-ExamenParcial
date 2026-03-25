
class Cliente {
        public static void main(String[] args) {

        Paciente maria= new Paciente("Maria P", "12345678A");
        Paciente pedro= new Paciente("Pedro S", "87654321B");
        maria.mostrar();
        pedro.mostrar();

        Horario horarioDRjuan = new Horario("Lunes", "Viernes", 9, 13);
        Horario horarioDRAna = new Horario("Lunes", "Viernes", 16, 20);

        Medico drJuan = new Medico("DR Juan", "Cardiologia");
        Medico drAna = new Medico("DR Ana", "Dermatologia");

        drJuan.mostrar();
        drAna.mostrar();
    }
}
