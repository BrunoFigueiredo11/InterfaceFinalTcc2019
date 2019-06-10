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

 create table aluno (
ctr int auto_increment not null,
nome nvarchar (100) not null default "Vazio",
dt_nasc nvarchar(16) not null default "Vazio",
origem nvarchar (100) not null default "Vazio",
serie nvarchar (20) not null default "Vazio",
tr nvarchar (20) default "Vazio",
tc nvarchar (20) default "Vazio",
email nvarchar (50) default "Vazio",
id_ende int,

rnome nvarchar (100),
rgp nvarchar (20),
rdt_nasc nvarchar (20),
rcpf nvarchar (20),
rrg nvarchar (20),
rorg_exp nvarchar (100),
rdia nvarchar (4),
rano nvarchar (8),
rcel nvarchar(18),
remail nvarchar (50),
constraint pk_ctr primary key (ctr),
constraint pk_id_end foreign key (id_ende) references endereco (id_end));

create table curso(
id_curso int auto_increment not null,
curso nvarchar(50) not null,
carga_horaria varchar (20) not null,
descricao nvarchar (200) not null,
constraint pk_id_curso primary key (id_curso));

create table horario (
id_horario int auto_increment not null,
horario enum ('08-10','10-12','12-14','14-16','16-18','18-20') not null,
constraint pk_id_horario primary key (id_horario)
);
-- INSERINDO HORARIOS NA TABELA HORARIO
insert into horario values (default,'08-10');
insert into horario values (default,'10-12');
insert into horario values (default,'12-14');
insert into horario values (default,'14-16');
insert into horario values (default,'16-18');
insert into horario values (default,'18-20');

create table dia(
id_dia int auto_increment not null primary key,
dia enum ('SEGUNDA-FEIRA','TERCA-FEIRA','QUARTA-FEIRA','QUINTA-FEIRA','SABADO') not null
);

-- INSERINDO DIAS NA TABELA DIA
insert into dia values(default,'SEGUNDA-FEIRA');
insert into dia values(default,'TERCA-FEIRA');
insert into dia values(default,'QUARTA-FEIRA');
insert into dia values(default,'QUINTA-FEIRA');
insert into dia values(default,'SABADO');

create table funcionario (
id_funcionario int auto_increment not null,
fnome nvarchar (100) not null,
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
insert into funcionario (fnome,funcao,usuario,senha) values ('Bruno Figueiredo','Diretoria','Bruno','1234');

create table turmas (
id_turmas int auto_increment not null,
ctr int,
id_curso int,
id_horario int,
id_dia int,
id_funcionario int,
sala enum ('Sala 01', 'Sala 02', 'Sala 03'),
constraint pk_id_turmas primary key (id_turmas),
constraint fk_ctr foreign key (ctr) references aluno(ctr),
constraint fk_id_curso foreign key (id_curso) references curso(id_curso),
constraint fk_id_horario foreign key (id_horario) references horario(id_horario),
constraint fk_id_dia foreign key (id_dia) references dia(id_dia),
constraint fk_id_funcionario foreign key (id_funcionario) references funcionario(id_funcionario));

/*select a.ctr,a.nome,a.dt_nasc , a.origem , a.serie , a.tr, a.tc, a.email, a.id_ende ,
a.rnome,a.rgp,a.rdt_nasc,a.rcpf,a.rrg,a.rorg_exp,a.rdia,a.rano,a.rcel,a.remail,
c.id_curso,c.curso,
h.id_horario,h.horario,
d.id_dia,d.dia,
f.id_funcionario,f.nome,
 t.sala from turmas t inner join aluno a on a.ctr = t.ctr 
inner join curso c on c.id_curso = t.id_curso 
inner join horario h on h.id_horario = t.id_horario 
inner join dia d on d.id_dia = t.id_dia
inner join funcionario f on f.id_funcionario = t.id_funcionario;  
*/

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



