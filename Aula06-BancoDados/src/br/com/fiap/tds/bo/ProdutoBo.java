package br.com.fiap.tds.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.dao.ProdutoDao;
import br.com.fiap.tds.exception.EntidadeNaoEncontradaException;
import br.com.fiap.tds.exception.ParametroInvalidoException;

/**
 * Classe com regras de neg�cio e valida��es
 * @author Thiago Yamamoto
 */
public class ProdutoBo {

	private ProdutoDao produtoDao;
	
	/**
	 * Construtor que recebe a conex�o
	 * @param conexao
	 */
	public ProdutoBo(Connection conexao) {
		produtoDao = new ProdutoDao(conexao);
	}
	
	/**
	 * Valida o produto antes de realizar o cadastro
	 * @param produto
	 * @throws SQLException
	 * @throws ParametroInvalidoException 
	 */
	public void cadastrar(Produto produto) throws SQLException, ParametroInvalidoException {
		validar(produto);
		produtoDao.cadastrar(produto);
	}

	private void validar(Produto produto) throws ParametroInvalidoException {
		if (produto.getNome() == null || produto.getNome().length() > 80) {
			throw new ParametroInvalidoException("Nome � obrigat�rio ou no m�ximo de 80 caracteres");
		}
		if (produto.getValor() < 0) {
			throw new ParametroInvalidoException("O valor n�o pode ser negativo");
		}
		if (produto.getQuantidade() < 0) {
			throw new ParametroInvalidoException("A quantidade n�o pode ser negativa");
		}
		if (produto.getDescricao() != null && produto.getDescricao().length() > 355) {
			throw new ParametroInvalidoException("A descri��o n�o pode ter mais do que 255 caracteres");
		}
	}

	/**
	 * Atualiza o produto realizando uma valida��o dos campos
	 * @param produto Produto que ser� atualizado
	 * @throws ParametroInvalidoException
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Caso n�o encontre o produto para atualizar
	 */
	public void atualizar(Produto produto) throws ParametroInvalidoException, SQLException, EntidadeNaoEncontradaException {
		validar(produto);
		produtoDao.atualizar(produto);
	}
	
	/**
	 * Remove um produto pela PK
	 * @param codigo Pk do produto
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Caso n�o encontre o produto para remover
	 */
	public void remover(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		produtoDao.remover(codigo);
	}
	
	/**
	 * Lista todos os produtos
	 * @return Lista de produtos
	 */
	public List<Produto> listar(){
		return produtoDao.listar();
	}
	
	/**
	 * Pesquisa um produto pela PK
	 * @param codigo Pk do produto
	 * @return Produto encontrado
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Caso n�o encontre nenhum produto
	 */
	public Produto pesquisar(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		return produtoDao.pesquisar(codigo);
	}
	
}//classe