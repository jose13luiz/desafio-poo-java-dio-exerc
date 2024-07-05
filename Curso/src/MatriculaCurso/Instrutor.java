package MatriculaCurso;
public abstract class Instrutor  {

    private String nome;
    private String sobrenome;
    private String endereco;
    private int telefone;
    


    public Instrutor(String nome, String sobrenome, String endereco, int telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.telefone = telefone;
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }


    



    

}
