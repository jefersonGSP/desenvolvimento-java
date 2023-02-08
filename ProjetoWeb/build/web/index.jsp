<%-- 
    Document   : index
    Created on : 22 de set de 2021, 20:53:31
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculo de Percentual</title>
     
<link rel="stylesheet" href="css/estilo.css">
     
    </head>
    <body>
        <form method="get" action="CalculaSalario">

<div class="borda">
    <h2>Calculo do dissidio salarial</h2>

 <div class="container">
    <label for="nome">Nome:</label>
    <input type="text" name="nome" id="nome" required>
 </div>


<div class="container">
    <label for="salario">Salario Atual:
    </label>
    <input type="number" name="salario" id="salario" step="0.01" required>
</div> 

<div class="container">
    <label for="cargo">Cargo</label>
    <select name="cargo" id="cargo" required>
        <option value="">Selecione</option>
        <option value="Assitente">Assitente</option>
        <option value="Oficial">Oficial</option>
        <option value="Gerente">Gerente</option>
        <option value="Diretor">Diretor</option>
    </select>
</div>
<div class="container">
    <label >Turnos:</label>
    <input type="checkbox" name="turnos" id="manha" value="Manhã">Manhã
    <input type="checkbox" name="turnos" id="tarde" value="Tarde">Tarde
    <input type="checkbox" name="turnos" id="noite" value="Noite">Noite
</div>
<div class="container">
    <label >Tipo de regime:</label>
    <input type="radio" name="regime" id="tercerizado" value="Tercerizado">Tercerizado
    <input type="radio" name="regime" id="autonomo" value="Autonomo">Autônomo
    <input type="radio" name="regime" id="contratado" value="Contratado">Contratado
</div>
<div class="botoes">
    
<input type="hidden" name="aumentoFinal" id="aumentoFinal" value="0">
        <input  type="submit" value="Calcular">
    <input  type="reset" value="Limpar">
</div>
</div>

        </form><script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>
    </body>
</html>
