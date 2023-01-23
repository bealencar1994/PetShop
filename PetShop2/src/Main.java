import Classes.Clientes;

import Classes.Cachorro;
import Classes.Gato;
import Classes.EsquemaVacinal;
import Enum.Porte;
import Enum.EstadoAnimal;
import ReponseVO.ResponseVO;


import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PetShop petshop = new PetShop();

        Cachorro bolinha = new Cachorro();
        bolinha.setNome("bolinha");
        bolinha.setNascimento(LocalDate.parse("2023-01-01"));
        bolinha.setRaca("SRD");
        bolinha.setPorte(Porte.MEDIO);
        bolinha.setPeso(2.0);
        bolinha.setObservacoes("");
        bolinha.setEstadoAnimal(EstadoAnimal.NORMAL);
        bolinha.setVacinas(null);

        Clientes cliente1 = new Clientes();
        cliente1.setNome("Roberto");
        cliente1.setId(1);
        cliente1.pets.add(bolinha);

        Cachorro kiara = new Cachorro();
        kiara.setNome("kiara");
        kiara.setNascimento(LocalDate.parse("2020-05-01"));
        kiara.setRaca("golden");
        kiara.setPorte(Porte.GRANDE);
        kiara.setPeso(3.0);
        kiara.setObservacoes("");
        kiara.setEstadoAnimal(EstadoAnimal.SUJO);
        kiara.setVacinas(null);

        Gato thor = new Gato();
        thor.setNome("thor");
        thor.setNascimento(LocalDate.parse("2018-04-01"));
        thor.setRaca("Persa");
        thor.setPorte(Porte.MEDIO);
        thor.setPeso(5.0);
        thor.setObservacoes("");
        thor.setEstadoAnimal(EstadoAnimal.NORMAL);
        thor.setVacinas(null);

        Clientes cliente2 = new Clientes();
        cliente2.setNome("Bruno");
        cliente2.setId(2);
        cliente2.pets.add(kiara);
        cliente2.pets.add(thor);

        ResponseVO atendimentoClinico = petshop.atendimentoClinico(cliente1, cliente1.pets, cliente1.pets.get(0).getObservacoes());

        System.out.println(atendimentoClinico);
    }
}