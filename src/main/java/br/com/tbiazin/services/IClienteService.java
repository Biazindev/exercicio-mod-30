/**
 * 
 */
package br.com.tbiazin.services;

import br.com.tbiazin.domain.Cliente;
import br.com.tbiazin.exceptions.DAOException;
import br.com.tbiazin.exceptions.TipoChaveNaoEncontradaException;
import br.com.tbiazin.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
