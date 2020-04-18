package br.com.thalita.casapopular.familiaapta.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@DynamicUpdate
@Table(name = "TB_FAMILIA")
@SequenceGenerator(name = "seq_familia", sequenceName = "seq_familia", allocationSize = 1)
public class Familia {

    @Id
    @Column(name = "FA_ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_familia")
    private Long id;

    @Column(name = "FA_STATUS")
    private Status status;


    @Column(name = "FA_DATA_SELECAO")
    private LocalDateTime dataDeSelecao;

    private List<Pessoa> pessoas;

    public Integer pontuacao () {
        return 1;
    }

    public Boolean apta () {
        return Boolean.FALSE;
    }

    public enum Status {
        CADASTRO_VALIDO("0"),
        POSSUI_CASA("1"),
        OUTRO_PROCESSO_SELECAO("2"),
        CADASTRO_INCOMPLETO("3")
    }

}