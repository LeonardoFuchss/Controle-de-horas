package controleHoras;

import java.time.Duration;
import java.time.LocalTime;

public class Registro {
    //definindo atributos de horas de entrada e saidas utilizando LocalTime
    private LocalTime horaDeEntrada;
    private LocalTime horaDeSaida;

    //construtor para definir o valor na instância da classe
    public Registro(LocalTime horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    //metodos getters para acessar os valores de entrada e saída
    public LocalTime getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public LocalTime getHoraDeSaida() {
        return horaDeSaida;
    }

   //metodo setter para modificar o valor de saida
    public void setHoraDeSaida(LocalTime dataDeSaida) {
        this.horaDeSaida = dataDeSaida;
    }

    public long calculoHorasTrabalhadas() {
        if (getHoraDeEntrada() != null && getHoraDeSaida() != null) { //se hora de entrada e hora de saida não forem nulos
            Duration duracao = Duration.between(getHoraDeEntrada(), getHoraDeSaida()); //armazenamos o calculo de horas chamando .between na variavel duracao
            return duracao.toHours();//chamamos .toHours para retornar o valor total de horas.
        } else {
            return 0;
        }
    }
}


