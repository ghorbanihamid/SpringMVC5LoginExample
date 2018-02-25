<html>
<head></head>
<body>
<h1>Register User Form</h1>
<form name='registerUser' action="/springmvc/registerUser" method='POST'>
    <table border="1" style="border: black; width: 350px">
        <tr>
            <td>
                <table>
                    <tr>
                        <td>User First Name:</td>
                        <td><input type='text' name='userFirstName' value=''></td>
                    </tr>
                    <tr>
                        <td>User Last Name:</td>
                        <td><input type='text' name='userLastName' /></td>
                    </tr>
                    <tr>
                        <td>Username:</td>
                        <td><input type='text' name='username' value=''></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type='password' name='password' /></td>
                    </tr>
                    <tr>
                        <td colspan="2">&nbsp;</td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input name="submit" type="submit" value="Register" /></td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</form>
</body>
</html>