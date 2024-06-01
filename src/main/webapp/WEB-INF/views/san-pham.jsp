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
<form action="/san-pham/add" method="post">
    <div class="mb-3">
        <label class="form-label">Ma san pham</label>
        <input type="text" class="form-control" name="maSanPham">
    </div>
    <div class="mb-3">
        <label class="form-label">Ten san pham</label>
        <input type="text" class="form-control" name="tenSanPham">
    </div>
    <div class="row">
        <p class="col-4"> Trang thai
        </p>
        <div class="form-check col-4">
            <input class="form-check-input" type="radio" value="Active" name="trangThai">
            <label class="form-check-label">
                Active
            </label>
        </div>
        <div class="form-check col-4">
            <input class="form-check-input" type="radio" value="Inactive" name="trangThai">
            <label class="form-check-label">
                Inactive
            </label>
        </div>
    </div>
    <div class="mb-3">
        <label for="disabledSelect" class="form-label">Ten danh muc</label>
        <select id="disabledSelect" class="form-select" name="danhMuc">
            <c:forEach items="${lopDM}" var="dm">
                <option value="${dm.id}">${dm.tenDanhMuc}</option>
            </c:forEach>
        </select>
    </div>
    <button type="submit" class="btn btn" style="background-color: chocolate">Submit</button>
</form>
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
        <td>action</td>
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
            <td>
                <a href="/san-pham/delete?id=${sanPham.id}">Xoa</a>
                <a href="/san-pham/detail?id=${sanPham.id}">edit</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>