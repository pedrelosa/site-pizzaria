package br.com.fabricadapizzace;

import br.com.fabricadapizzace.model.Cliente;
import br.com.fabricadapizzace.model.Endereco;
import br.com.fabricadapizzace.model.TipoLogradouro;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ClienteTeste extends InicializacaoTeste{

//    @Test
    public void adicionaEndereco(){
        Endereco endereco = new Endereco();

        endereco.setLogradouro("Ipê");
        endereco.setTipoLogradouro(TipoLogradouro.RUA);
        endereco.setNumeroLogradouro("205");
        endereco.setComplementoLogradouro("Ap 402 bl 2");
        endereco.setBairro("Sao Gerardo");
        endereco.setReferencia("");
        endereco.setTaxaEntrega(5.0);

        entityManager.getTransaction().begin();

        entityManager.persist(endereco);

        entityManager.getTransaction().commit();

        entityManager.clear();

        entityManager.find(Endereco.class, endereco.getId());

        Assert.assertNotNull(endereco);


    }

//    @Test
    public void adicionaCliente(){
        Cliente cliente = new Cliente();

        Endereco endereco = entityManager.find(Endereco.class, 2L);

        List<Endereco> enderecos = new ArrayList<>();

        enderecos.add(endereco);

        cliente.setNome("Auden");
        cliente.setNomeCompleto("Auden");
        cliente.setTelefone("986887002");
        cliente.setObservacoes("");
        cliente.setTaxaEntrega(5.0);
        cliente.setEnderecos(enderecos);



        entityManager.getTransaction().begin();

        entityManager.persist(cliente);

        entityManager.getTransaction().commit();

        entityManager.clear();

        entityManager.find(Cliente.class, cliente.getId());

        Assert.assertNotNull(cliente);


    }

//    @Test
    public void deletarCliente(){

//        Funcionario funcionarioDelete = entityManager.find(Funcionario.class, 5L);

        entityManager.getTransaction().begin();

//        entityManager.remove(funcionarioDelete);

        entityManager.getTransaction().commit();

        entityManager.clear();

//        Funcionario funcionarioResposta = entityManager.find(Funcionario.class, funcionarioDelete.getCadastro());

//        Assert.assertNull(funcionarioResposta);

    }

//    @Test
    public void modificarFuncionario(){
//        Funcionario funcionarioOrigem = entityManager.find(Funcionario.class, 1L);

        entityManager.getTransaction().begin();

//        funcionarioOrigem.setNome("Jonas");
//        funcionarioOrigem.setFuncao("Cozinheiro");
//        entityManager.merge(funcionarioOrigem);

        entityManager.getTransaction().commit();

        entityManager.clear();

//        Funcionario funcionarioResultado = entityManager.find(Funcionario.class, 1L);

//        Assert.assertEquals("Jonas", funcionarioResultado.getNome());
//        Assert.assertEquals("Cozinheiro", funcionarioResultado.getFuncao());


    }

}
