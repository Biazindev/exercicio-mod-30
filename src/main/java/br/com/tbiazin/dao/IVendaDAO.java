/**
 * 
 */
package br.com.tbiazin.dao;

import br.com.tbiazin.dao.generic.IGenericDAO;
import br.com.tbiazin.domain.Venda;
import br.com.tbiazin.exceptions.DAOException;
import br.com.tbiazin.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
