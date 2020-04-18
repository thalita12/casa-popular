package br.com.thalita.casapopular.familiaapta.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TB_FAMILIA")
@SequenceGenerator(name = "seq_familia", sequenceName = "seq_familia", allocationSize = 1)
public class Familia implements Serializable {

    @Id
    @Column(name = "FA_ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_familia")
    private Long id;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "FA_STATUS", length = 25)
    private Status status;

    @Column(name = "FA_DATA_SELECAO")
    private LocalDateTime dataDeSelecao;

    @OneToMany(mappedBy="familia", fetch = FetchType.LAZY)
    private List<Pessoa> pessoas;

    public Integer pontuacao () {
        return 1;
    }

    public Boolean apta () {
        return Boolean.FALSE;
    }

    public enum Status {
        CADASTRO_VALIDO,
        POSSUI_CASA,
        OUTRO_PROCESSO_SELECAO,
        CADASTRO_INCOMPLETO
    }

}