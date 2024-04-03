package com.lukanka.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lukanka.app.entities.TipoStreaming;
import com.lukanka.app.services.impl.TipoStreamingServiceImpl;

@RestController
@RequestMapping("/api/streaming")
public class TipoStreamingController {

    @Autowired
    private TipoStreamingServiceImpl tipoStreamingServiceImpl;

    @PostMapping("/crear")
    public TipoStreaming crearStreaming(@RequestBody TipoStreaming tipoStreaming) {
        return this.tipoStreamingServiceImpl.crearStreaming(tipoStreaming);
    }

    @GetMapping({ "", "/" })
    public List<TipoStreaming> listarStreaming() {
        return this.tipoStreamingServiceImpl.listarTiposStreaming();
    }

    @GetMapping("/search/{id}")
    public TipoStreaming buscar(@PathVariable int id) {
        return this.tipoStreamingServiceImpl.buscarStreaming(id);
    }

    @GetMapping("/search")
    public TipoStreaming buscar1(@RequestParam int id) {
        return this.tipoStreamingServiceImpl.buscarStreaming(id);

    }

    @PutMapping("/actualizar/{id}")
    public TipoStreaming actualizarStreaming(@PathVariable int id, @RequestBody TipoStreaming tipoStreaming) {
        System.out.println(tipoStreaming);
        return this.tipoStreamingServiceImpl.actualizarStreaming(id, tipoStreaming);
    }

}
