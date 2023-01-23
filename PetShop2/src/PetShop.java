
import Classes.*;
import Enum.Higiene;
import Enum.Servicos;
import Enum.Vacina;

import ReponseVO.ResponseVO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class PetShop {

    private String cnpj;

    private Endereco endereco;

    public ResponseVO higienizar (Clientes cliente, List<Animal> animais, Higiene higiene, String observacao) {

        ResponseVO responseVO = new ResponseVO();
        responseVO.setId(1);
        responseVO.setServico(Servicos.HIGIENIZAR);
        responseVO.setValor(BigDecimal.valueOf(70));
        responseVO.setCliente(cliente);
        return responseVO;
    }

    public ResponseVO atendimentoClinico(Clientes cliente, List<Animal> animais, String observacao) {

        String pedidoVacina = "";
        Random gerarVacina = new Random();
        int numeroVacina = gerarVacina.nextInt(5);

        if (numeroVacina == 1) {
            pedidoVacina = String.valueOf(Vacina.VACINA_1);
        } else if (numeroVacina == 2) {
            pedidoVacina = String.valueOf(Vacina.VACINA_2);
        } else if (numeroVacina == 3) {
            pedidoVacina = String.valueOf(Vacina.VACINA_3);
        } else if (numeroVacina == 4) {
            pedidoVacina = String.valueOf(Vacina.VACINA_4);
        } else if (numeroVacina == 5) {
            pedidoVacina = String.valueOf(Vacina.VACINA_5);
        } else {
            pedidoVacina = "Sem Pedido";
        }

        cliente.pets.get(0).setObservacoes(pedidoVacina);
        ResponseVO responseVO = new ResponseVO();
        responseVO.setId(2);
        responseVO.setServico(Servicos.ATENDIMENTO_CLINICO);
        responseVO.setValor(BigDecimal.valueOf(100));
        responseVO.setCliente(cliente);
        return responseVO;
    }

    public ResponseVO vacinacao(Clientes cliente, List<Animal> animais, List<EsquemaVacinal> esquemaVacinalList, String observacao) {

        ResponseVO responseVO = new ResponseVO();
        responseVO.setId(3);
        responseVO.setServico(Servicos.VACINACAO);
        responseVO.setValor(BigDecimal.valueOf(80));
        responseVO.setCliente(cliente);
        return responseVO;
    }

    public void verAlimentos () {
        

    }

    public void verRemedios() {

    }

    public void pagamentos(List<Integer> itens) {

    }
}
