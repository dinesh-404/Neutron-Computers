<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/home.css" rel="stylesheet">
        <link href="css/footer.css" rel="stylesheet">
        <title>home-page</title>


    <body>
        <%@include file="navbar.jsp" %>

    <center>
        <div class="container" id="container">
            <h1>Neutron Computers</h1>
            one stop solution for all computing needs
            <br>
            <a href="shop.jsp">Shop Now</a>
        </div>
    </center>
    <img id="img" src="css/cssimg/omen.png" class="img a" alt="">
    <br><br>
    <br><br><br><br>
    <br><br><br><br>
    <br><br>
    <div class="cardmain r reveal" >
        <div class="text a" >
            <h2>Featured</h2>
            <h1>Genesis by ORIGIN</h1>
            <p>Origin PC is now a maker of very fine, high-end performance computers that are often better known as
                high-end gaming computers.” The fallacy of course is the rigs are suitable for much more than just
                gaming,
                and the people who can afford them likely have time for week long journeys through the World of
                Warcraft</p>
            <button onclick="location.href='shop.jsp'">Buy Now</button>
        </div>
        <img class="a featured"  src="css/cssimg/origin-pc.jpg" alt="">
    </div>
    <br><br><br><br>

    <div class="cardmain r reveal">
        <div class="text a" id="txt">
            <h2>Featured</h2>
            <h1>intel Core i9 13900k</h1>
            <p>
                The 13th Gen Intel® Core™ desktop processors deliver the next generation of breakthrough core performance. Now with up to 24 cores (8 Performance-cores and 16 Efficient-cores) and up to 32 threads.
            </p><br><br>
            <button onclick="location.href='shop.jsp'">Buy Now</button>
        </div>
        <img class="a featured" id="processor" src="css/cssimg/intel 13th gen-PhotoRoom.png" alt="">
    </div>
    <br><br><br><br>

    <script>
        window.addEventListener("load", function () {
        document.getElementById("container").style.animation = "1.4s text ease-out forwards";
        document.getElementById("img").style.animation = "bgchange 1s ease-in-out forwards";
        })
                let reveals = document.getElementsByClassName("reveal");
        console.log(reveals.length);
        function reveal() {
        for (let i = 0; i < reveals.length; i++) {
        var windowHeight = window.innerHeight;
        var elementTop = reveals[i].getBoundingClientRect().top;
        var elementVisible = 500;
        let txt = document.getElementsByClassName("text");
        let pimg = document.getElementsByClassName("featured");
        if (elementTop < windowHeight - elementVisible) {
        reveals[i].classList.add("active");
        reveals[i].style.animation = "reveal .5s ease-in-out forwards";
        pimg[i].style.animation = "fimage 1s ease-in-out forwards";
        txt[i].style.animation = "featuredtxt 1s ease-in-out forwards";
        } else {
        reveals[i].classList.add("active");
        reveals[i].style.animation = "hide .6s ease-in-out forwards";
        pimg[i].style.animation = "fimghide 1s ease-in-out forwards";
        txt[i].style.animation = "ftxthide 1s ease-in-out forwards";
        }
        }
        }
        window.addEventListener("scroll", reveal);
        reveal();

    </script>
    <%@include file="footer.html" %>

</body>

</html>