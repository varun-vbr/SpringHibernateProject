<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Add Student</title>
</head>
<body>
<form name="createStudentForm" method="POST"
		action="${pageContext.request.contextPath}/studentlist?fdAction=create">
		<table align="left" style="padding-left: 300px;">
			<tr>
				<td
					style="font-family: 'arial'; font-size: 16px; font-weight: bold;"
					align="left">Add a student</td>
			</tr>
			<tr align="left">
				<td>
					<table class="border" cellpadding="10">
						<tr>
							<td class="td"><b>Name:</b></td>
							<td class="td"><input type="text" name="name" /></td>
						</tr>
						<tr>
							<td class="td"><b>University:</b></td>
							<td class="td"><input type="text" name="university" /></td>
						</tr>
						<tr>
							<td class="td"><b>Total Marks:</b></td>
							<td class="td"><input type="text" name="totalMarks" /></td>
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
								href="${pageContext.request.contextPath}/studentlist/list"><b>Go Back</b></a></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>