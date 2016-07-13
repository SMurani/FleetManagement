<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>EassyFleet</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Toastr style -->
    <link href="css/plugins/toastr/toastr.min.css" rel="stylesheet">

    <!-- Gritter -->
    <link href="js/plugins/gritter/jquery.gritter.css" rel="stylesheet">

    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

</head>

<body>
<div id="wrapper">
    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav metismenu" id="side-menu">
                <li class="nav-header">
                    <div class="dropdown profile-element"> <span>
                            <img alt="image" class="img-circle" src="img/profile_small.jpg" />
                             </span>

                            <span class="clear"> <span class="block m-t-xs"> <strong class="font-bold">Easy_Fleet</strong></span>
                                <span>We Care </span>


                    </div>

                </li>
                <li class="active">
                    <a href="index.jsp"><i class="fa fa-th-large"></i> <span class="nav-label">Dashboards</span> <span class="fa arrow"></span></a>

                </li>
                <li>
                    <a href="#"><i class="fa fa-diamond"></i> <span class="nav-label">Companies</span></a>

                </li>
                <li>
                    <a href="#" onclick="vehicle.list()"><i class="fa fa-pie-chart"></i> <span class="nav-label">Vehicles</span>  </a>
                </li>

                <li>
                    <a href="#"><i class="fa fa-envelope"></i> <span class="nav-label">Customers </span><span class="label label-warning pull-right">16/24</span></a>

                </li>
                <li>
                    <a href="#"><i class="fa fa-envelope"></i> <span class="nav-label">Regions</span><span class="label label-warning pull-right">16/24</span></a>

                </li>
                <li>
                    <a href="#"><i class="fa fa-envelope"></i> <span class="nav-label">Documents </span><span class="label label-warning pull-right">16/24</span></a>

                </li>
                <li>
                    <a href="#"><i class="fa fa-envelope"></i> <span class="nav-label">Mails </span><span class="label label-warning pull-right">16/24</span></a>

                </li>
                <a href="#" class="list-group-item " onclick="vehicle.list()">Vehicle</a>





            </ul>

        </div>
    </nav>

    <div id="page-wrapper" class="gray-bg dashbard-1">
        <div class="row border-bottom">
            <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>
                    <form role="search" class="navbar-form-custom" action="">
                        <div class="form-group">
                            <input type="text" placeholder="Search for something..." class="form-control" name="top-search" id="top-search">
                        </div>
                    </form>
                </div>


            </nav>
        </div>

        <div class="row">
            <div class="col-lg-12">
                <div class="well" id="ajax-content">
                    <a href="login.jsp">Logout</a>
                    <p>Hi This is just a paragraph</p>


                </div>
                <div class="footer">

                    <div>
                        <strong>Copyright</strong> EasyFleet &copy; 2016-2017
                    </div>
                </div>
            </div>
        </div>

    </div>

</div>

<!-- Mainly scripts -->
<script src="js/jquery-2.1.1.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>



<script src="js/app/vehicle.js"></script>
<script src="js/app/baseapp.js"></script>


<!-- jQuery -->
<script src="js/jquery-1.10.2.min.js"></script>
<script src="js/bootstrap-datepicker.min.js"></script>






<%--<!-- Flot -->
<script src="js/plugins/flot/jquery.flot.js"></script>
<script src="js/plugins/flot/jquery.flot.tooltip.min.js"></script>
<script src="js/plugins/flot/jquery.flot.spline.js"></script>
<script src="js/plugins/flot/jquery.flot.resize.js"></script>
<script src="js/plugins/flot/jquery.flot.pie.js"></script>

<!-- Peity -->
<script src="js/plugins/peity/jquery.peity.min.js"></script>
<script src="js/demo/peity-demo.js"></script>

<!-- Custom and plugin javascript -->
<script src="js/inspinia.js"></script>
<script src="js/plugins/pace/pace.min.js"></script>

<!-- jQuery UI -->
<script src="js/plugins/jquery-ui/jquery-ui.min.js"></script>

<!-- GITTER -->
<script src="js/plugins/gritter/jquery.gritter.min.js"></script>

<!-- Sparkline -->
<script src="js/plugins/sparkline/jquery.sparkline.min.js"></script>

<!-- Sparkline demo data  -->
<script src="js/demo/sparkline-demo.js"></script>

<!-- ChartJS-->
<script src="js/plugins/chartJs/Chart.min.js"></script>

<!-- Toastr -->
<script src="js/plugins/toastr/toastr.min.js"></script>--%>




</body>

</html>