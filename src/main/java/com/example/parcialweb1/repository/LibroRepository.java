package com.example.parcialweb1.repository;

import com.example.parcialweb1.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    // No se necesita agregar métodos aquí, ya que JpaRepository proporciona los métodos básicos para CRUD
}
