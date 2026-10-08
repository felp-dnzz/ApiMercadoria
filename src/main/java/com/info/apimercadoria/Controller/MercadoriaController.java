package com.info.apimercadoria.Controller;

import com.info.apimercadoria.Model.Mercadoria;
import com.info.apimercadoria.Service.MercadoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mercadoria")
public class MercadoriaController {
    @Autowired
    private MercadoriaService mercadoriaService;

    @GetMapping("/{id}")
    public ResponseEntity<Mercadoria> findById(@PathVariable String codbarras){
        return ResponseEntity.ok(mercadoriaService.findById(codbarras));
    }

    @GetMapping()
    public ResponseEntity<List<Mercadoria>> findAll(){
        return ResponseEntity.ok(mercadoriaService.findAll());
    }

    @PostMapping()
    public ResponseEntity<Mercadoria> save(@RequestBody Mercadoria mercadoria){
        return ResponseEntity.ok(mercadoriaService.save(mercadoria));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String codbarras){
        mercadoriaService.delete(codbarras);
    }
}
