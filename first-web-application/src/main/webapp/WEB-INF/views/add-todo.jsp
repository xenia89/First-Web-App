<%@include file="../common/header.jspf"%>
<%@include file="../common/navigation.jspf"%>
	
	<div class="container">
	Your next book to read:
	<form method="POST" action="/add-todo.do">
		<fieldset class="form-group">
			<label>Book Name</label> <input name="todo" type="text"
				class="form-control" /> <BR />
		</fieldset>
		<fieldset class="form-group">
			<label>Author</label> <input name="category" type="text"
				class="form-control" /> <BR />
		</fieldset>
		<input name="add" type="submit" class="btn btn-success" value="Submit" />
	</form>
</div>

<%@include file="../common/footer.jspf"%>	