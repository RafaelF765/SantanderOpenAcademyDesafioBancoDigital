import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    
    public Pessoa(String nome, int ano, int mes, int dia) {
        this.nome = nome;
        this.dataNascimento.of(ano, mes, dia);
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return nome ;
    }

    

}
