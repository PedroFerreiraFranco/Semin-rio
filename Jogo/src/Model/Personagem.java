/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author pedro
 */
public class Personagem {
    private EstadoPersonagem estadoAtual;

    public Personagem(EstadoPersonagem estado) {
        this.estadoAtual = estado;
    }

    public void setEstado(EstadoPersonagem estado) {
        this.estadoAtual = estado;
    }

    public void realizarAcao() {
        estadoAtual.executarAcao();
    }
}
