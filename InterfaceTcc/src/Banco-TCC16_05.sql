create database SGE;
use SGE;

create table endereco (
id_end int auto_increment not null primary key,
estado nvarchar (100) not null,
cidade nvarchar (100) not null,
rua nvarchar (100) not null,
bairro nvarchar (100) not null,
numero nvarchar(10) not null,
cep nvarchar (20) not null,
complemento nvarchar (50) default 'vazio'
);
select * from endereco;
 create table aluno (
ctr int auto_increment not null,
nome nvarchar (100) not null,
dt_nasc nvarchar(16) not null,
origem nvarchar (100) not null,
serie nvarchar (20) not null,
tr nvarchar (20),
tc nvarchar (20),
email nvarchar (50),
id_ende int,

rnome nvarchar (100) default 'vazio',
rgp nvarchar (20) default 'vazio',
rdt_nasc nvarchar (20) default 'vazio',
rcpf nvarchar (20) default 'vazio',
rrg nvarchar (20) default 'vazio',
rorg_exp nvarchar (30) default 'vazio',
rdia nvarchar (4) default '00',
rano nvarchar (8) default '0000',
rtc nvarchar(18) default 'vazio',
remail nvarchar (50) default 'vazio',
constraint pk_ctr primary key (ctr),
constraint pk_id_end foreign key (id_ende) references endereco (id_end));

create table curso(
id_curso int auto_increment not null,
curso nvarchar(50) not null,
carga_horaria varchar (20) not null,
descricao nvarchar (200) not null,
constraint pk_id_curso primary key (id_curso));
select c.curso, c.carga_horaria, c.descricao from curso c;
create table horario (
id_horario int auto_increment not null,
dias enum ('SEGUNDA-FEIRA','TERÇA-FEIRA','QUARTA-FEIRA','QUINTA-FEIRA','SABADO') not null,
horarios enum ('08-10','10-12','12-14','14-16','16-18','18-20') not null,
constraint pk_id_horario primary key (id_horario)
);

create table funcionario (
id_funcionario int auto_increment not null,
nome nvarchar (100) not null,
tr nvarchar (20),
tc nvarchar (20),
rg nvarchar (20),
funcao nvarchar(30),
usuario nvarchar (30) not null,
senha nvarchar (30) not null,
id_end int,
constraint pk_id_funcionario primary key (id_funcionario),
constraint pk_id_endereco foreign key (id_end) references endereco (id_end)
);

insert into funcionario(nome,funcao,usuario,senha) values('bruno','diretoria','bruno','1234');

create table turmas (
id_turmas int auto_increment not null,
ctr int,
id_curso int,
id_horario int,
id_funcionario int,
sala enum ('Sala 01', 'Sala 02', 'Sala 03'),
constraint pk_id_turmas primary key (id_turmas),
constraint fk_ctr foreign key (ctr) references aluno(ctr),
constraint fk_id_curso foreign key (id_curso) references curso(id_curso),
constraint fk_id_horario foreign key (id_horario) references horario(id_horario),
constraint fk_id_funcionario foreign key (id_funcionario) references funcionario(id_funcionario));

create table chamada(
idchamada int auto_increment not null,
ctr int,
id_funcionario int,
id_curso int,
id_horario int,
id_turmas int,
dt_chamada timestamp null DEFAULT current_timestamp,
presenca enum('P','F'),
constraint pk_idchamada primary key (idchamada),
constraint fk_id_turmas foreign key (id_turmas) references turmas(id_turmas));
