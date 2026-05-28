package org.example;

import java.util.ArrayList;
import java.util.List;

public class Panel {
    private Categoria categoria;
    private List<Object> panelistas; // Almacena tanto instancias individuales (Persona) como grupales (Agrupacion)
    private String horaPresentacion;

    public Panel(Categoria categoria, String horaPresentacion) {
        this.categoria = categoria;
        this.horaPresentacion = horaPresentacion;
        this.panelistas = new ArrayList<>();
    }

    public void agregarPanelista(Object panelista) {
        // TODO: Completar lógica método (debe validar si es instancia de Persona o Agrupacion antes de añadir)
        panelistas.add(panelista);
        System.out.println("Agregando panelista " + panelista);
    }

    public void eliminarPanelista(Object panelista) {
        // TODO: Completar lógica método
        panelistas.remove(panelista);
        System.out.println("Eliminando panelista " + panelista);
    }

    public void mostrarInformacion() {
        // TODO: Completar lógica método (mostrar hora, tema/categoría y quiénes exponen)
        System.out.println("Hora presentación: " + horaPresentacion + " | Tema o categoría: " + categoria);
        System.out.println();
        System.out.println("-- Lista de panelistas --");
        for(int i = 0; i < panelistas.size(); i++) {
            System.out.println((i+1) + ". " + panelistas.get(i));
        }
    }

    // Getters y Setters
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public List<Object> getPanelistas() { return panelistas; }
    public String getHoraPresentacion() { return horaPresentacion; }
    public void setHoraPresentacion(String horaPresentacion) { this.horaPresentacion = horaPresentacion; }
}
