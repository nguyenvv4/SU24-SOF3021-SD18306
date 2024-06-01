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
<form action="/san-pham/update" method="post">
    <div class="mb-3">
        <label class="form-label">id</label>
        <input type="text" class="form-control" name="id" value="${sanPham.id}" readonly>
    </div>
    <div class="mb-3">
        <label class="form-label">Ma san pham</label>
        <input type="text" class="form-control" name="maSanPham" value="${sanPham.maSanPham}">
    </div>
    <div class="mb-3">
        <label class="form-label">Ten san pham</label>
        <input type="text" class="form-control" name="tenSanPham" value="${sanPham.tenSanPham}">
    </div>
    <div class="row">
        <p class="col-4"> Trang thai
        </p>
        <div class="form-check col-4">
            <input class="form-check-input" type="radio" value="Active" name="trangThai"
            ${sanPham.trangThai == 'Active' ? 'checked' :''}
            >
            <label class="form-check-label">
                Active
            </label>
        </div>
        <div class="form-check col-4">
            <input class="form-check-input" type="radio" value="Inactive" name="trangThai"
            ${sanPham.trangThai == 'Inactive' ? 'checked' :''}
            >
            <label class="form-check-label">
                Inactive
            </label>
        </div>
    </div>
    <div class="mb-3">
        <label for="disabledSelect" class="form-label">Ten danh muc</label>
        <select id="disabledSelect" class="form-select" name="danhMuc">
            <c:forEach items="${lopDM}" var="dm">
                <option value="${dm.id}"
                    ${dm.id == sanPham.danhMuc.id ? 'selected' :''}
                >${dm.tenDanhMuc}</option>
            </c:forEach>
        </select>
    </div>
    <button type="submit" class="btn btn" style="background-color: chocolate">Submit</button>
</form>
</body>
</html>