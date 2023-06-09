<%--
  Created by IntelliJ IDEA.
  User: pedre
  Date: 08/06/2023
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastra Cliente</title>
    <meta charset="UTF-8">
</head>
<body>

<form action="cadastraclienteservlet" method="post">

    <label>
        nome:<br>
        <input type="text" name="nome"><br><br>
    </label>
    <label>
        nome:<br>
        <input type="text" id="telefone" autocomplete="off" name="telefone" maxlength="11"><br><br>
    </label>
</form>

<script>
    const phoneInput = document.getElementById("telefone");

    phoneInput.addEventListener("input", () => {
        // Get the current value of the input
        let value = phoneInput.value;

        // Remove any non-numeric characters from the value
        value = value.replace(/[^0-9]/g, "");

        // Format the value according to the mask
        value = value.replace(/(\d{2})(\d{1})(\d{4})(\d{4})/, "($1) $2 $3-$4");

        // Set the value of the input back to the formatted value
        phoneInput.value = value;
    });
</script>
</body>
</html>
