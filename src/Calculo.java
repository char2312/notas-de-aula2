


public class Calculo {
    private double distancia,tarifaBase,fatorDemanda;
    private int tempoEspera;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getFatorDemanda() {
        return fatorDemanda;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }
    public void calcularValorCorrida(){
       double ValorFinal = (distancia*2) + (tempoEspera*0.5) + (tarifaBase*fatorDemanda);
        System.out.println("O valor final da corrida é: "+ValorFinal);
    }
    public void exibirDetalhesCorrida(){
        System.out.println("Distancia: "+distancia+" Tempo de espera: "+tempoEspera+ " Tarifa Base: "+tarifaBase+" Fator de Demanda"+ fatorDemanda);
    }
}
