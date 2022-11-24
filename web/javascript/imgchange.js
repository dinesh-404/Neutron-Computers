let img = document.getElementsByClassName("sideimg");
let mainimg = document.getElementById("mainimg");
let temp = "";
function change(n) {
mainimg.classList.add("hide");
img[n].classList.add("hide");
                setTimeout(function(){
                temp = img[n].src;
                        img[n].src = mainimg.src;
                        mainimg.src = temp;
                        mainimg.classList.remove("hide");
                        img[n].classList.remove("hide");
                }, 1000);
                console.log(n);
        }
