package br.com.thalita.casapopular.familiaapta.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TB_PESSOA")
@SequenceGenerator(name = "seq_pessoa", sequenceName = "seq_pessoa", allocationSize = 1)
public class Pessoa {

    @Id
    @Column(name = "PE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_pessoa")
    private Long id;

    @Column(name = "PE_NOME")
    private String nome;

    @Column(name = "PE_TIPO")
    private Tipo tipo;

    @Column(name = "PE_DATA_NASCIMENTO")
    private LocalDateTime dataDeNascimento;

    @Column(name = "PE_VALOR_RENDA")
    private BigDecimal valorRenda;

    @OneToMany
    @Column(name = "FA_ID")
    private Familia familia;

    public enum Tipo {
        PRETENDENTE,
        CONJUGE,
        DEPENDENTE
    }

}
