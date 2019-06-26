<%--
  Created by IntelliJ IDEA.
  User: ly
  Date: 2019/6/26
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <form action="insert" method="post">
       <table border="1">
           <tr>
               <td colspan="2" style="text-align: center;font-weight: bold">
                   花卉信息
               </td>
           </tr>
           <tr>
               <td>花卉名称</td>
               <td><input type="text" name="name"></td>
           </tr>
           <tr>
               <td>花卉价格</td>
               <td><input type="text" name="price"></td>
           </tr>
           <tr>
               <td>花卉生产地</td>
               <td><input type="text" name="production"></td>
           </tr>
           <tr>
               <td colspan="2" align="center">
                   <input type="submit" value="提交">
                   <input type="reset" value="重置">
               </td>
           </tr>
       </table>
   </form>
</body>
</html>
