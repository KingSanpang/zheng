var ifShow20170821=false;
function initLoading(){
    $("body").append("<!-- loading -->" +
        "<div class='modal fade' id='myBootstrapLoading' tabindex='-1' role='dialog' aria-labelledby='myModalLabel' data-backdrop='static'>" +
        "<div class='modal-dialog' role='document'>" +
        "<div class='modal-content'>" +
        "<div class='modal-header'>" +
        "<h4 class='modal-title' id='myModalLabel'>提示</h4>" +
        "</div>" +
        "<div id='myBootstrapLoadingText' class='modal-body'>" +
        "<span class='glyphicon glyphicon-refresh' aria-hidden='true'>1</span>" +
        "处理中，请稍候..." +
        "</div>" +
        "</div>" +
        "</div>" +
        "</div>"
    );
}
function showLoading(text){
    text = text || "处理中，请稍候...";
    $("#myBootstrapLoadingText").html(text);
    if(ifShow20170821){
        return;
    }
    ifShow20170821 = true;
    $("#myBootstrapLoading").modal("show");
}
function hideLoading(){
    if(ifShow20170821){
        ifShow20170821 = false;
        $("#myBootstrapLoading").modal("hide");
    }
}
