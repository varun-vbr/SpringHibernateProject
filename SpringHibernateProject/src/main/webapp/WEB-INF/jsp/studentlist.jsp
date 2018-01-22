<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<title>student list</title>
</head>
<body>
<form name="studentList" action="${pageContext.request.contextPath}/studentlist?fdAction=createStudentForm" method="POST">
<table align="left" style="padding-left: 300px;">
			<tr>
				<td
					style="font-family: 'arial'; font-size: 16px; font-weight: bold;">Student List</td>
			</tr>
			<tr>
			<td>&nbsp;</td>
			</tr>
			<tr>
				<td>
					<table class="border" cellpadding="10">
						<tr>
						  <th class="th">RollNo</th>
							<th class="th">Name</th>
							<th class="th">University</th>
							<th class="th">TotalMarks</th>
							<th class="th">Action</th>
						</tr>
						<c:forEach items="${students}" var="list">
							<tr>
								<td class="td"><c:out value="${list.rollNo}" /></td>
								<td class="td"><c:out value="${list.name}" /></td>
								<td class="td"><c:out value="${list.university}" /></td>
								<td class="td"><c:out value="${list.totalMarks}" /></td>
								<td class="td"><a
									href="${pageContext.request.contextPath}/studentlist?fdAction=delete&rollNo=${list.rollNo}">Delete</a> <a
									href="${pageContext.request.contextPath}/studentlist?fdAction=view&rollNo=${list.rollNo}">Edit</a></td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
			<tr align="center">
				<td><input type="submit" value="Add new Student" /></td>
			</tr>
		</table>
</form>

</body>
</html>