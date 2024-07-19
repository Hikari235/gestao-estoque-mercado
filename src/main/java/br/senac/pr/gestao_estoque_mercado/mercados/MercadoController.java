package br.senac.pr.gestao_estoque_mercado.mercados;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.pr.gestao_estoque_mercado.mercados.dto.CreateMercadoDto;
import br.senac.pr.gestao_estoque_mercado.mercados.impl.MercadoServiceImpl;
import br.senac.pr.gestao_estoque_mercado.shared.models.Mercado;

@RestController
@RequestMapping("/mercados")
public class MercadoController {
    
    private final MercadoServiceImpl mercadoService;

    public MercadoController(MercadoServiceImpl mercadoService) {
        this.mercadoService = mercadoService;
    }
// Criar um novo produto
    @PostMapping
    public ResponseEntity<Mercado> save(@RequestBody CreateMercadoDto dto) {
        var saved = this.mercadoService.save(dto);
        return ResponseEntity.ok(saved);
    }
}
