<%-- 
    Document   : mantPartido
    Created on : 17/09/2014, 07:33:40 PM
    Author     : JavaWeb-LM
--%>

<%@page import="java.util.Random"%>
<%@page import="java.util.List"%>
<%@page import="edu.cibertec.partido.dao.bean.EquipoBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Juegos</title>

        <link href="css/table/estilos.css" type="text/css" rel="stylesheet"/>
    </head>
    <body>
        <h1>RESULTADOS DE PARTIDOS</h1>


        <form name=”datos”>
            <table class="cebra">

                <caption>Resultados de Equipos</caption>
                <thead>
                    <tr>
                        <th>Equipo 1</th>
                        <th>Equipo 2</th>
                        <th>Resultado</th>
                        <th>Marcador</th>
                        <th>Puntos</th>
                    </tr>
                </thead>

                <%  List<EquipoBean> listaimpar = (List<EquipoBean>) request.getAttribute("listaPartImpar");
                    List<EquipoBean> listapar = (List<EquipoBean>) request.getAttribute("listaPartPar");
                    for (int i = 0; i < 3; i++) {%>

                <tr>
                    <td><%=listapar.get(i).getNombre()%></td>
                    <td><%=listaimpar.get(i).getNombre()%></td>
                    <td>???</td>
                    <td>
                        <input type="radio" name="res<%=i%>" value="1" onclick="<%=listapar.get(i).getCodigo()%>"><%= listapar.get(i).getNombre()%>
                        <input type="radio" name="res<%=i%>" value="2" onclick="<%=listaimpar.get(i).getCodigo()%>"><%= listaimpar.get(i).getNombre()%>
                        <input type="radio" name="res<%=i%>" value="3" onclick="<%=listaimpar.get(i).getCodigo()%>,<%=listapar.get(i).getCodigo()%>)">Empate
                    </td>
                    <td>puntaje</td>
                </tr>
                <%   }
                %>


                <tfoot>
                    <tr>
                        <td colspan="4" >TOTAL</td>
                        <td >contar</td>
                    </tr>
                    <tr>
                        <td colspan="5">Cibertec - DAT </td>
                    </tr>

                </tfoot>
            </table>
        </form>
    <center>
        <div>
            <input type="button" value="Calcular" onclick="aleatorio()">
            <input type="button" value="Mas partidos">
            <input TYPE="reset" value="Limpiar" onclick="limpiar()">
        </div>
    </center>

</body>
</html>
