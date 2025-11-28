package algoritimosdapoio;

public class codigosdapoio {

    /* 🟩 1. Método adicionar
    public void adicionarCliente(Cliente cliente) {
    clientes.add(cliente);
    System.out.println("Cliente adicionado com sucesso: " + cliente.getNome());
    }
    */

    /* 🟦 1. Método remover
    public boolean removerCliente(String nome) {
    Iterator<Cliente> it = clientes.iterator();
    
    while (it.hasNext()) {
        Cliente c = it.next();
    
        if (c.getNome().equalsIgnoreCase(nome)) {
            it.remove();
            System.out.println("Cliente removido: " + nome);
            return true;
        }
    }
        
    System.out.println("Cliente não encontrado: " + nome);
    return false;
    }
    
    🟦 2. Método remover moderno
    public void removerCliente(String nome) {
    
    boolean removido = clientes.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
    
    if (removido) {
        System.out.println("Cliente removido: " + nome);
    } else {
        System.out.println("Cliente não encontrado.");
    }
    }
    🟦 3. Método remover por OBJETO
    public void removerCliente(Cliente cliente) {
    if (clientes.remove(cliente)) {
        System.out.println("Cliente removido: " + cliente.getNome());
    } else {
        System.out.println("Cliente não encontrado.");
    }
}

    */

    /* 🟧 3. Método atualizar
    public boolean atualizarValorCompra(String nome, double novoValor) {
    
    for (Cliente c : clientes) {
        if (c.getNome().equalsIgnoreCase(nome)) {
            c.valorDaCompra = novoValor;
            System.out.println("Valor atualizado para: " + nome);
            return true;
        }
    }
    
    System.out.println("Cliente não encontrado.");
    return false;
    }
    */

    /*🟨 4. Método buscar
    public Cliente buscarCliente(String nome) {
    for (Cliente c : clientes) {
        if (c.getNome().equalsIgnoreCase(nome)) {
            return c;
        }
    }
    return null;
    }
    USO: 
    Cliente c = mercado.buscarCliente("Ana");
    if (c != null) System.out.println(c);
    
    */

}
