import java.time.LocalDate;

public class Tarefa {
    private int id;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataConclusao;
    private int prioridade;
    private String estado;

    public Tarefa() {
    }
    public Tarefa(int id, String descricao, LocalDate dataInicio, LocalDate dataConclusao, int prioridade, String estado) {
        this.id = id;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
        this.prioridade = prioridade;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
