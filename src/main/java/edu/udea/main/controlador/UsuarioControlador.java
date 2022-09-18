package edu.udea.main.controlador;


import edu.udea.main.services.GestorUsuario;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import edu.udea.main.model.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UsuarioControlador {

    private GestorUsuario gestorUsuario = new GestorUsuario();

    @GetMapping("/usuarios")
    public ResponseEntity<ArrayList<usuario>> getUsuarios(){
        return new ResponseEntity<>(gestorUsuario.getUsuarios(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/usuario")
    public String getusuario(@RequestParam String id){

    return id;
    }




}
