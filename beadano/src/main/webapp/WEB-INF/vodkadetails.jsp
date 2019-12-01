<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W+C//DTD HTM 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset-UTF8">
        <link href="<c:url value="/css/styles.css"  />" rel="stylesheet">
		<title>Részletek</title>
	</head>
	<body id="contentbody">

    <header id="header">
        <div class="logo shadows">Vodka DB <a href="https://github.com/GergoSz"><span>Szabó Gergely - B5XVY7</span></a></div>
    </header>
    <div id="section-container">

    </div>

    <section id="sect1" class="sec-wrap inner">


        <div class="section-header">
            <h2>Details</h2>
        </div>

        <div class="content">

        <table class="defaulttable">
                <thead>
                        <td>Id</td>
                        <td>Brand</td>
                        <td>Name</td>
                        <td>Alcohol %</td>
                        <td>Volume</td>
                </thead>
                <tr>
                        <td>${chosenv.id}</td>
                        <td>${chosenv.brand}</td>
                        <td>${chosenv.name}</td>
                        <td>${chosenv.alc}%</td>
                        <td>${chosenv.volume} cl</td>
                </tr>
        </table>
            <p>
                <a href="/vodka"><-- Vissza</a>
            </p>

        </div>
    </section>

    </body>
</html>