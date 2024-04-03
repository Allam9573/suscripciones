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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearStreaming'");
    }

    @Override
    public List<TipoStreaming> listarTiposStreaming() {
        return (List<TipoStreaming>) this.tipoStreamingRepository.findAll();
    }

}
