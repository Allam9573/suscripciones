package com.lukanka.app.services;

import java.util.List;

import com.lukanka.app.entities.TipoStreaming;

public interface TipoStreamingService {

    public TipoStreaming crearStreaming(TipoStreaming tipoStreaming);

    public List<TipoStreaming> listarTiposStreaming();

    public TipoStreaming buscarStreaming(int id);

    public TipoStreaming actualizarStreaming(int id, TipoStreaming tipoStreaming);

}
