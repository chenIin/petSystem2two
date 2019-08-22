<%--
  Created by IntelliJ IDEA.
  User: 89163
  Date: 2019/6/14
  Time: 8:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>$Title$</title>
    <style>

        tr:nth-of-type(odd) {
            background-color: #5FB878;

        }
        tr:nth-of-type(even) {
            background-color: grey;

        }
        tr, td {
            width: 200px;
            height: 30px;
            text-align: center;
        }
    </style>
</head>
<body>
<c:if test="${list==null}">
    <c:redirect url="/info/all"></c:redirect>
</c:if>
<center>
    <table>

        <tr>
            <td colspan="6">宠物管理</td>

        </tr>
        <tr>
            <form method="get" action="/info/select">
                <td colspan="6">

                    <select id="sel" name="aid">

                        <option value="0">全部</option>
                        <c:forEach items="${tlist}" var="tben">
                            <option value="${tben.tid}">${tben.typeName}</option>

                        </c:forEach>
                    </select>
                  <%--  <input type="text" id="pname" name="aweather">--%>
                    <input type="submit" id="sele" value="查询">
                </td>
            </form>
        </tr>
        <tr>
            <td>编号</td>
            <td>宠物名称</td>
            <td>宠物类型</td>
            <td>宠物年龄</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${list}" var="ben">
            <tr>
                <td>${ben.id}</td>
                <td>${ben.pName}</td>
                <td>${ben.petType.typeName}</td>
                <td>${ben.year} 月
                        <%--  <fmt:formatDate value=""></fmt:formatDate>--%>

                </td>
                <td>

                    <button onclick="dell(${ben.id})">删除</button>
                </td>
            </tr>

        </c:forEach>

    </table>
    <a href="/update.jsp">增加</a>
</center>
<script src="/statics/js/jquery1.8.3.min.js"></script>
<script>
    function dell(s) {
        $.getJSON("/del?id=" + s, function (data) {
            if (data != "true") {
                alert("删除成功");
                location.reload();
            } else {
                alert("删除失败");
            }

        });
    }

</script>
</body>
</html>
