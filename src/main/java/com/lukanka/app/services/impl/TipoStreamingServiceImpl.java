package com.lukanka.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lukanka.app.entities.TipoStreaming;
import com.lukanka.app.respositories.TipoStreamingRepository;
import com.lukanka.app.services.TipoStreamingService;

@Service
public class TipoStreamingServiceImpl implements TipoStreamingService {

    @Autowired
    private TipoStreamingRepository tipoStreamingRepository;

    @Override
    public TipoStreaming crearStreaming(TipoStreaming tipoStreaming) {
        return this.tipoStreamingRepository.save(tipoStreaming);
    }

    @Override
    public List<TipoStreaming> listarTiposStreaming() {
        return (List<TipoStreaming>) this.tipoStreamingRepository.findAll();
    }

    @Override
    public TipoStreaming buscarStreaming(int id) {
        return this.tipoStreamingRepository.findById(id).get();
    }

    @Override
    public TipoStreaming actualizarStreaming(int id, TipoStreaming tipoStreaming) {
        TipoStreaming actualizarStreaming = this.tipoStreamingRepository.findById(id).get();
        if (null != actualizarStreaming) {
            actualizarStreaming.setDescripcion(tipoStreaming.getDescripcion());
            this.tipoStreamingRepository.save(actualizarStreaming);
        }
        return actualizarStreaming;
    }

    @Override
    public TipoStreaming eliminar(int id) {
        TipoStreaming eliminarStreaming = this.tipoStreamingRepository.findById(id).get();
        this.tipoStreamingRepository.delete(eliminarStreaming);
        return eliminarStreaming;
    }

}
