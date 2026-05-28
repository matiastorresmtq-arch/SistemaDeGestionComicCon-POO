package org.example;

import java.util.ArrayList;
import java.util.List;

public class Agrupacion {
    private String nombreGrupo;
    private List<Persona> miembros; // Relación de agregación (acepta Cosplayers y Artistas por Polimorfismo)
    private Categoria categoriaPrincipal;

    public Agrupacion(String nombreGrupo, Categoria categoriaPrincipal) {
        this.nombreGrupo = nombreGrupo;
        this.categoriaPrincipal = categoriaPrincipal;
        this.miembros = new ArrayList<>();
    }

    public void agregarMiembro(Persona persona) {
        miembros.add(persona);
        System.out.println("Agregando Miembro " + persona.getNombre());
    }

    public void eliminarMiembro(Persona persona) {
        miembros.remove(persona);
        System.out.println("Eliminando Miembro " + persona.getNombre());
    }

    public void mostrarInformacion() {
        // TODO: Completar lógica método (detalles del grupo, su categoría y recorrer la lista de miembros)
        System.out.println("Lista de miembros: ");
        for (int i = 0; i<miembros.size(); i++) {
            System.out.println((i + 1) + ". " + miembros.get(i).getNombre() + " - " + miembros.get(i).getCategorias());
        }
    }

    // Getters y Setters
    public String getNombreGrupo() { return nombreGrupo; }
    public void setNombreGrupo(String nombreGrupo) { this.nombreGrupo = nombreGrupo; }
    public List<Persona> getMiembros() { return miembros; }
    public Categoria getCategoriaPrincipal() { return categoriaPrincipal; }
    public void setCategoriaPrincipal(Categoria categoriaPrincipal) { this.categoriaPrincipal = categoriaPrincipal; }
}
