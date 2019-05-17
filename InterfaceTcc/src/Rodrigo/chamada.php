<!doctype html>
<?php
include('conexao.php');
include('configchamada.php');

session_start();
if($_SESSION['log'] != "ativo"){
    session_destroy();
    header("location: login.php");
}

$_SESSION['nome'];

?>
<html>
    <head>
        <title>Lista de Chamada SGE</title>
    </head>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css" type="text/css">
    <body class="container">
        <div class="float-right">
            <a href="logoff.php"><button class="btn btn-outline-danger">Sair</button></a>
        </div>
		<br>
        <h1 align="center">Chamada</h1>
        <form method='POST' action='configchamada.php'>
            <div class="float-right">
                <input type="date" class="form-control" name="data">
            </div>
            <br><br>
            <table align="center">
                <tr>
                    <td width="150">
                        <select name="selectcurso" class="form-control">
                            <option>Curso</option>
                        </select>
                    </td>
                    <td width="150">
                        <select name="selectprof" class="form-control">
                            <option>Professor</option>
                        </select>
                    </td>
                    <td width="150">
                        <select name="selectdia" class="form-control">
                            <option>Dia</option>
                        </select>
                    </td>
                    <td width="150">
                        <select name="selecthora" class="form-control">
                            <option>Horario</option>
                        </select>
                    </td>
                    <td width="50px">
                        &nbsp;
                    </td>
                    <td>
                        <input type="submit" value="Confirmar" name="confirmainfo" class="btn btn-outline-dark">
                    </td>
                </tr>
            </table>
        </form>
        <br>
        <table class="table table-striped">
            <thead>
                <tr>
                <th scope="col" width="130">CTR</th>
                <th scope="col" width="550">Nome</th>
                <th scope="col" width="350">Presença</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td></td>
                    <td></td>
                    <td>
                         <input Type="radio" name="presenca" value="p">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         <input Type="radio" name="presenca" value="f">
                    </td>
                </tr>
            </tbody>
        </table>
        <br>
        <input type="submit" value="Confirmar" name="confirmapresenca" class="btn btn-secondary btn-lg btn-block">
    </body>
</html>