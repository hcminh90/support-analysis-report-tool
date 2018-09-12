<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import = "java.io.*,java.util.*" %>
<%@ page import = "javax.servlet.*,java.text.*" %>
<%
         Date dNow = new Date( );
         SimpleDateFormat ft = 
         new SimpleDateFormat ("yyyyMMddHHmmss");
         
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Cache-control" content="no-cache, no-store, must-revalidate">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href='<c:url value="<%= "/resources/css/stylesheet.css?v="+session.getId()+ft.format(dNow) %>" />' >
<link rel="stylesheet"
	href='<c:url value="/resources/css/fm.scrollator.jquery.css" />'>
<title><tiles:getAsString name="title"></tiles:getAsString></title>

<script type="text/javascript"
	src='<c:url value="/resources/js/jquery-3.3.1.min.js" />'></script>
<script type="text/javascript"
	src='<c:url value="/resources/js/jquery.min.js" />'></script>
<script type="text/javascript"
	src='<c:url value="/resources/js/fm.scrollator.jquery.js"/>'></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
</head>
<body>
	<table class="tb-full-size" border="1">
		<tr class="header">
			<td><tiles:insertAttribute name="header" /></td>
		</tr>
		<tr class="menu">
			<td><tiles:insertAttribute name="menu" /></td>
		</tr>
		<tr>
			<td class="full-height">
				<div class="content" id="content">
					<div id="style-2">
						<tiles:insertAttribute name="body" />
					</div>
				</div>
			</td>
		</tr>
		<tr class="footer">
			<td><tiles:insertAttribute name="footer" />
			
			</td>
		</tr>
	</table>
	<script type="text/javascript">
	 /*$(function () {
	        $("#style-2").resizable({
	            resize: function (event, ui) {
	                var width = ui.size.width;
	                var height = ui.size.height;
	                alert(width + ',' + height);
	                var $scrollable_div1 = $('#content');
	        		if ($scrollable_div1.data('scrollator') == undefined) {
	        			$scrollable_div1.scrollator();
	        		}
	            }
	        });
	    });	*/
	    /*$(document).ready(function(){
	        $("#style-2").resize(function(){
	            alert("changed");
	        });
	    });*/
	
	</script>
</body>
</html>