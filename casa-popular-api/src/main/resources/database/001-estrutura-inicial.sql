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
    fa_id integer NOT NULL,
    fa_status varchar(50),
    fa_data_selecao timestamp(6)
);

ALTER TABLE tb_familia ADD CONSTRAINT pk_familia PRIMARY KEY (fa_id);

comment on table tb_familia is 'Armazena as famílias do sistema.';
comment on column tb_familia.fa_id is 'Código gerado automaticamente que identifica uma família.';
comment on column tb_familia.fa_status is 'Status de uma família.';
comment on column tb_familia.fa_data_selecao is 'Data que uma família foi selecionada.';

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
    pe_id integer NOT NULL,
    pe_nome varchar(255),
    pe_tipo varchar(50),
    pe_data_nascimento timestamp(6),
    pe_valor_renda numeric(18,8),
    fa_id bigint
);

ALTER TABLE tb_pessoa ADD CONSTRAINT pk_pessoa PRIMARY KEY (pe_id);
ALTER TABLE tb_pessoa ADD CONSTRAINT fk_familia FOREIGN KEY (fa_id) REFERENCES tb_familia (fa_id);

comment on table tb_pessoa is 'Armazena as pessoas da família.';
comment on column tb_pessoa.pe_id is 'Código gerado automaticamente que identifica uma pessoa.';
comment on column tb_pessoa.pe_nome is 'Nome que identifica uma pessoa.';
comment on column tb_pessoa.pe_tipo is 'Tipo de uma pessoa.';
comment on column tb_pessoa.pe_data_nascimento is 'Data de nascimento de uma pessoa.';
comment on column tb_pessoa.pe_valor_renda is 'Valor da renda de uma pessoa.';
comment on column tb_pessoa.fa_id is 'Identificador da família de uma pessoa.';
