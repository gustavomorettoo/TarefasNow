import java.util.ArrayList;
import java.util.List;

public class TarefaDAOImpl implements TarefaDAO {
    private List<Tarefa> tarefas = new ArrayList<>();

    @Override
    public void salvar(Tarefa tarefa) {
        tarefa.setId(tarefas.size() + 1);
        tarefas.add(tarefa);
    }

    @Override
    public void atualizar(Tarefa tarefa) {
        int index = tarefas.indexOf(tarefa);
        if (index != -1) {
            tarefas.set(index, tarefa);
        }
    }

    @Override
    public void excluir(int id) {
        tarefas.removeIf(tarefa -> tarefa.getId() == id);
    }

    @Override
    public Tarefa obterTarefaPorId(int id) {
        return tarefas.stream().filter(tarefa -> tarefa.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Tarefa> listar() {
        return new ArrayList<>(tarefas);
    }
}
