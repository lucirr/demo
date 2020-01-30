$(function(){
    $("#btnSearch").click(function(){
        $.ajax({
            method: "GET",
            url: "/search",
            data: { name: "John", location: "Boston" },
            dataType: "json"
        }).done(function(data) {
            console.log(JSON.stringify(data));
            $("#searchResult").empty();
            $.each(data, function (key, value) {
                $("#searchResult").append(
                    '<tr>'
                    +'<td>'+value.id+'</td>'
                    +'<td>'+value.name+'</td>'
                    +'<td>'+value.job+'</td>'
                    +'<td>'+value.addr+'</td>'
                    +'<td>'+value.zip+'</td>'
                    +'</tr>'
                );
            });

        }).fail(function(e){
            alert(e);
        });
    });
});