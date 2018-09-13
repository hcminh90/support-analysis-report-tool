<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<div class="mainmenu">
	<ul>
		<li><table>
				<tr>
					<td><i class="icon-home icon-large"></i>&nbsp;</td>
					<td><div>
							<main>
							<a href='<spring:url value="/" />'><spring:message code="label.menu.home" /></a></main>
						</div>
						<span>Dashbroad</span></td>
				</tr>
			</table></li>
		<li><table>
				<tr>
					<td><i class="icon-home icon-large"></i>&nbsp;</td>
					<td><div>
							<main>
							<a href='<spring:url value="/fundstransfer.html" />'>Fund
								Transfer</a></main>
						</div>
						<span>SWIFT, CITAD, VCBMoney</span></td>
				</tr>
			</table></li>
		<li><table>
				<tr>
					<td><i class="icon-user icon-large"></i>&nbsp;</td>
					<td><div>
							<main>About Us</main>
						</div>
						<span>what we do</span></td>
				</tr>
			</table></li>
		<li><table>
				<tr>
					<td><i class="icon-gear icon-large"></i>&nbsp;</td>
					<td><div>
							<main>Our Services</main>
						</div>
						<span>what we provide</span></td>
				</tr>
			</table></li>
		<li><table>
				<tr>
					<td><i class="icon-briefcase icon-large"></i>&nbsp;</td>
					<td><div>
							<main>Portofolio</main>
						</div>
						<span>our work</span></td>
				</tr>
			</table></li>
		<li><table>
				<tr>
					<td><i class="icon-comments icon-large"></i>&nbsp;</td>
					<td><div>
							<main>Blog</main>
						</div>
						<span>Just Share</span></td>
				</tr>
			</table></li>
		<li><table>
				<tr>
					<td><i class="icon-tint icon-large"></i>&nbsp;</td>
					<td><div>
							<main>Contact</main>
						</div>
						<span>How to reach</span></td>
				</tr>
			</table></li>
	</ul>
</div>