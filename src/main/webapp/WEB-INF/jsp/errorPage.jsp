<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<div class="full-size" id="divchanged">
<table class="tb-full-size">
  <tr>
    <td valign="top" style="width:135px;"><img alt="" src='<c:url value="/resources/imgs/404.png" />'></td>
    <td valign="top" style="padding-top:10px">
    <h3>${errorMsg}</h3>
    <p>Application has encountered an error. Please contact support on Administrator</p>
    <div id="bt-error" class="common-button">Show error details</div>
    <div id="error-page-details" style="display:none;">
    Failed URL: ${url} </br>Exception: ${exception.message} </br>
	<c:forEach items="${exception.stackTrace}" var="ste">    ${ste} </br></c:forEach>
    </div>
    </td>
  </tr>
</table>
</div>
<script type="text/javascript">
$(document).ready(function(){
    $("#bt-error").click(function(){
        $("#error-page-details").toggle("fast");
    });
});
</script>


