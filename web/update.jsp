<%--
  Created by IntelliJ IDEA.
  User: 89163
  Date: 2019/5/11
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>增加</title>
</head>
<body>

<style>

    tr,td{

        width: 160px;
        height: 40px;
        text-align: center;
        border: 1px solid grey;
    }

</style>

<c:if test="${tlist==null}">
    <c:redirect url="/selectType"></c:redirect>
</c:if>
<center>
<form action="/add" method="post">
    <table >
        <tr>
            <td colspan="2">增加</td>
        </tr>
        <tr>
            <td>名称：</td>
            <td>
                <input type="text" name="pName">
            </td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td>
                <input type="text" name="year">
            </td>
        </tr>

        <tr>
            <td>类型：</td>
            <td>
               <select name="tid">
                <c:forEach items="${tlist}" var="tben">
                    <option value="${tben.tid}">${tben.typeName}</option>
                </c:forEach>
               </select>
            </td>
        </tr>

        <tr>
            <td colspan="2">

                <input type="submit" id="but" value="提交">

            </td>

        </tr>
    </table>

</form>

</center>


<script src="/statics/js/jquery1.8.3.min.js"></script>
<script>


</script>



</body>
</html>
