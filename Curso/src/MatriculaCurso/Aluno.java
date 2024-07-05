package MatriculaCurso;
public abstract class Aluno {

    private String nome;
    private String sobrenome;
    private String endereco;


    public Aluno(String nome, String sobrenome, String endereco){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", sobrenome=" + sobrenome + ", endereco=" + endereco + "]";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

       
}
