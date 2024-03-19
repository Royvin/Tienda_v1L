package com.tienda.dao;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface ProductoDao extends JpaRepository <Producto,Long> {
    
    public List<Producto> findByPrecioBetweenOrderByDescription(double precioInf, double precioSup);
}
