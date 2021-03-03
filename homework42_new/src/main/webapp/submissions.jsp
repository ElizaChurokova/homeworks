<%@page_pageEncoding="UTF-8"%>
<html>
<head>
</head>
    <body>

    <form action="${pageContext.request.contextPath}/homework42_new" method="post">
        <p>Login
        <input type= "text" login="submissionLogin">
        </p>
        <p>Password
        <input type= "password" password="submissionPassword">
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