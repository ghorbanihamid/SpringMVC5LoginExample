<html>
<head></head>
<body>
<h1>DashBoard Form</h1>

    <table border="1" style="border: black; width: 200px">
        <tr>
            <td>
                <table>
                    <tr>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>
                            <a href="/springmvc/showRegisterUser">Register User</a>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>
                            <form name="logout" id="logout" action="/springmvc/logout" method='POST'>
                                <table>
                                    <tr>
                                        <td><input name="Logout" type="submit" value="Logout" /></td>
                                    </tr>
                                </table>
                            </form>

                        </td>
                    </tr>

                </table>
            </td>
        </tr>

    </table>

</body>
</html>