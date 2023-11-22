import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TarefaServiceTest {

    @Test
    public void testeAdicionarTarefa() {
        TarefaDAO tarefaDAOMock = mock(TarefaDAO.class);
        TarefaService tarefaService = new TarefaService(tarefaDAOMock);

        Tarefa novaTarefa = new Tarefa();
        novaTarefa.setDescricao("Teste de Tarefa");

        tarefaService.adicionarTarefa(novaTarefa);

        verify(tarefaDAOMock).salvar(novaTarefa);
    }

    @Test
    public void testeListarTarefas() {
        TarefaDAO tarefaDAOMock = mock(TarefaDAO.class);
        TarefaService tarefaService = new TarefaService(tarefaDAOMock);

        // Simula a lista de tarefas
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("Teste de Tarefa");
        when(tarefaDAOMock.listar()).thenReturn(Collections.singletonList(tarefa));

        // Chama o método que será testado
        List<Tarefa> tarefas = tarefaService.listarTarefas();

        // Verifica se a lista retornada contém a tarefa simulada
        assertEquals(1, tarefas.size());
        assertEquals("Teste de Tarefa", tarefas.get(0).getDescricao());
    }

    // Adicione mais testes conforme necessário
    @Test
    public void testeMarcarComoConcluida() {
        TarefaDAO tarefaDAOMock = mock(TarefaDAO.class);
        TarefaService tarefaService = new TarefaService(tarefaDAOMock);

        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("Teste de Tarefa");

        // Simula obter tarefa por ID
        when(tarefaDAOMock.obterTarefaPorId(anyInt())).thenReturn(tarefa);

        // Chama o método que será testado
        tarefaService.marcarComoConcluida(1);

        // Verifica se o estado da tarefa foi atualizado
        verify(tarefaDAOMock).atualizar(tarefa);
        assertEquals("Concluída", tarefa.getEstado());
    }
}

