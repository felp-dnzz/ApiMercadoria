package com.info.apimercadoria.Service;

import com.info.apimercadoria.Model.Mercadoria;
import com.info.apimercadoria.Repository.MercadoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MercadoriaService {
    @Autowired
    private MercadoriaRepository mercadoriaRepository;

    public Mercadoria findById(String codbarras){
        Optional<Mercadoria> mercadoria = mercadoriaRepository.findById(codbarras);
        return mercadoria.orElse(null);
    }
    public List<Mercadoria> findAll() {
        return mercadoriaRepository.findAll();
    }

    public Mercadoria save(Mercadoria mercadoria) {
        return mercadoriaRepository.save(mercadoria);
    }

    public void delete(int id) {
        mercadoriaRepository.deleteById(id);
    }
}
