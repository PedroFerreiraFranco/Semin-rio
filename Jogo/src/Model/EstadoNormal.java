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
public class EstadoNormal implements EstadoPersonagem{
    @Override
    public void executarAcao() {
        System.out.println("Personagem em estado normal.");
    }

}
