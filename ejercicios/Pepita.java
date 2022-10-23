package ejercicios;

public class Pepita {
    private int energia = 100;
    private int posicionActual = 0;

    private void setEnergia(int eng) {
        energia = energia + eng;
    }

    private void volar(int km) {
        int consumo = -km * 10;
        setEnergia(consumo);
    }

    private int calcularEnergiaVuelo(int km) {
        return this.energia - km * 10;
    }

    public int calcularDistancia(int destino) {
        int distancia;
        if (destino < this.posicionActual) {
            distancia = this.posicionActual - destino;
        } else {
            distancia = destino - this.posicionActual;
        }
        System.out.println("Distancia de viaje: " + distancia);
        return distancia;
    }

    public boolean puedeHacerViaje(int destino) {
        int distancia = calcularDistancia(destino);
        boolean result = this.energia - calcularEnergiaVuelo(distancia) >= 0;
        System.out.println("Puede hacer viaje: " + result);
        return result;
    }

    public void hacerViaje(int destino) {
        int distanciaADestino = calcularDistancia(destino);
        if (puedeHacerViaje(destino)) {
            volar(distanciaADestino);
            posicionActual = destino;
            System.out.println("Viaje realizado al km: " + destino
                    + ". Energía restante es: " + this.energia);
        } else
            System.out.println("No hay energía suficiente para el viaje");
    }

    public void comer(int gramos) {
        int ganancia = gramos * 4;
        setEnergia(ganancia);
        System.out.println("Enegía actualizada: " + this.energia);
    }

    public int getPosicionActual() {
        System.out.println("Posición acutal: " + this.posicionActual);
        return this.posicionActual;
    }

    public int getEnergia() {
        System.out.println("Energia acutal: " + this.energia);
        return this.energia;
    }
}
