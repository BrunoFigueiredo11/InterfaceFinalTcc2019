<?php

include('conexao.php'); //incluindo arquivo de conexão ao BD

//declarando váriaveis do Post lista.php

$data     = isset($_POST['data'])?$_POST['data']: '';
$curso    = isset($_POST['selectcurso'])?$_POST['selectcurso']: '';
$prof     = isset($_POST['selectprof'])?$_POST['selectprof']: '';
$dia      = isset($_POST['selectdia'])?$_POST['selectdia']: '';
$hora     = isset($_POST['selecthora'])?$_POST['selecthora']: '';
$presenca = isset($_POST['presenca'])?$_POST['presenca']: '';


/*echo $data . "<br>";
echo $curso . "<br>";
echo $prof . "<br>";
echo $dia . "<br>";
echo $hora . "<br>";
echo $presenca . "<br>";*/

?>