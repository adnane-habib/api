<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<h2>Data successfully updated.</h2><br>
<h3>Updated Data Summary.</h3>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<br><br>
<table border=1>
	<tr>
		<td>Question 1 Score
		<td>Question 2 Score
		<td>Question 3 Score
		<td>Comments

	</tr>

		<tr>
			<td>${feedback.q1Score}
			<td>${feedback.q2Score}
			<td>${feedback.q3Score}
			<td>${feedback.comments}

		</tr>


</table>
<br><br>


<a href="\">Back to main menu</a>

