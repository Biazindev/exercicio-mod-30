/**
 * 
 */
package br.com.tbiazin.services;

import br.com.tbiazin.dao.IProdutoDAO;
import br.com.tbiazin.domain.Produto;
import br.com.tbiazin.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
