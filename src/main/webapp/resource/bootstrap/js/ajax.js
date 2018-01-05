/**
 * Created by QuanQqqqq on 2018/1/5.
 */

function post(data, url, success) {
    $.ajax({
        type: 'POST',
        url: url,
        data: data,
        success: success,
        dataType: 'json',
        error : function () {
            alert("系统错误");
        }
    });
}

function get(url, success) {
    $.ajax({
        type: 'GET',
        url: url,
        data: data,
        success: success,
        dataType: 'json',
        error : function () {
            alert("系统错误");
        }
    });
}

function doLogin() {
    var username = $('#username').val();
    var password = $('#password').val();
    var type = $('input[name="type"]:checked').val();
    console.log(username, password, type);
    var data = {
        username : username,
        password : password,
        type : type
    }
    var success = function (data) {
        console.log("=====");
        console.log(data);
        console.log(data.errMsg);
        if (data.status) {
            window.location.href = "/";
        } else {
            alert(data.errMsg);
        }
    }
    post(data, '/login/api/doLogin', success);
}
