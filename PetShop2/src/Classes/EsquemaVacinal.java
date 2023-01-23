package Classes;

import Enum.Vacina;
import java.time.LocalDate;

public class EsquemaVacinal {
    LocalDate date;
    Vacina vacina;
    String observacao;

    public EsquemaVacinal() {

    }
    public EsquemaVacinal(LocalDate date, Vacina vacina, String observacao) {
        this.date = date;
        this.vacina = vacina;
        this.observacao = observacao;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "EsquemaVacinal{" +
                "date=" + date +
                ", vacina=" + vacina +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}