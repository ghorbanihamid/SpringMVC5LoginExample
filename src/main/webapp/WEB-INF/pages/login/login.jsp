<html>
<head></head>
<body>
<h1>Login Form</h1>
<table border="1" style="border: black; width: 200px">
    <tr>
        <td>
            <form name='login' action="/springmvc/springLogin" method='POST'>
            <table>

                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>User:<input type='text' name='username' value=''></td>
                </tr>
                <tr>
                    <td>Password:<input type='password' name='password' /></td>
                </tr>
                <tr>
                    <td align="center">
                        <input name="submit" type="submit" value="login" />
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
            </table>
            </form>
        </td>
    </tr>
</table>
<table style="width: 200px">
    <tr>
        <td>&nbsp;</td>
    </tr>
    <tr>
        <td align="center"><a href="/springmvc/showRegisterUser">Register New User</a></td>
    </tr>
</table>

</body>
</html>