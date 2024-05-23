<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body class="container">

<form action="/sinh-vien" method="post">
    <div class="mb-3">
        <label class="form-label">ID</label>
        <input type="text" class="form-control" name="id">
    </div>
    <div class="mb-3">
        <label class="form-label">Ten sach</label>
        <input type="text" class="form-control" name="hoTen">
    </div>
    <div class="mb-3">
        <label class="form-label">Gia ban</label>
        <input type="text" class="form-control" name="diaChi">
    </div>
    <div class="mb-3">
        <label class="form-label">Trang thai</label>
        <div class="form-check col-4">
            <input class="form-check-input" type="radio" value="Hoat dong" name="trangThai">
            <label class="form-check-label">
                Con hang
            </label>
        </div>
        <div class="form-check col-4">
            <input class="form-check-input" type="radio" value="Ngung hoat dong" name="trangThai">
            <label class="form-check-label">
                Het hang
            </label>
        </div>
    </div>
    <div class="mb-3">
        <label class="form-label">Tac gia</label>
        <select class="form-select" aria-label="Default select example">
            <option selected>Open this select menu</option>
            <option value="1">One</option>
            <option value="2">Two</option>
            <option value="3">Three</option>
        </select>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<form action="/sach/search" method="post">
    <div class="mb-3">
        <label class="form-label">ID</label>
        <input type="text" class="form-control" name="tenSach">
    </div>
    <button type="submit" class="btn btn-primary">search</button>
</form>
<a class="btn btn-primary" href="/sach">Hien thi tat ca</a>
<table class="table">
    <thead>
    <tr>
        <td>Stt</td>
        <td>Id</td>
        <td>Ten sach</td>
        <td>Tac gia</td>
        <td>Gia ban</td>
        <td>Trang Thai</td>
        <td>Action</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="sach" varStatus="i">
        <tr>
            <td>${i.index}</td>
            <td>${sach.id}</td>
            <td>${sach.tenSach}</td>
            <td>${sach.tacGia}</td>
            <td>${sach.giaBan}</td>
            <td>${sach.trangThai}</td>
            <td><a class="btn btn-dark" href="/sinh-vien/delete?id=${sinhVien.id}">Xoa</a></td>
            <td><a class="btn btn-dark" href="/sinh-vien/edit?id=${sinhVien.id}">Edit</a></td>
        </tr>
    </c:forEach>
    </tbody>

</table>
</body>
</html>