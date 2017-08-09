package br.ufjf.dcc171;

import javax.swing.JOptionPane;

public class Aula01Exr01a {

    public static void main(String[] args) {
        Objeto obj = new Objeto();
        try{
            Float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura(cm): ", "Altura"));
            Float comprimento = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o comprimento(cm): ", "Comprimento"));
            Float largura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a largura(cm): ", "Largura"));
            obj.setAltura(altura);
            obj.setComprimento(comprimento);
            obj.setLargura(largura);
            obj.calculaVolume();
            JOptionPane.showMessageDialog(null, "O Volume do objeto eh: " + obj.getVolume(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "PARAMETROS INVALIDOS!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }

}
