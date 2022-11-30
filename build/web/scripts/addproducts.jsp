<%@page contentType="text/html" pageEncoding="UTF-8"%> 

<script>
    let fileinput = document.getElementById('finput');
    let imgtag = document.getElementsByClassName('showimage');
    fileinput.addEventListener("onchange", showimg());
    function showimg() {
    if (fileinput.files.length > 0) {
    for (let i = 0; i < fileinput.files.length; i++) {
    imgtag[i].src = URL.createObjectURL(fileinput.files[i]);
    }
    if (fileinput.files.length < 5 || fileinput.files.length < 5) {
    alert('enter 6 files');
    }
    if (fileinput.files.length == 6) {
    val = 0;
    }
    }
    };
</script>
