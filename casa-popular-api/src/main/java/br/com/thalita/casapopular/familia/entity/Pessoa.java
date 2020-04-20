package br.com.thalita.casapopular.familia.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_PESSOA")
@SequenceGenerator(name = "seq_pessoa", sequenceName = "seq_pessoa", allocationSize = 1)
public class Pessoa implements Serializable {

    @Id
    @Column(name = "PE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_pessoa")
    private Long id;

    @Column(name = "PE_NOME")
    private String nome;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "PE_TIPO", length = 15)
    private Tipo tipo;

    @Column(name = "PE_DATA_NASCIMENTO")
    private LocalDateTime dataDeNascimento;

    @Column(name = "PE_VALOR_RENDA")
    private BigDecimal valorRenda;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FA_ID")
    private Familia familia;

    public enum Tipo {
        PRETENDENTE,
        CONJUGE,
        DEPENDENTE
    }

}
