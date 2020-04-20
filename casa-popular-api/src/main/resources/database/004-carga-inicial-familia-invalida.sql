-- Carga inicial de dados

-- Familia
insert into tb_familia (fa_id, fa_status, fa_data_selecao)
values
    (14, 'CADASTRO_INCOMPLETO', null),
    (15, 'OUTRO_PROCESSO_SELECAO', null),
    (16, 'POSSUI_CASA', null),
    (17, 'OUTRO_PROCESSO_SELECAO', null);

alter sequence seq_familia restart with 18;

-- Pessoas
insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (58, 'Laíde Almeida', 'PRETENDENTE', '1989-12-30', 1050, 14),
    (59, 'Agnaldo Almeida', 'CONJUGE', '1987-10-06', 950, 14),
    (60, 'Silvio Almeida', 'DEPENDENTE', '2013-04-15', null, 14),
    (61, 'Joana Almeida', 'DEPENDENTE', '2016-07-08', null, 14);

insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (62, 'Juliano Lopes', 'PRETENDENTE', '1954-12-30', 450, 15),
    (63, 'Fabíula Lopes', 'CONJUGE', '1987-10-06', 200, 15),
    (64, 'Letícia Lopes', 'DEPENDENTE', '2005-04-15', null, 15);

insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (65, 'Liana Alvarenga', 'PRETENDENTE', '1950-12-30', 1000, 16),
    (66, 'Maicon Alvarenga', 'CONJUGE', '1951-10-06', 1000, 16);

insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (67, 'Daiana Juarez', 'PRETENDENTE', '1993-12-30', 700, 17),
    (68, 'Diego Juarez', 'CONJUGE', '1994-10-06', 800, 17),
    (69, 'Sabrina Juarez', 'DEPENDENTE', '2010-04-15', null, 17);

alter sequence seq_pessoa restart with 70;
