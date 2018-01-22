<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<title>Edit student</title>
</head>
<body>
<form name="editStudentForm" method="POST"
		action="${pageContext.request.contextPath}/studentlist?fdAction=edit">
		<table align="left" style="padding-left: 300px;">
			<tr>
				<td
					style="font-family: 'arial'; font-size: 16px; font-weight: bold;"
					align="left">Edit student details </td>
			</tr>
			<tr align="left">
				<td>
					<table class="border" cellpadding="10">
						<tr>
							<td class="td"><b>RollNo:</b></td>
							<td class="td"><input type="text" name="rollNo" value="${requestScope.student.rollNo}" readonly/></td>
						</tr>
						<tr>
							<td class="td"><b>Name:</b></td>
							<td class="td"><input type="text" name="name" value="${requestScope.student.name}"/></td>
						</tr>
						<tr>
							<td class="td"><b>University:</b></td>
							<td class="td"><input type="text" name="university" value="${requestScope.student.university}"/></td>
						</tr>
						<tr>
							<td class="td"><b>TotalMarks:</b></td>
							<td class="td"><input type="text" name="totalMarks" value="${requestScope.student.totalMarks}" /></td>
						</tr>
					</table>
				</td>
			</tr>
			<tr align="left">
				<td>
					<table style="padding-left: 100px;">
						<tr align="center">
							<td class="td"><input type="submit" value="Save" /> &nbsp;
								&nbsp;<a
								href="${pageContext.request.contextPath}/studentlist/list"
								><b>Go Back</b></a></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>