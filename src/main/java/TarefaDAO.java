import java.util.List;


    public interface TarefaDAO {
        void salvar(Tarefa tarefa);
        void atualizar(Tarefa tarefa);
        void excluir(int id);
        Tarefa obterTarefaPorId(int id);
        List<Tarefa> listar();
    }
