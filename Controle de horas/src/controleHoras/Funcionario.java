package controleHoras;

public class Funcionario {
    //atributos da classe
    private String nome;
    private int idade;
    private int registro;
    private String cargo;

    //construtor
    public Funcionario(String nome, int idade, int registro, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.registro = registro;
        this.cargo = cargo;
    }

//Metodos getters para acessar o valor
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

}
