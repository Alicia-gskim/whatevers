<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
	
	<!-- <link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/ax5ui/ax5ui-select/master/dist/ax5select.css" /> -->
	<link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/ax5ui/ax5ui-layout/master/dist/ax5layout.css" />
	<script type="text/javascript" src="https://cdn.rawgit.com/ax5ui/ax5core/master/dist/ax5core.min.js"></script>
	<script type="text/javascript" src="https://cdn.rawgit.com/ax5ui/ax5ui-layout/master/dist/ax5layout.min.js"></script>
</head>
<body>
	<hr>
	${msg}
	<hr>
	<div>
		<button id="moveBtn"> Move Board Page </button>
	</div>
	
	<div class="jsonViewArea">
		<table class="selectInfo" border="1px solid">
			<thead>
				<tr>
					<th scope="col">IDX</th>
					<th scope="col">TITLE</th>
					<th scope="col">NAME</th>
					<th scope="col">IP</th>
					<th scope="col">INS_DT</th>
					<th scope="col">UPD_DT</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	</div>
</body>
</html>