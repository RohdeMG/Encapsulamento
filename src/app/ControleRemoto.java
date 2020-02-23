package app;


public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;



    //Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }



    private int getVolume() { //getter e setter sempre acessam as variáveis private or protect.
        return this.volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }



    private boolean getLigado() {
        return this.ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }



    private boolean getTocando() {
        return this.tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }



    //Aqui os MÉTODOS ABSTRATOS
    @Override
    public void ligar() {
       
    }

    @Override
    public void desligar() {
       
    }

    @Override
    public void abrirMenu() {
       
    }

    @Override
    public void fecharMenu() {
        // TODO Auto-generated method stub

    }

    @Override
    public void maisVolume() {
        // TODO Auto-generated method stub

    }

    @Override
    public void menosVolume() {
        // TODO Auto-generated method stub

    }

    @Override
    public void ligarMudo() {
        // TODO Auto-generated method stub

    }

    @Override
    public void desligarMudo() {
        // TODO Auto-generated method stub

    }

    @Override
    public void play() {
        // TODO Auto-generated method stub

    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub

    }
    
}
