<?php

//Conexão com banco de dados
$conexao = mysqli_connect('localhost', 'root', '','sge');
// mysqli_select_db('sge', $conexao);

if(!$conexao){
    die("Não foi possível se conectar ao Banco de Dados!" . mysqli_error());
}
?>