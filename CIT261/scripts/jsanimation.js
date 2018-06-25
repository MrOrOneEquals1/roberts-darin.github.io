function toRight() {
    var inside = document.getElementById("box");
    var out = document.getElementById("background");
    var pos = 5;
    var id = setInterval(frame, 10);
    out.style.transition = "opacity 3s linear 0s";
    out.style.opacity = 0;
    
    function frame() {
        if (pos == 400) {
        clearInterval(id);
        inside.style.transition = "borderRadius 0s opacity 0s linear 0s";
        inside.style.opacity = 0;
        } else {
        pos++; 
        inside.style.left = pos + 'px';
        }
    }
}

function toLeft() {
    var inside = document.getElementById("box");
    var out = document.getElementById("background");
    var pos = 300;
    var id = setInterval(frame, 10);    
    out.style.transition = "opacity 4s linear 0s";
    out.style.opacity = 1;
    
    function frame() {
        if (pos == 5) {
        clearInterval(id);
        } else {
        pos--; 
        inside.style.left = pos + 'px';
        inside.style.transition = "opacity 0s linear 0s";
        inside.style.opacity = 1;
        }
    }
}