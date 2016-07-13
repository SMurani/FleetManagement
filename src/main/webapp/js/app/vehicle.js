var vehicle = {
    list: function(){
        var ajax = new XMLHttpRequest();

        ajax.onreadystatechange = function(){

            if(ajax.readyState == 4){
                if(ajax.status == 200){
                    document.getElementById('ajax-content').innerHTML = ajax.responseText;
                }
            }
        }

        ajax.open("GET", "./vehicle", true);
        ajax.send();
    },
    add: function(){
        var ajax = new XMLHttpRequest();

        ajax.onreadystatechange = function(){

            if(ajax.readyState == 4){
                if(ajax.status == 200){
                    document.getElementById('ajax-content').innerHTML = ajax.responseText;
                }
            }
        }

        ajax.open("GET", "./vehicles.jsp", true);
        ajax.send();
    },


}