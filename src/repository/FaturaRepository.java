package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Fatura;

public class FaturaRepository {

    private static FaturaRepository instancia;

    private Map<Integer, Fatura> Faturas = new HashMap<>();
    private Integer FaturaId = 0;

    private FaturaRepository() {
        
    }

    public static FaturaRepository getInstancia(){
        
        if (instancia == null){
            instancia = new FaturaRepository();
        }
        return instancia;

    }

    public Fatura salvar(Fatura novoFatura){

        this.FaturaId++;
        novoFatura.setId(this.FaturaId);
        Faturas.put(this.FaturaId, novoFatura);

        return novoFatura;

    }

    public Fatura deletar(Integer id){

        return Faturas.remove(id);
            
    }

    public void editar(Integer id){
        
        
        // Implementar a lógica para editar um usuário
            
    }

    public Fatura buscarFaturaPorId(Integer id) {
            
        return Faturas.get(id);

    }


    public Boolean existe(Integer id){
        return Faturas.get(id) != null;
    }

    

    public List<Fatura> buscarTodosFaturas() {

        return new ArrayList<>(Faturas.values());

    }

    public Map<Integer, Fatura> getFaturas() {
        return Faturas;
    }
    
}
