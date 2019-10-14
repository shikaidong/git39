<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
   <from action="upload.do" method="get" entype="multipart/from-date">
     <table>
        <tr>
          <th colspan="2">文章</th>
        </tr>
        <tr>
        <td>1</td>
        <td><a href="${pageContext.request.contextPath }/article/detaile/1">文章一</a></td>
        </tr>
        <tr>
        <td>2</td>
        <td><a href="${pageContext.request.contextPath }/article/detaile/2">文章二</a></td>
        </tr>
   </table>
   </from>
</body>
</html>