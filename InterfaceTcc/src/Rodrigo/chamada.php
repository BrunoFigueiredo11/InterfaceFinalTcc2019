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
    
    <!-- Arquivos Externos -->
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css" type="text/css">
    <link rel="stylesheet" href="jquery-ui-1.12.1/jquery-ui.css">
    <script src="jquery-ui-1.12.1/external/jquery/jquery.js"></script>
    <script src="jquery-ui-1.12.1/jquery-ui.js"></script>
    <link rel="shortcut icon" href="Imagens/6402logojanela.ico" >

    <body class="container">
        <div class="float-right">
            <a href="logoff.php"><button class="btn btn-outline-danger">Sair</button></a>
        </div>
		<br>
        <h1 align="center">Chamada</h1>
        <form method='POST'>
            <div class="float-right">
                <input type="text" size="7" class="form-control" name="datepicker" id="datepicker" value="<?php echo $data ?>">
            </div>
            <br><br>
            <table align="center">
                <tr>
                    <td>Curso</td>
                    <td>Professor</td>
                    <td>Dia da Semana</td>
                    <td>Horario Curso</td>
                </tr>
                <tr>
                    <td width="150">
                        <select name="selectcurso" class="form-control">
                            <?php echo $cursoselect ?>
                        </select>
                    </td>
                    <td width="150">
                        <select name="selectprof" class="form-control">
                            <?php echo $selectProf ?>
                        </select>
                    </td>
                    <td width="180">
                        <select name="selectdia" class="form-control">
                            <?php echo $selectDia ?>
                        </select>
                    </td>
                    <td width="150">
                        <select name="selecthora" class="form-control">
                            <?php echo $selectHR ?>
                        </select>
                    </td>
                    <td width="50px">
                        &nbsp;
                    </td>
                    <td>
                        <input type="submit" value="Pesquisar" name="pesquisa" class="btn btn-outline-dark">
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
                <?php
                    $alunos = listaAlunos($conexao, $filtro);
                    foreach ($alunos as $a):
                ?>
                <tr>
                    <td><?php echo $a['ctr'] ?> </td>
                    <td> <?php echo $a['nome'] ?></td>
                    <td>
                         <b>P</b> <input Type="radio" name="presenca" value="p">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         <b>F</b> <input Type="radio" name="presenca" value="f">
                    </td>
                </tr>
                <?php
                    endforeach;
                ?>
            </tbody>
        </table>
        <br>
        <input type="submit" value="Confirmar" name="confirmapresenca" class="btn btn-secondary btn-lg btn-block">
    </body>

    <script>
        $( function() {
            $('#datepicker').datepicker({
            dateFormat: 'dd/mm/yy',
            dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado'],
            dayNamesMin: ['D','S','T','Q','Q','S','S','D'],
            dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
            monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],
            monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez'],
            nextText: 'Próximo',
            prevText: 'Anterior'
        });
        } );
  </script>

</html>