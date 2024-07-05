package MatriculaCurso;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Turma extends Instrutor implements Comparable<Curso>{
    
    
    private String nome;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.minusWeeks(4);
    private Set<Instrutor> Instrutor = new HashSet<>();
    private Set<Curso> Cursos = new LinkedHashSet<>();


    
    public Turma(String nome, String sobrenome, String endereco, int telefone, String Instrutor, String Cursos) {
        super(nome, sobrenome, endereco, telefone);
    }

    

    @Override
    public boolean equals(Object obj) {
        
        return super.equals(obj);
    }
    

    public int compareTo(Turma t) {
		return nome.compareTo(t.nome);
	}
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    public Set<Instrutor> getInstrutor() {
        return Instrutor;
    }
    public void setInstrutor(Set<Instrutor> Instrutor) {
        this.Instrutor = Instrutor;
    }
    public Set<Curso> getCursos() {
        return Cursos;
    }
    public void setCursos(Set<Curso> Cursos) {
        this.Cursos = Cursos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
        result = prime * result + ((dataFinal == null) ? 0 : dataFinal.hashCode());
        result = prime * result + ((Instrutor == null) ? 0 : Instrutor.hashCode());
        result = prime * result + ((Cursos == null) ? 0 : Cursos.hashCode());
        return result;
    }

    @Override
    public int compareTo(Curso o) {
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    public void setCursos(String string) {
        throw new UnsupportedOperationException("Unimplemented method 'setCursos'");
    }
  
    }
    class CompararTurma implements Comparator<Curso> {
	@Override
	public int compare(Curso c1, Curso c2) {
		return c1.getCurso().compareTo(c2.getCurso());
	}
}
    
    




    


