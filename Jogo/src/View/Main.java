/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.EstadoAtacando;
import Model.EstadoDefendendo;
import Model.EstadoNormal;
import Model.Personagem;
import Model.EstadoPersonagem;

/**
 *
 * @author pedro
 */
public class Main {
    public static void main(String[] args) {
        EstadoPersonagem estadoNormal = new EstadoNormal();
        EstadoPersonagem estadoAtacando = new EstadoAtacando();
        EstadoPersonagem estadoDefendendo = new EstadoDefendendo();

        Personagem personagem = new Personagem(estadoNormal);
        personagem.realizarAcao();  // Saída: Personagem em estado normal.

        personagem.setEstado(estadoAtacando);
        personagem.realizarAcao();  // Saída: Personagem atacando inimigos.

        personagem.setEstado(estadoDefendendo);
        personagem.realizarAcao();  // Saída: Personagem defendendo contra ataques.
    }
}
