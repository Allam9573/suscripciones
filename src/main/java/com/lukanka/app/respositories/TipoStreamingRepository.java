package com.lukanka.app.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lukanka.app.entities.TipoStreaming;

@Repository
public interface TipoStreamingRepository extends CrudRepository<TipoStreaming, Integer> {

    public TipoStreaming findByDescripcion(String descripcion);

}
