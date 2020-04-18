-- Sequencia para a pessoa
CREATE SEQUENCE seq_pessoa
INCREMENT BY 1
  START WITH 1
NO MAXVALUE
NO MINVALUE
CACHE 1;

-- Criacao da tabela de pessoa
create table tb_pessoa
(
    pe_id integer NOT NULL
);

ALTER TABLE tb_pessoa ADD CONSTRAINT pk_pessoa PRIMARY KEY (pe_id);

comment on table tb_pessoa is 'Armazena as pessoas da família.';
comment on column tb_pessoa.pe_id is 'Código gerado automaticamente que identifica uma pessoa.';

-- Sequencia de familia
CREATE SEQUENCE seq_familia
INCREMENT BY 1
  START WITH 1
NO MAXVALUE
NO MINVALUE
CACHE 1;

-- Criacao da tabela de familia
create table tb_familia
(
    fa_id integer NOT NULL
);

ALTER TABLE tb_familia ADD CONSTRAINT pk_familia PRIMARY KEY (fa_id);

comment on table tb_familia is 'Armazena as famílias do sistema.';
comment on column tb_familia.fa_id is 'Código gerado automaticamente que identifica uma família.';