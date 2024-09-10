$(document).ready(function() {
    $('.toggle-btn').click(function() {
        $('.sidebar, .main-content').toggleClass('hidden');
    });

    $('.nav-item > a').click(function() {
        var parent = $(this).parent('.nav-item');
        parent.find('.nav-submenu').slideToggle(); // 先切换二级导航的可见性
        parent.toggleClass('active'); // 再切换一级导航的活动状态
        parent.find('i.fas').last().toggleClass('fa-chevron-down fa-chevron-right'); // 最后切换小图标的样式
    });



    // $('.nav-subitem a').click(function() {
    //     $('.nav-subitem').removeClass('active');
    //     $(this).parent('.nav-subitem').addClass('active');
    //     var text = $(this).text();
    //     $('.breadcrumb').text(`首页 / 一级导航 / ${text}`);
    // });
    $('.nav-subitem a').click(function() {
        // 移除所有二级导航项的 active 类
        $('.nav-subitem').removeClass('active');
        // 给当前点击的二级导航项添加 active 类
        $(this).parent('.nav-subitem').addClass('active');

        // 获取当前二级导航项的文本内容
        var subText = $(this).text();
        // 获取对应一级导航项的文本内容
        var mainText = $(this).closest('.nav-submenu').prev('.nav-item > a').text();

        // 更新面包屑导航的文本内容
        $('.breadcrumb').text(`当前位置：${mainText} / ${subText}`);
    });

});