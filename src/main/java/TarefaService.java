import java.util.List;

public class TarefaService {
    private TarefaDAO tarefaDAO;

    public TarefaService(TarefaDAO tarefaDAO) {
        this.tarefaDAO = tarefaDAO;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        // Lógica para adicionar uma nova tarefa
        tarefaDAO.salvar(tarefa);
    }

    public void marcarComoConcluida(int idTarefa) {
        // Lógica para marcar uma tarefa como concluída
        Tarefa tarefa = tarefaDAO.obterTarefaPorId(idTarefa);
        if (tarefa != null) {
            tarefa.setEstado("Concluída");
            tarefaDAO.atualizar(tarefa);
        }
    }

    public void excluirTarefa(int idTarefa) {
        // Lógica para excluir uma tarefa
        tarefaDAO.excluir(idTarefa);
    }

    public List<Tarefa> listarTarefas() {
        // Retorna a lista de todas as tarefas
        return tarefaDAO.listar();
    }
}
