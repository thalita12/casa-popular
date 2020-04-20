-- Carga inicial de dados

-- Familia
insert into tb_familia (fa_id, fa_status, fa_data_selecao)
values
    (9, 'CADASTRO_VALIDO', '2020-04-19'),
    (10, 'CADASTRO_VALIDO', '2020-01-26'),
    (11, 'CADASTRO_VALIDO', '2020-02-13'),
    (12, 'CADASTRO_VALIDO', '2019-10-28'),
    (13, 'CADASTRO_VALIDO', '2019-10-29');

-- Pessoas
insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (37, 'Marília Mendonça', 'PRETENDENTE', '1989-12-30', 1050, 9),
    (38, 'João Mendonça', 'CONJUGE', '1987-10-06', 950, 9),
    (39, 'Alcione Mendonça', 'DEPENDENTE', '2013-04-15', null, 9),
    (40, 'Wagner Mendonça', 'DEPENDENTE', '2016-07-08', null, 9);

insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (41, 'Janete Oliveira', 'PRETENDENTE', '1962-12-30', 500, 10),
    (42, 'Rodrigo Oliveira', 'CONJUGE', '1960-10-06', null, 10),
    (43, 'Rodrigo Oliveira Junior', 'DEPENDENTE', '2010-04-15', null, 10),
    (44, 'Claúdia Oliveira', 'DEPENDENTE', '2011-04-15', null, 10),
    (45, 'Valentina Oliveira', 'DEPENDENTE', '2013-02-06', null, 10),
    (46, 'Enzo Oliveira', 'DEPENDENTE', '2016-02-06', null, 10);

insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (47, 'Augusto Ribeiro', 'PRETENDENTE', '1954-12-30', 450, 11),
    (48, 'Leandra Ribeiro', 'CONJUGE', '1987-10-06', 200, 11),
    (49, 'Fábio Ribeiro', 'DEPENDENTE', '2005-04-15', null, 11);

insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (50, 'Albertina Salomão', 'PRETENDENTE', '1950-12-30', 1000, 12),
    (51, 'Franciso Salomão', 'CONJUGE', '1951-10-06', 1000, 12);

insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (52, 'Ana Vitória Soares', 'PRETENDENTE', '1993-12-30', 700, 13),
    (53, 'Bruno Soares', 'CONJUGE', '1994-10-06', 800, 13),
    (54, 'Talison Soares', 'DEPENDENTE', '2010-04-15', null, 13),
    (55, 'Alexandra Soares', 'DEPENDENTE', '2011-04-15', null, 13),
    (56, 'Inácia Soares', 'DEPENDENTE', '2013-02-06', null, 13),
    (57, 'Paulo Soares', 'DEPENDENTE', '2016-02-06', null, 13);
