package controleHoras;
import java.time.LocalTime;

public class Controle {
    public static void main(String[] args) {
        Funcionario funcionário = new Funcionario("Leonardo Fuchs", 19, 3223, "Desenvolvedor Junior"); //declaramos o objeto funcionario, inicializando os atributos em parâmetro.

        LocalTime horaEntrada = LocalTime.of(10, 30); // declaramos o objeto localTime para armazenar a hora de entrada
        Registro registro = new Registro(horaEntrada); // declaramos o objeto registro e passamos em parametro a variavel horaEntrada.

        LocalTime horaSaida = LocalTime.of(18, 30); // declaramos o objeto localTime para armazenar a hora de saida
        registro.setHoraDeSaida(horaSaida); // Chamamos o método setter para modificar a hora de saida, passando por parametro a variavel horaSaida.

        System.out.println("O funcionário " + funcionário.getNome() + " do cargo " + funcionário.getCargo() + " teve de HORAS TRABALHADAS hoje: " + registro.calculoHorasTrabalhadas() + " horas");
    }
}
