<?php
include ("conexao.php");

//Campos que retornarão valores
$user=($_POST['usuario']);
$senha=($_POST['senha']);
$entrar=($_POST['entrar']);

//Função para realização do Login
function efetuarLogin($conexao, $user, $senha){
    $sql = "SELECT usuario, senha FROM funcionario WHERE usuario = '{$user}' AND senha = '{$senha}'";
    $resultado = mysqli_query($conexao, $sql);
    return mysqli_fetch_assoc($resultado);
}

if(efetuarLogin($conexao, $user, $senha)){
    session_start();
    $_SESSION['nome'] = $user;
    $_SESSION['log'] = 'ativo';
    header("location: chamada.php");
    die();
} else {
    echo"<script language='javascript' type='text/javascript'>alert('Usuario e/ou Senha incorretos');"
    . "window.location.href='index.php';</script>";
}

?>