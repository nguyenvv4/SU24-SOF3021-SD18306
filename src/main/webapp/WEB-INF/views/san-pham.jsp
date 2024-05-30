<!doctype html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>id</td>
        <td>ma san pham</td>
        <td>ten san pham</td>
        <td>ngay tao</td>
        <td>ngay sua</td>
        <td>trang thai</td>
        <td>ten danh muc</td>
        <td>ma danh muc</td>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${listSanPham}" var="sanPham">
        <tr>
            <td>${sanPham.id}</td>
             <td>${sanPham.maSanPham}</td>
             <td>${sanPham.tenSanPham}</td>
             <td>${sanPham.ngayTao}</td>
             <td>${sanPham.ngaySua}</td>
             <td>${sanPham.trangThai}</td>
             <td>${sanPham.danhMuc.tenDanhMuc}</td>
             <td>${sanPham.danhMuc.maDanhMuc}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>