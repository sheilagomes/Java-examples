<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Skills</title>
    <link href="https://fonts.googleapis.com/css?family=Krona+One|Roboto:400,700,900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/styles.css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css" rel="stylesheet">
</head>
<body id="home">
    <div class="container-nav">
        <nav id="navbar">
            <header>
                <p><span class="name">sheila</span><span class="last-name">gomes</span></p>
            </header>
                <ul>
                    <li><a href="Controller?action=home">home</a></li>
                    <li><a href="Controller?action=skills">skills</a></li>
                    <li><a href="Controller?action=projetos">projects</a></li>
                    <li><a href="Controller?action=contatos">contact</a></li>
                </ul>
        </nav>
    </div>
    <main>
        <div id="skills">
            <h2 class="main-title">These are my main skills:</h2>
            <div class="skill-tile">
                <h3><i class="fa fa-certificate highlight" aria-hidden="true"></i><br>Certificate of <span class="highlight">Proficiency in English</span> from the University of Cambridge</h3>
            </div>
            <div class="skill-tile">
                <h3><i class="fa fa-code highlight" aria-hidden="true"></i><br>Programming languages:<br>Java, <span class="highlight">Python</span>, Javascript, HTML e CSS</h3>
            </div>
            <div class="skill-tile">
                <h3><i class="fa fa-graduation-cap highlight" aria-hidden="true"></i></i><br>Undergraduate Degree in Tourism and Environment, Specialization Degree in Translation, and currently pursuing a Certificate in <span class="highlight">Systems Analysis and Development</span></h3>
            </div>
        </div>
    </main>	
</body>
</html>