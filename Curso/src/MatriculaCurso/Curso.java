package MatriculaCurso;
public class Curso {

    private String curso;
    private int duracao;
    private double valor;
      

    public Curso(String curso, int duracao, double valor) {
        this.curso = curso;
        this.duracao = duracao;
        this.valor = valor;
    }

    public Curso() {
       
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }


   
    @Override
    public String toString() {
        return "Curso [curso=" + curso + ", duracao=" + duracao + ", valor=" + valor + "]";
    }

    

    

}
