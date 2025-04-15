package io.github.arquiteturaspring.montadora.api;

import io.github.arquiteturaspring.montadora.CarroStatus;
import io.github.arquiteturaspring.montadora.Chave;
import io.github.arquiteturaspring.montadora.HondaHRV;
import io.github.arquiteturaspring.montadora.Motor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteFabricaController {

    private Motor motor;

    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }


}
