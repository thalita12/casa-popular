-- Carga inicial de dados

-- Familia
insert into tb_familia (fa_id, fa_status, pe_data_selecao)
values
    (1, '2', null);
alter sequence seq_familia restart with 2;

-- Pessoas
insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (1, 'Fernanda Silva Pereira', 'PRETENDENTE', '1989-12-30', 1050, 1),
    (2, 'João Carlos Pereira', 'CONJUGE', '1987-10-06', 950, 1),
    (3, 'Ágata Silva Pereira', 'DEPENDENTE', '2013-04-15', null, 1),
    (4, 'Alice Silva Pereira', 'DEPENDENTE', '2016-07-08', null, 1);
alter sequence seq_pessoa restart with 4;
