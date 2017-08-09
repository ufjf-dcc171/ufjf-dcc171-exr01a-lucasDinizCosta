package br.ufjf.dcc171;

public class Objeto {
    Float largura;
    Float altura;
    Float comprimento;
    Float volume;
    
    public Objeto(Float largura, Float altura, Float comprimento){
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
    }
    
    public Objeto(){
    }
    
    public Float getLargura() {
        return largura;
    }

    public void setLargura(Float largura) {
        this.largura = largura;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getComprimento() {
        return comprimento;
    }

    public void setComprimento(Float comprimento) {
        this.comprimento = comprimento;
    }
    
    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }
    
    public void calculaVolume(){
        volume = altura*largura*comprimento;
    }
}
