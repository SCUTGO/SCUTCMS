function GetJsonData() {
    var json = {
        "username": $("#username").val(),
        "password": $("#password").val()
    };
    return json;
}

$("#btn_submit").click(function() {
    console.log(GetJsonData());
    $.ajax({
        type: "POST",
        url: "login",
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify(GetJsonData()),
        dataType: "json",
        success: function (data) {
            console.log(data);
        }
    });
});