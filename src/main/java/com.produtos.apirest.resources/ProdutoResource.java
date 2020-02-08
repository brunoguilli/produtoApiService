package com.produtos.apirest.resources;

import com.produtos.apirest.repository.ProdutoRepository;
import com.produtos.apirest.models.Produto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// Classe que faz as requisições http
@RestController
// Caminho para acessar o controlador
@RequestMapping("/api")
// Swagger
@Api(value = "API REST PRODUTOS")
//Libera todos os dominios para acessar a api
// Para somente um dominio especifico acessa a api @CrossOrigin(origins = "/http:dominio")
@CrossOrigin(origins = "*")
public class ProdutoResource {

    // Permite que o spring injete as dependências nessa classe
    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    @ApiOperation(value = "Retorna uma lista de produtos")
    public List<Produto> listaProdutos(){
        return produtoRepository.findAll();
    }

    // Retorna produto por ID
    // Inserir notacão na ProdutoRepository
    @GetMapping("/produto/{id}")
    @ApiOperation(value = "Retorna um produto único")
    public Produto listaProdutoUnico(@PathVariable(value="id") long id){
        return produtoRepository.findById(id);
    }

    @PostMapping("/produto")
    @ApiOperation(value = "Este método salva um produto")
    // Vai receber através do corpo da requisição para ser salvo no banco de dados
    public Produto salvaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produto")
    @ApiOperation(value = "Este método deleta um produto")
    // Vai receber através do corpo da requisição para ser salvo no banco de dados
    public void deletaProduto(@RequestBody Produto produto){
        produtoRepository.delete(produto);
    }

    // Atualiza o produto
    @PutMapping("/produto")
    @ApiOperation(value = "Este método atualiza um produto")
    // Vai receber através do corpo da requisição para ser salvo no banco de dados
    public Produto atualizaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

}
