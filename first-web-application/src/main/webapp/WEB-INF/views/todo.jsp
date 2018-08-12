<%@include file="../common/header.jspf"%>
<%@include file="../common/navigation.jspf"%>

<div class="container">
	<H1>Welcome ${name}</H1>


	<table class="table table-striped">
		<caption>Your Book Wishlist contains:</caption>
		<thead>
			<th>Name</th>
			<th>Author</th>
			<th>Actions</th>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.name}</td>
					<td>${todo.category}</td>
					<td>&nbsp;&nbsp;<a class="btn btn-danger"
						href="/delete-todo.do?todo=${todo.name}&category=${todo.category}">Remove from list</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


		<p>
			<font color="red">${errorMessage}</font>
		</p>
		<a
					href="/add-todo.do">Add New Book</a>
	</div>

<%@include file="../common/footer.jspf"%>	