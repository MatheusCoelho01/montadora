package io.github.arquiteturaspring.montadora;

import java.awt.*;

public class HondaHRV extends Carro {

    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("Honda HR-V");
        setCor(Color.BLACK);
        setMontadora(Montadora.HONDA);
    }


}
