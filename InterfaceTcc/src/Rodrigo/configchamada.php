<?php

    include('conexao.php'); //incluindo arquivo de conexão ao BD

    //declarando váriaveis do Post lista.php
    $hoje = Date('d/m/Y');

    $data     = isset($_POST['data'])?$_POST['data']:$hoje;
    $curso    = isset($_POST['selectcurso'])?$_POST['selectcurso']: '';
    $prof     = isset($_POST['selectprof'])?$_POST['selectprof']: '';
    $dia      = isset($_POST['selectdia'])?$_POST['selectdia']: '';
    $hora     = isset($_POST['selecthora'])?$_POST['selecthora']: '';
    $presenca = isset($_POST['presenca'])?$_POST['presenca']: '';
    $pesquisa = isset($_POST['pesquisa'])?$_POST['pesquisa']: '';
    $confirma = isset($_POST['confirmapresenca'])?$_POST['confirmapresenca']:'';

    $dtfinal = date("Y-m-d",strtotime(str_replace('/','-',$data)));

    //listando Cursos
    $cursoSql = "SELECT * FROM curso";
    $sqlCurso = mysqli_query($conexao, $cursoSql);

    $cursoselect = "<option value='' ></option>";
    while($rowCurso = mysqli_fetch_object($sqlCurso)){
        $listacurso = utf8_encode($rowCurso->curso);

        $strSelect="";
        if($curso == $rowCurso->id_curso)$strSelect = "Selected = 'selected'";
            $cursoselect = $cursoselect . "<option value='" . $rowCurso->id_curso . "'" . $strSelect . "> " . $listacurso . " </option>";
        $arrayCurso[] = $listacurso;
    }
    //Fim Cursos

    //Listando Professores
    $profSql = "SELECT id_funcionario, fnome FROM funcionario WHERE funcao = 'Professor'";
    $sqlProf = mysqli_query($conexao, $profSql);

    $selectProf = "<option value='' ></option>";
    while($rowProf = mysqli_fetch_object($sqlProf)){
        $listaProf = utf8_encode($rowProf->fnome);

        $strSelect="";
        if($prof == $rowProf->id_funcionario)$strSelect = "Selected = 'selected'";
            $selectProf = $selectProf . "<option value='" . $rowProf->id_funcionario . "'" . $strSelect . "> " . $listaProf . " </option>";
        $arrayProfessor[] = $listaProf;
    }
    //Fim Professores

    //Listando Dias
    $diaSql = "SELECT * FROM dia group by dia";
    $sqlDia = mysqli_query($conexao, $diaSql);

    $selectDia = "<option value='' ></option>";
    while($rowDia = mysqli_fetch_object($sqlDia)){
        $listaDia = $rowDia->dia;

        $strSelect="";
        if($dia == $rowDia->id_dia)$strSelect = "Selected = 'selected'";
            $selectDia = $selectDia . "<option value='" . $rowDia->id_dia . "'" . $strSelect . "> " . $listaDia . " </option>";
        $arrayDia[] = $listaDia;
    }

    //Listando Horarios
    $horaSql = "SELECT * FROM horario group by horario";
    $sqlHora = mysqli_query($conexao, $horaSql);

    $selectHR = "<option value='' ></option>";
    while($rowHr = mysqli_fetch_object($sqlHora)){
        $listaHR = $rowHr->horario;

        $strSelect="";
        if($hora == $rowHr->id_horario)$strSelect = "Selected = 'selected'";
            $selectHR = $selectHR . "<option value='" . $rowHr->id_horario . "'" . $strSelect . "> " . $listaHR . " </option>";
        
        $arrayHorario[] = $listaHR;
    }
    //Fim Dias e Horarios
    
    //Listando Alunos
    if($pesquisa != ""){

        $filtro = "";
        if($curso != ""){
            $filtro .= " AND c.id_curso = '{$curso}'";
        }
        if($prof != ""){
            $filtro .= " AND f.id_funcionario = '{$prof}'";
        }
        if($dia != ""){
            $filtro .= " AND d.id_dia = '{$dia}'";
        }
        if($hora != ""){
            $filtro .= " AND h.id_horario = '{$hora}'";
        }
    
        //Listando Alunos
        function listaAlunos($conexao, $filtro) {
            $alunos = array();
            $alunoSql = "SELECT a.ctr, a.nome FROM turmas t
                        INNER JOIN aluno a ON a.ctr = t.ctr
                        INNER JOIN curso c ON c.id_curso = t.id_curso
                        INNER JOIN horario h ON h.id_horario = t.id_horario
                        INNER JOIN dia d ON d.id_dia = t.id_dia
                        INNER JOIN funcionario f ON f.id_funcionario = t.id_funcionario where 1=1 " . $filtro;
            $sqlAluno = mysqli_query($conexao, $alunoSql);
        
            while ($aluno = mysqli_fetch_assoc($sqlAluno)) {
                array_push($alunos, $aluno);
            }
            return $alunos;
        }
    }
    //Fim Listar Alunos
    
    /*if($confirma != ""){
        while($presenca == "p"){
            
        }
    }*/
    //var_dump($filtro);
?>