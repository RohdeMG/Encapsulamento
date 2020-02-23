package app;


public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;



    //Construtor
    public ControleRemoto() {
        //as 3 variáveis incializam assim:
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
    @Override //sobreescrevendo o método ligar, pq ele já existe no Controlador.
    public void ligar() {
       this.setLigado(true);
    }

    @Override
    public void desligar() {
       this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
       System.out.println("Está ligado? "+ this.getLigado()); 
       System.out.println("Está tocando? " + this.getTocando());
       System.out.print("Volume: " + this.getVolume());
       for(int i = 0; i <= this.getVolume(); i+=10){ //enquanto estiver dentro de 10, printa.
        System.out.print("|");
       }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");

    }

    @Override
    public void maisVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }

    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }

    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }

    }
    
}
