package edu.udea.main.services;

import edu.udea.main.model.usuario;

import java.util.ArrayList;

public class GestorUsuario {



    private ArrayList<usuario> usuarios;

    public GestorUsuario(){
        this.usuarios = new ArrayList<>();
        this.usuarios.add(new usuario("prueba1","Prueba","1234"));


    }

    public ArrayList<usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
