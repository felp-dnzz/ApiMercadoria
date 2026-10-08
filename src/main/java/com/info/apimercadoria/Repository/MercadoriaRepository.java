package com.info.apimercadoria.Repository;

import com.info.apimercadoria.Model.Mercadoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MercadoriaRepository extends JpaRepository<Mercadoria, String> {
}
