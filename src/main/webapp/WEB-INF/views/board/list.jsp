<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/templates/header.jsp"></c:import>
</head>
<body id="page-top">
	<div id="wrapper">
		<c:import url="/WEB-INF/views/templates/sidebar.jsp"></c:import>
		<div id="content-wrapper" class="d-flex flex-column">
			<div id="content">
				<c:import url="/WEB-INF/views/templates/topbar.jsp"></c:import>
				<div class="container-fluid">
					<!-- contents -->
					<!-- Page Heading -->
					<h1 class="h3 mb-2 text-gray-800">${kind}</h1>


					<!-- DataTales Example -->
					<div class="card shadow mb-4">
						<div class="card-header py-3">
							<h6 class="m-0 font-weight-bold text-primary">DataTables
								Example</h6>
						</div>
						<div class="card-body">
						<form class="form-inline">
						  <div class="form-group mx-sm-3 mb-2">
							<select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
								<option selected>제목</option>
								<option value="1">내용</option>
								<option value="2">제목+내용</option>
							  </select>
						    <input type="password" class="form-control" id="inputPassword2">
						  </div>
						  <button type="submit" class="btn btn-primary mb-2">검색</button>
						</form>
							<div class="table-responsive">
								<table class="table table-bordered" id="dataTable" width="100%"
									cellspacing="0">
									<thead>
										<tr>
											<th>#</th>
											<th>작성자</th>
											<th>제목</th>
											<th>내용</th>
											<th>작성일</th>
											<th>조회수</th>

										</tr>
									</thead>
									<tbody>
										<c:forEach items="${list}" var="l">
											<tr>
												<td>${l.boardNum}</td>
												<td>${l.userName}</td>
												<td>${l.boardTitle}</td>
												<td>${l.boardContents}</td>
												<td>${l.boardDate}</td>
												<td>${l.boardHit}</td>
											</tr>

										</c:forEach>
									</tbody>
								</table>
							</div>
							<div class="form-group mb-2" style="display: flex; justify-content: center;">
								<nav aria-label="Page navigation example">
								  <ul class="pagination">
								    <li class="page-item">
								      <a class="page-link" href="#" aria-label="Previous">
								        <span aria-hidden="true">&laquo;</span>
								      </a>
								    </li>
								    <li class="page-item"><a class="page-link" href="#">1</a></li>
								    <li class="page-item"><a class="page-link" href="#">2</a></li>
								    <li class="page-item"><a class="page-link" href="#">3</a></li>
								    <li class="page-item">
								      <a class="page-link" href="#" aria-label="Next">
								        <span aria-hidden="true">&raquo;</span>
								      </a>
								    </li>
								  </ul>
								</nav>					
							</div>
						</div>
					</div>


				</div>
			</div>
			<!-- End Content -->

			<c:import url="/WEB-INF/views/templates/foot.jsp"></c:import>
		</div>
		<!-- End Content Wrapper -->
		<c:import url="/WEB-INF/views/templates/footer.jsp"></c:import>
	</div>
	<!-- End Wrapper -->

</body>
</html>