-- Carga inicial de dados

-- Familia
insert into tb_familia (fa_id, fa_status, fa_data_selecao)
values
    (1, 'CADASTRO_VALIDO', null),
    (2, 'CADASTRO_VALIDO', null),
    (3, 'CADASTRO_VALIDO', null),
    (4, 'CADASTRO_VALIDO', null),
    (5, 'CADASTRO_VALIDO', null),
    (6, 'CADASTRO_VALIDO', null),
    (7, 'CADASTRO_VALIDO', null),
    (8, 'CADASTRO_VALIDO', null);

-- Pessoas
insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (1, 'Fernanda Silva Pereira', 'PRETENDENTE', '1989-12-30', 1050, 1),
    (2, 'João Carlos Pereira', 'CONJUGE', '1987-10-06', 950, 1),
    (3, 'Ágata Silva Pereira', 'DEPENDENTE', '2013-04-15', null, 1),
    (4, 'Alice Silva Pereira', 'DEPENDENTE', '2016-07-08', null, 1);

insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (5, 'Luísa Costa Almeida', 'PRETENDENTE', '1950-12-30', 1000, 2),
    (6, 'Pedro Guimarães', 'CONJUGE', '1951-10-06', 1000, 2);

insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (7, 'Erli Santos', 'PRETENDENTE', '1970-12-30', 1050, 3),
    (8, 'Dina Santos', 'CONJUGE', '1975-10-06', null, 3),
    (9, 'Jorge Santos', 'DEPENDENTE', '2013-04-15', null, 3),
    (10, 'Juliana Santos', 'DEPENDENTE', '1992-07-08', 400, 3);

insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (11, 'Sandro Reis', 'PRETENDENTE', '1954-12-30', 450, 4),
    (12, 'Maria Reis', 'CONJUGE', '1987-10-06', 200, 4),
    (13, 'Yasmim Reis', 'DEPENDENTE', '2005-04-15', null, 4);

insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (14, 'Gisele Aparecida da Luz', 'PRETENDENTE', '1962-12-30', 3000, 5),
    (15, 'Jurandir Brás', 'CONJUGE', '1960-10-06', 2500, 5),
    (16, 'Isabela da Luz Brás', 'DEPENDENTE', '2005-04-15', null, 5),
    (17, 'Isadora da Luz Brás', 'DEPENDENTE', '2005-04-15', null, 5),
    (18, 'João Miguel da Luz Brás', 'DEPENDENTE', '2019-02-06', null, 5),
    (19, 'Caio da Luz Brás', 'DEPENDENTE', '2014-02-06', null, 5);

insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (20, 'Patrícia Santana', 'CONJUGE', '1988-12-30', 600, 6),
    (21, 'Jamilson Vieira', 'PRETENDENTE', '1984-10-06', 1000, 6),
    (22, 'Cibele Santana Vieira', 'DEPENDENTE', '2015-04-15', null, 6),
    (23, 'Carlos Santana Vieira', 'DEPENDENTE', '2018-07-08', null, 6),
    (24, 'Guilherme Santana Vieira', 'DEPENDENTE', '2001-07-08', 200, 6);

insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (25, 'Janete Florença', 'PRETENDENTE', '1962-12-30', 500, 7),
    (26, 'Bartolomeu Florença', 'CONJUGE', '1960-10-06', null, 7),
    (27, 'Bartolomeu Florença Junior', 'DEPENDENTE', '2010-04-15', null, 7),
    (28, 'Laura Florença', 'DEPENDENTE', '2011-04-15', null, 7),
    (29, 'Simone Florença', 'DEPENDENTE', '2013-02-06', null, 7),
    (30, 'Enzo Florença', 'DEPENDENTE', '2016-02-06', null, 7);

insert into tb_pessoa (pe_id, pe_nome, pe_tipo, pe_data_nascimento, pe_valor_renda, fa_id)
values
    (31, 'Lucia Florença', 'PRETENDENTE', '1993-12-30', 700, 8),
    (32, 'Luciano Florença', 'CONJUGE', '1994-10-06', 800, 8),
    (33, 'Luís Florença', 'DEPENDENTE', '2010-04-15', null, 8),
    (34, 'Maria Paula Florença', 'DEPENDENTE', '2011-04-15', null, 8),
    (35, 'Ana Florença', 'DEPENDENTE', '2013-02-06', null, 8),
    (36, 'Elsa Florença', 'DEPENDENTE', '2016-02-06', null, 8);
