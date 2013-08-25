<%@page import="sportline.panama.principal.llamado"%>
<!DOCTYPE html>
<html lang="en">
    <head>

        <!-- start: Meta -->
        <meta charset="utf-8">
        <title>Mantenedor de Reproductor de Video</title>
        <meta name="description" content="SimpliQ - Flat & Responsive Bootstrap Admin Template.">
        <meta name="author" content="?ukasz Holeczek">
        <meta name="keyword" content="SimpliQ, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
        <!-- end: Meta -->

        <!-- start: Mobile Specific -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- end: Mobile Specific -->

        <!-- start: CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/bootstrap-responsive.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <link href="css/style-responsive.min.css" rel="stylesheet">
        <link href="css/retina.css" rel="stylesheet">
        <!-- end: CSS -->	
        <!-- start: Favicon and Touch Icons -->
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="ico/apple-touch-icon-57-precomposed.png">
        <link rel="shortcut icon" href="ico/favicon.png">
        <!-- end: Favicon and Touch Icons -->	

    </head>

    <body>
        <!-- start: Header -->
        <div class="navbar">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>
                    <a id="main-menu-toggle" class="hidden-phone open"><i class="icon-reorder"></i></a>		
                    <div class="row-fluid">
                        <a class="brand span2" href="index.html"><span>Gestion de Videos</span></a>
                    </div>		
                    <!-- start: Header Menu -->
                    <div class="nav-no-collapse header-nav">
                        <ul class="nav pull-right">						
                            <!-- start: User Dropdown -->
                            <li class="dropdown">
                                <a class="btn account dropdown-toggle" data-toggle="dropdown" href="#">
                                    <div class="avatar"><img src="img/avatar.jpg" alt="Avatar"></div>
                                    <div class="user">
                                        <span class="hello">Bienbenido!</span>
                                        <span class="name">Usuario Administrador</span>
                                    </div>
                                </a>
                                <ul class="dropdown-menu">
                                    <li class="dropdown-menu-title">

                                    </li>
                                    <li><a href="#"><i class="icon-user"></i> Perfil</a></li>
                                    <li><a href="#"><i class="icon-cog"></i> Configuraci&oacute;n</a></li>
                                    <li><a href="#"><i class="icon-envelope"></i>Mensaje</a></li>
                                    <li><a href="#"><i class="icon-off"></i> Salir</a></li>
                                </ul>
                            </li>
                            <!-- end: User Dropdown -->
                        </ul>
                    </div>
                    <!-- end: Header Menu -->

                </div>
            </div>
        </div>
        <!-- start: Header -->

        <div class="container-fluid-full">
            <div class="row-fluid">

                <!-- start: Main Menu -->
                <div id="sidebar-left" class="span2">

                    <div class="row-fluid actions">

                        <input type="text" class="search span12" placeholder="...">

                    </div>	

                    <div class="nav-collapse sidebar-nav">
                        <ul class="nav nav-tabs nav-stacked main-menu">						
                            <li>
                                <a class="dropmenu" href="#"><i class="icon-facetime-video"></i><span class="hidden-tablet"> Gestor de Videos</span> <span class="label">2</span></a>
                                <ul>
                                    <li><a href="index.jsp"><i class="icon-signout"></i><span class="hidden-tablet"> Enviar  Video</span></a></li>						
                                    <li><a href="reproductor.jsp"><i class="icon-play"></i><span class="hidden-tablet"> Reproducir</span></a></li>										   
                                </ul>	
                            </li>
                             <li>
                                <a class="dropmenu" href="#"><i class="icon-facetime-video"></i><span class="hidden-tablet"> Gestor de usuario</span> <span class="label">3</span></a>
                                <ul>
                                 <li><a href="#"><i class="icon-signout"></i><span class="hidden-tablet"> Crear Usuario</span></a></li>						
                                 <li><a href="#"><i class="icon-play"></i><span class="hidden-tablet"> Editar Usuario</span></a></li>										   
                                 <li><a href="#"><i class="icon-play"></i><span class="hidden-tablet"> Inabilitar Usuario</span></a></li>
                                </ul>	
                            </li>
                            <li>
                                <a class="dropmenu" href="#"><i class="icon-facetime-video"></i><span class="hidden-tablet"> Gestor de Reproductores</span> <span class="label">3</span></a>
                                <ul>
                                 <li><a href="#"><i class="icon-signout"></i><span class="hidden-tablet"> Agregar Reproductor</span></a></li>						
                                 <li><a href="#"><i class="icon-play"></i><span class="hidden-tablet"> Elimintar Reproducto</span></a></li>										   
                                 <li><a href="#"><i class="icon-play"></i><span class="hidden-tablet"> Editar Reproducto</span></a></li>
                                </ul>	
                            </li>
                        </ul>
                    </div>
                </div>
                <!-- end: Main Menu -->						
                <!-- start: Content -->
                <div id="content" class="span10">
                    <div class="box span12">
                        <div class="box-header">
                            <h2><i class="icon-edit"></i>Reproductor de Pruebas</h2>
                            <div class="box-icon">
                                <!-- <a href="#" class="btn-setting"><i class="icon-wrench"></i></a> -->
                                <a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
                                <a href="#" class="btn-close"><i class="icon-remove"></i></a>
                            </div>
                        </div>
                        <div class="box-content">

                            <form class="form-horizontal">
                                <fieldset>							  
                                    <div class="control-group">
                                        <label class="control-label" for="selectError0">Escoger Reproductor</label>
                                        <div class="controls">
                                            <select id="selectError0" data-rel="chosen">
                                                <option>Prueba</option>
                                                <!-- <option>Option 2</option>
                                                <option>Option 3</option>
                                                <option>Option 4</option>
                                                <option>Option 5</option> -->
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-actions">
                                        <button type="submit" class="btn btn-primary icon-play" name="reproducir">  Reproducir</button>

                                        <%
                                            int respuesta = 0;
                                            if (request.getParameter("reproducir") != null) {
                                                llamado ejecutar = new llamado();
                                                respuesta = ejecutar.controles("cd $HOME/videos", "nohup totem --enqueue $HOME/videos/DaddyYankee-Limbo.avi  --fullscreen > log.out ");

                                            } else {

                                                respuesta = 0;
                                            }
                                            if (respuesta == 1) {
                                        %>
                                        <script  language="javascript" type="text/javascript">
                                            alert("reproductor OK!!")
                                        </script>
                                        <%                                                                   } else if (respuesta == 2) {
                                        %>
                                        <script  language="javascript" type="text/javascript">
                                            alert("No se pudo ejecutar el reproductor!!")
                                        </script>
                                        <%                                                                       }
                                        %>
                                        <button type="submit" class="btn icon-stop" name="detener">  Detener</button>
                                        <%
                                            int retorno_detener;
                                            if (request.getParameter("detener") != null) {
                                                llamado ejecutar = new llamado();
                                                retorno_detener = ejecutar.controles("PID=`ps -fea | grep totem | grep -v grep | awk '{ print $2 }'`", "kill -9 $PID");
                                            } else {

                                                retorno_detener = 0;
                                            }
                                            if (retorno_detener == 1) {
                                        %>
                                        <script  language="javascript" type="text/javascript">
                                            alert("detener OK!!")
                                        </script>
                                        <%                                                                   } else if (retorno_detener == 2) {%>
                                        <script  language="javascript" type="text/javascript">
                                            alert("no se detubo!!")
                                        </script>
                                        <%}
                                        %>
                                        <button type="submit" class="btn icon-volume-up" name="silencio">  Silencio</button>
                                        <%
                                            int retorno_silencio;
                                            if (request.getParameter("silencio") != null) {
                                                llamado ejecutar = new llamado();
                                                retorno_silencio = ejecutar.controles("cd /home/home/videos", "nohup totem --mute >> log.out");
                                            } else {

                                                retorno_silencio = 0;
                                            }
                                            if (retorno_silencio == 1) {
                                        %>
                                        <script  language="javascript" type="text/javascript">
                                            alert("Silencio OK!!")
                                        </script>
                                        <%                                                                   } else if (retorno_silencio == 1) {
                                        %>
                                        <script  language="javascript" type="text/javascript">
                                            alert("no se ejecuto bien...")
                                        </script>
                                        <%                                                                     }
                                        %>
                                    </div>
                                </fieldset>

                            </form>   

                        </div>
                    </div><!--/span-->
                </div>	
                <!-- end: Content -->				
            </div><!--/fluid-row-->		
            <div class="clearfix"></div>

            <footer>
                <p>
                    <span style="text-align:left;float:left">&copy; Sport Line 2013</span>
                    <span class="hidden-phone" style="text-align:right;float:right">by: <a href="#" alt="Bootstrap Admin Templates">FDSystems</a></span>
                </p>

            </footer>

        </div><!--/.fluid-container-->

        <!-- start: JavaScript-->
        <script src="js/jquery-1.9.1.min.js"></script>
        <script src="js/jquery-migrate-1.0.0.min.js"></script>	
        <script src="js/jquery-ui-1.10.3.custom.min.js"></script>	
        <script src="js/jquery.ui.touch-punch.js"></script>	
        <script src="js/modernizr.js"></script>	
        <script src="js/bootstrap.min.js"></script>	
        <script src="js/jquery.cookie.js"></script>	
        <script src='js/fullcalendar.min.js'></script>	
        <script src='js/jquery.dataTables.min.js'></script>
        <script src="js/excanvas.js"></script>
        <script src="js/jquery.flot.js"></script>
        <script src="js/jquery.flot.pie.js"></script>
        <script src="js/jquery.flot.stack.js"></script>
        <script src="js/jquery.flot.resize.min.js"></script>
        <script src="js/jquery.flot.time.js"></script>

        <script src="js/gauge.min.js"></script>
        <script src="js/jquery.chosen.min.js"></script>	
        <script src="js/jquery.uniform.min.js"></script>		
        <script src="js/jquery.cleditor.min.js"></script>	
        <script src="js/jquery.noty.js"></script>	
        <script src="js/jquery.elfinder.min.js"></script>	
        <script src="js/jquery.raty.min.js"></script>	
        <script src="js/jquery.iphone.toggle.js"></script>	
        <script src="js/jquery.uploadify-3.1.min.js"></script>	
        <script src="js/jquery.gritter.min.js"></script>	
        <script src="js/jquery.imagesloaded.js"></script>	
        <script src="js/jquery.masonry.min.js"></script>	
        <script src="js/jquery.knob.modified.js"></script>	
        <script src="js/jquery.sparkline.min.js"></script>	
        <script src="js/counter.min.js"></script>	
        <script src="js/raphael.2.1.0.min.js"></script>
        <script src="js/justgage.1.0.1.min.js"></script>	
        <script src="js/jquery.autosize.min.js"></script>	
        <script src="js/retina.js"></script>
        <script src="js/jquery.placeholder.min.js"></script>
        <script src="js/wizard.min.js"></script>
        <script src="js/core.min.js"></script>	
        <script src="js/charts.min.js"></script>	
        <script src="js/custom.min.js"></script>
        <!-- end: JavaScript-->

    </body>
</html>