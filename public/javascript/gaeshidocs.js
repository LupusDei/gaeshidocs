function activate_nav_header() {
    var nav = window.location.pathname;
    if(nav) {
        $("a[href='" + nav + "']").addClass("active");
    }
}

$(function() {
  activate_nav_header();
});
