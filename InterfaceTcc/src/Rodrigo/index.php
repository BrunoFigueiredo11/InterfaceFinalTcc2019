<!doctype html>

<html>
    <head>
        <title>Chamada SGE</title>
    </head>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css" type="text/css">
    <body>
        
        <h1 align="center">Lista de Chamada SGE</h1>
        <hr size="5">
        
        <form method="POST" action="login.php">
            <table align="center">
                <tr>
                    <td width="60%">
                        <fieldset class="scheduler-border">
                            <legend class="scheduler-border">Login</legend>
                            <div class="control-group">
                                <label for="exampleDropdownFormEmail2">Usuário:</label>
                                <input type="text" class="form-control" name="usuario" placeholder="Digite seu Usuário">
                            </div>
                            <div class="control-group">
                                <label for="exampleDropdownFormPassword2">Senha:</label>
                                <input type="password" class="form-control" name="senha" placeholder="Digite sua Senha">
                            </div>
                            <a href="#">Esqueci minha Senha</a>
                            <br>
                            <br>
                            <input type="submit" class="btn btn-primary" value="Entrar" name="entrar">
                        </fieldset>
                    </td>
                </tr>
            </table>
        </form>

    </body>
</html>