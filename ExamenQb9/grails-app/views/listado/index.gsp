<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Render Domain</title>
</head>
<body>
    <table>
        <tr>
            <td>Item</td>
            <td>Valor</td>
        </tr>
        <g:each in="${list}" var="item">
        <tr>
            <td>${item.descripcion}</td>
            <td>${item.valor}</td>
        </tr>
        </g:each>        
    </table>
</body>
</html>