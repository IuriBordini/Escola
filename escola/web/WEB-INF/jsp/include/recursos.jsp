<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resource/css/bootstrap.min.css" var="BootstrapMin" />
<spring:url value="/resource/js/jquery-3.2.js" var="JQuery" />
<spring:url value="/resource/js/bootstrap.js" var="JBootstrap" />

<link href="${BootstrapMin}" rel="stylesheet" />
<script src="${JQuery}"></script>
<script src="${JBootstrap}"></script>