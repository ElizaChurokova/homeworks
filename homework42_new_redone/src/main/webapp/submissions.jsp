<%@page pageEncoding="UTF-8"%>
<html>
<head>
</head>
    <body>

    <form action="${pageContext.request.contextPath}/Submissions" method="post">
        <p>Login
        <input type= "text" login="submission_login">
        </p>
        <p>Password
        <input type= "password" password="submission_password">
        </p>
        <p>Gender
        <select name= "gender">
            <option value="MALE">MALE</option>
            <option value="FEMALE">FEMALE</option>
        </p>
        <input type="submit" name="submit">

    </form>
    </body>
</html>