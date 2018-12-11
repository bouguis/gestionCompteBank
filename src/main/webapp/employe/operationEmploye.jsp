<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="resources/images/favicon.png">
    <title>Admin</title>

    <link href="resources/css/lib/chartist/chartist.min.css" rel="stylesheet">
	<link href="resources/css/lib/owl.carousel.min.css" rel="stylesheet" />
    <link href="resources/css/lib/owl.theme.default.min.css" rel="stylesheet" />
    <!-- Bootstrap Core CSS -->
    <link href="resources/css/lib/bootstrap/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="resources/css/helper.css" rel="stylesheet">
    <link href="resources/css/style.css" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:** -->
    <!--[if lt IE 9]>
    <script src="https:**oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https:**oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
</head>

<body class="fix-header fix-sidebar">
    <!-- Preloader - style you can find in spinners.css -->
    <div class="preloader">
        <svg class="circular" viewBox="25 25 50 50">
			<circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="2" stroke-miterlimit="10" /> </svg>
    </div>
    <!-- Main wrapper  -->
    <div id="main-wrapper">
        <!-- header header  -->
        <div class="header">
            <nav class="navbar top-navbar navbar-expand-md navbar-light">
                <!-- Logo -->
                <div class="navbar-header">
                    <a class="navbar-brand" href="index.html">
                        <!-- Logo icon -->
                        <b><img src="resources/images/logo.png" alt="homepage" class="dark-logo" /></b>
                        <!--End Logo icon -->
                        <!-- Logo text -->
                        <span><img src="resources/images/logo-text.png" alt="homepage" class="dark-logo" /></span>
                    </a>
                </div>
                <!-- End Logo -->
                <div class="navbar-collapse">
                    <!-- toggle and nav items -->
                    <ul class="navbar-nav mr-auto mt-md-0">
                        <!-- This is  -->
                        <li class="nav-item"> <a class="nav-link nav-toggler hidden-md-up text-muted  " href="javascript:void(0)"><i class="mdi mdi-menu"></i></a> </li>
                        <li class="nav-item m-l-10"> <a class="nav-link sidebartoggler hidden-sm-down text-muted  " href="javascript:void(0)"><i class="ti-menu"></i></a> </li>
                        <!-- Messages -->
                        <li class="nav-item dropdown mega-dropdown"> <a class="nav-link dropdown-toggle text-muted  " href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-th-large"></i></a>
                            <div class="dropdown-menu animated zoomIn">
                                <ul class="mega-dropdown-menu row">


                                    <li class="col-lg-3  m-b-30">
                                        <h4 class="m-b-20">CONTACT US</h4>
                                        <!-- Contact -->
                                        <form>
                                            <div class="form-group">
                                                <input type="text" class="form-control" id="exampleInputname1" placeholder="Enter Name"> </div>
                                            <div class="form-group">
                                                <input type="email" class="form-control" placeholder="Enter email"> </div>
                                            <div class="form-group">
                                                <textarea class="form-control" id="exampleTextarea" rows="3" placeholder="Message"></textarea>
                                            </div>
                                            <button type="submit" class="btn btn-info">Submit</button>
                                        </form>
                                    </li>
                                    <li class="col-lg-3 col-xlg-3 m-b-30">
                                        <h4 class="m-b-20">List style</h4>
                                        <!-- List style -->
                                        <ul class="list-style-none">
                                            <li><a href="javascript:void(0)"><i class="fa fa-check text-success"></i> This Is Another Link</a></li>
                                            <li><a href="javascript:void(0)"><i class="fa fa-check text-success"></i> This Is Another Link</a></li>
                                            <li><a href="javascript:void(0)"><i class="fa fa-check text-success"></i> This Is Another Link</a></li>
                                            <li><a href="javascript:void(0)"><i class="fa fa-check text-success"></i> This Is Another Link</a></li>
                                            <li><a href="javascript:void(0)"><i class="fa fa-check text-success"></i> This Is Another Link</a></li>
                                        </ul>
                                    </li>
                                    <li class="col-lg-3 col-xlg-3 m-b-30">
                                        <h4 class="m-b-20">List style</h4>
                                        <!-- List style -->
                                        <ul class="list-style-none">
                                            <li><a href="javascript:void(0)"><i class="fa fa-check text-success"></i> This Is Another Link</a></li>
                                            <li><a href="javascript:void(0)"><i class="fa fa-check text-success"></i> This Is Another Link</a></li>
                                            <li><a href="javascript:void(0)"><i class="fa fa-check text-success"></i> This Is Another Link</a></li>
                                            <li><a href="javascript:void(0)"><i class="fa fa-check text-success"></i> This Is Another Link</a></li>
                                            <li><a href="javascript:void(0)"><i class="fa fa-check text-success"></i> This Is Another Link</a></li>
                                        </ul>
                                    </li>
                                    <li class="col-lg-3 col-xlg-3 m-b-30">
                                        <h4 class="m-b-20">List style</h4>
                                        <!-- List style -->
                                        <ul class="list-style-none">
                                            <li><a href="javascript:void(0)"><i class="fa fa-check text-success"></i> This Is Another Link</a></li>
                                            <li><a href="javascript:void(0)"><i class="fa fa-check text-success"></i> This Is Another Link</a></li>
                                            <li><a href="javascript:void(0)"><i class="fa fa-check text-success"></i> This Is Another Link</a></li>
                                            <li><a href="javascript:void(0)"><i class="fa fa-check text-success"></i> This Is Another Link</a></li>
                                            <li><a href="javascript:void(0)"><i class="fa fa-check text-success"></i> This Is Another Link</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <!-- End Messages -->
                    </ul>
                    <!-- User profile and search -->
                    <ul class="navbar-nav my-lg-0">

                        <!-- Search -->
                        <li class="nav-item hidden-sm-down search-box"> <a class="nav-link hidden-sm-down text-muted  " href="javascript:void(0)"><i class="ti-search"></i></a>
                            <form class="app-search">
                                <input type="text" class="form-control" placeholder="Search here"> <a class="srh-btn"><i class="ti-close"></i></a> </form>
                        </li>
                        <!-- Comment -->
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-muted text-muted  " href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="fa fa-bell"></i>
								<div class="notify"> <span class="heartbit"></span> <span class="point"></span> </div>
							</a>
                            <div class="dropdown-menu dropdown-menu-right mailbox animated zoomIn">
                                <ul>
                                    <li>
                                        <div class="drop-title">Notifications</div>
                                    </li>
                                    <li>
                                        <div class="message-center">
                                            <!-- Message -->
                                            <a href="#">
                                                <div class="btn btn-danger btn-circle m-r-10"><i class="fa fa-link"></i></div>
                                                <div class="mail-contnet">
                                                    <h5>This is title</h5> <span class="mail-desc">Just see the my new admin!</span> <span class="time">9:30 AM</span>
                                                </div>
                                            </a>
                                            <!-- Message -->
                                            <a href="#">
                                                <div class="btn btn-success btn-circle m-r-10"><i class="ti-calendar"></i></div>
                                                <div class="mail-contnet">
                                                    <h5>This is another title</h5> <span class="mail-desc">Just a reminder that you have event</span> <span class="time">9:10 AM</span>
                                                </div>
                                            </a>
                                            <!-- Message -->
                                            <a href="#">
                                                <div class="btn btn-info btn-circle m-r-10"><i class="ti-settings"></i></div>
                                                <div class="mail-contnet">
                                                    <h5>This is title</h5> <span class="mail-desc">You can customize this template as you want</span> <span class="time">9:08 AM</span>
                                                </div>
                                            </a>
                                            <!-- Message -->
                                            <a href="#">
                                                <div class="btn btn-primary btn-circle m-r-10"><i class="ti-user"></i></div>
                                                <div class="mail-contnet">
                                                    <h5>This is another title</h5> <span class="mail-desc">Just see the my admin!</span> <span class="time">9:02 AM</span>
                                                </div>
                                            </a>
                                        </div>
                                    </li>
                                    <li>
                                        <a class="nav-link text-center" href="javascript:void(0);"> <strong>Check all notifications</strong> <i class="fa fa-angle-right"></i> </a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <!-- End Comment -->
                        <!-- Messages -->
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-muted  " href="#" id="2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="fa fa-envelope"></i>
								<div class="notify"> <span class="heartbit"></span> <span class="point"></span> </div>
							</a>
                            <div class="dropdown-menu dropdown-menu-right mailbox animated zoomIn" aria-labelledby="2">
                                <ul>
                                    <li>
                                        <div class="drop-title">You have 4 new messages</div>
                                    </li>
                                    <li>
                                        <div class="message-center">
                                            <!-- Message -->
                                            <a href="#">
                                                <div class="user-img"> <img src="resources/images/users/5.jpg" alt="user" class="img-circle"> <span class="profile-status online pull-right"></span> </div>
                                                <div class="mail-contnet">
                                                    <h5>Michael Qin</h5> <span class="mail-desc">Just see the my admin!</span> <span class="time">9:30 AM</span>
                                                </div>
                                            </a>
                                            <!-- Message -->
                                            <a href="#">
                                                <div class="user-img"> <img src="resources/images/users/2.jpg" alt="user" class="img-circle"> <span class="profile-status busy pull-right"></span> </div>
                                                <div class="mail-contnet">
                                                    <h5>John Doe</h5> <span class="mail-desc">I've sung a song! See you at</span> <span class="time">9:10 AM</span>
                                                </div>
                                            </a>
                                            <!-- Message -->
                                            <a href="#">
                                                <div class="user-img"> <img src="resources/images/users/3.jpg" alt="user" class="img-circle"> <span class="profile-status away pull-right"></span> </div>
                                                <div class="mail-contnet">
                                                    <h5>Mr. John</h5> <span class="mail-desc">I am a singer!</span> <span class="time">9:08 AM</span>
                                                </div>
                                            </a>
                                            <!-- Message -->
                                            <a href="#">
                                                <div class="user-img"> <img src="resources/images/users/4.jpg" alt="user" class="img-circle"> <span class="profile-status offline pull-right"></span> </div>
                                                <div class="mail-contnet">
                                                    <h5>Michael Qin</h5> <span class="mail-desc">Just see the my admin!</span> <span class="time">9:02 AM</span>
                                                </div>
                                            </a>
                                        </div>
                                    </li>
                                    <li>
                                        <a class="nav-link text-center" href="javascript:void(0);"> <strong>See all e-Mails</strong> <i class="fa fa-angle-right"></i> </a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <!-- End Messages -->
                        <!-- Profile -->
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-muted  " href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><img src="resources/images/users/5.jpg" alt="user" class="profile-pic" /></a>
                            <div class="dropdown-menu dropdown-menu-right animated zoomIn">
                                <ul class="dropdown-user">
                                    <li><a href="#"><i class="ti-user"></i> Profile</a></li>
                                   
                                    <li><a href="deconnect?d=decon"><i class="fa fa-power-off"></i> Logout</a></li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
        <!-- End header header -->
        <!-- Left Sidebar  -->
        <div class="left-sidebar">
            <!-- Sidebar scroll-->
            <div class="scroll-sidebar">
                <!-- Sidebar navigation-->
                <nav class="sidebar-nav">
                    <ul id="sidebarnav">
                        <li class="nav-devider"></li>
                        <li class="nav-label">Home</li>
                        <li> <a  href="user" aria-expanded="false"><i class="fa fa-tachometer"></i><span>Dashboard</span></a>
<!--                             <ul aria-expanded="false" class="collapse"> -->
<!--                                 <li><a href="index.html"> </a></li> -->
<!--                                 <li><a href="index1.html"></a></li> -->
<!--                             </ul> -->
                        </li>
                        <li class="nav-label"></li>
                        <li> <a class="has-arrow  " href="#" aria-expanded="false"><i class="fa fa-envelope"></i><span class="hide-menu">Comptes<span class="label label-rouded label-warning pull-right">2</span></span></a>
                            <ul aria-expanded="false" class="collapse">
                                <li><a href="compteEmp">Nouveau compte</a></li>
                                <li><a href="operationEmp">Operations compte</a></li>
                               
                            </ul>
                        </li>
<!--                         <li> <a class="has-arrow  " href="#" aria-expanded="false"><i class="fa fa-users"></i><span class="hide-menu">Clients<span class="label label-rouded label-danger pull-right">2</span></span></a> -->
<!--                             <ul aria-expanded="false" class="collapse"> -->
<!--                                 <li><a href="client">Liste Client</a></li> -->
                                
<!-- <!--                                 <li><a href="#">ChartJs</a></li> --> 
                                
<!--                             </ul> -->
<!--                         </li> -->
                        <li class="nav-label"></li>
<!--                         <li> <a class="has-arrow  " href="#" aria-expanded="false"><i class="fa fa-users"></i><span class="hide-menu">Employes<span class="label label-rouded label-warning pull-right">2</span></span></a> -->
<!--                             <ul aria-expanded="false" class="collapse"> -->
<!--                                 <li><a href="employe">Nouveau Employe</a></li> -->
<!--                                 <li><a href="empgroup">Ajout EmpToGrp</a></li> -->
<!-- <!--                                 <li><a href="ui-dropdown.html">Dropdown</a></li> --> 
                                
<!--                             </ul> -->
<!--                         </li> -->
<!-- 						<li> <a class="has-arrow  " href="#" aria-expanded="false"><i class="fa fa-users"></i><span class="hide-menu">Groupe<span class="label label-rouded label-danger pull-right">2</span></span></a> -->
<!--                             <ul aria-expanded="false" class="collapse"> -->
<!--                                 <li><a href="groupe">Nouveau Groupe</a></li> -->
<!--                                 <li><a href="#">Liste Groupes</a></li> -->
<!-- <!--                                 <li><a href="uc-nestedable.html">Nestedable</a></li> --> 
                                
<!--                             </ul> -->
<!--                         </li> -->
<!--                         <li> <a class="has-arrow  " href="#" aria-expanded="false"><i class="fa fa-wpforms"></i><span class="hide-menu">Transactions<span class="label label-rouded label-warning pull-right">1</span></span></a> -->
<!--                             <ul aria-expanded="false" class="collapse"> -->
<!--                                 <li><a href="form-basic.html">Opérations sur les Comptes</a></li> -->
<!-- <!--                                 <li><a href="form-layout.html">Form Layout</a></li> --> 
<!-- <!--                                 <li><a href="form-validation.html">Form Validation</a></li> --> 
<!-- <!--                                 <li><a href="form-editor.html">Editor</a></li> --> 
<!-- <!--                                 <li><a href="form-dropzone.html">Dropzone</a></li> --> 
<!--                             </ul> -->
<!--                         </li> -->
<!--                         <li> <a class="has-arrow  " href="#" aria-expanded="false"><i class="fa fa-table"></i><span class="hide-menu">Tables</span></a> -->
<!--                             <ul aria-expanded="false" class="collapse"> -->
<!--                                 <li><a href="table-bootstrap.html">Basic Tables</a></li> -->
<!--                                 <li><a href="table-datatable.html">Data Tables</a></li> -->
<!--                             </ul> -->
<!--                         </li> -->
<!--                         <li class="nav-label"></li> -->
                        
<!--                         <li class="nav-label"></li> -->
                       
                       
                        
                    </ul>
                </nav>
                <!-- End Sidebar navigation -->
            </div>
            <!-- End Sidebar scroll-->
        </div>
        <!-- End Left Sidebar  -->
        <!-- Page wrapper  -->
        <div class="page-wrapper">
            <!-- Bread crumb -->
            <div class="row page-titles">
                <div class="col-md-5 align-self-center">
                    <h3 class="text-primary">Opération sur les comptes</h3> </div>
                <div class="col-md-7 align-self-center">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="javascript:void(0)"></a></li>
                        <li class="breadcrumb-item active"></li>
                    </ol>
                </div>
            </div>
            <!-- End Bread crumb -->
            <!-- Container fluid  -->
            <div class="container-fluid">
                <!-- Start Page Content -->
                

                <div class="row">
                    <div class="col-lg-6">
                        <div class="card">
                           <div class="card card-outline-primary">
                            <div class="card-header">
                                <h4 class="m-b-0 text-white">Compte existant</h4>
                            </div>
                            <div class="card-body">
                                <form method="post" action="operationEmp">
                                    <div class="form-body">
                                        <h3 class="card-title m-t-15"></h3>
                                        <hr>
                                        <div class="row p-t-20">
                                            <div class="col-md-6">
                                                <div class="form-group">
                                                    <label class="control-label">Compte</label>
                                                    <input type="text" name="compte" id="firstName" class="form-control" required="required">
                                                     </div>
                                                        
                                            </div>
                                       
                        
                                             
                                            
                                        </div>
                                        <!--/row-->
                                        <div class="row">
                                            <div class="col-md-6">
                                                
                                            </div>
                                            <!--/span-->
                                           
                                            <!--/span-->
                                        </div>
                                        <!--/row-->
                                        <div class="row">
                                            <div class="col-md-6">
                                              
                                            </div>
                                            <!--/span-->
                                           
                                            <!--/span-->
                                        </div>
                                        <!--/row-->
                                       
                                       
                                        <!--/row-->
                                        
                                    </div>
                                    <div class="form-actions">
                                        <button type="submit" class="btn btn-success" name="action"> <i class="fa fa-check"></i>Recherche</button>
                                        <button type="button" class="btn btn-inverse">Cancel</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                        </div>
                        <!-- /# card -->
                    </div>
                    <!-- /# column -->
                    <div class="col-lg-6">
                        <div class="card">
                         <div class="card card-outline-primary">
                        <div class="card-header">
                                <h4 class="m-b-0 text-white">Informations du client</h4>
                            </div>
                           
                        	 <c:if test="${not empty compteTrouve }"> 
                            
                           
                                <div class="table-responsive">
                                    <table class="table table-striped">
                                        <thead>
                                            <tr>
                                                
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <th scope="row">1</th>
                                                <td>Solde</td>
                                                <td><span class="badge badge-primary">${compteTrouve.solde}</span></td>
                                                
                                            </tr>
                                            <tr>
                                                <th scope="row">2</th>
                                                <td>Date Creation</td>
                                                <td><span class="badge badge-success">${compteTrouve.dateCreation}</span></td>
                                                
                                            </tr>
                                            <tr>
                                                <th scope="row">3</th>
                                                <td>Type Compte</td>
                                                <td><span class="badge badge-danger">${typeCompte}</span></td>
                                                
                                            </tr>
                                             <c:if test="${typeCompte=='CompteEpargne' }">
                                            <tr>
                                                <th scope="row">4</th>
                                                <td>Taux</td>
                                               
                                                <td><span class="badge badge-success">${compteTrouve.taux}</span></td>
                                               
                                            </tr>
                                             </c:if>
                                             <c:if test="${typeCompte=='CompteCourant' }">
                                            <tr>
                                           
                                                <th scope="row">4</th>
                                                <td>Decouvert</td>
                                                
                                                <td><span class="badge badge-primary">${compteTrouve.decouvert}</span></td>
                   
                                            </tr>
                                            </c:if>
                                             <tr>
                                                <th scope="row">5</th>
                                                <td>Nom Client</td>
                                               
                                                <td><span class="badge badge-danger">${compteTrouve.client.nom}</span></td>
                                               
                                            </tr>
                                            <tr>
                                                <th scope="row">6</th>
                                                <td>Nom Employe</td>
                                               
                                                <td><span class="badge badge-danger">${compteTrouve.employe.nomEmloye}</span></td>
                                               
                                            </tr>
                                            
                                        </tbody>
                                    </table>
                                </div>
                            </c:if>
                           
                             <c:if test="${not empty exception }">
                             <div>
                             	${exception }
                             
                             </div>
                             
                             </c:if>
                              <c:if test="${not empty messageC }">
                             <div>
                             	${message }
                             
                             </div>
                             
                             </c:if>
                            
                            
                        </div>
                       </div>
                    </div>
				</div>
				<div class="row">
                    <div class="col-lg-6">
                    
                        <div class="card">
                         <div class="card card-outline-primary">
                         <form action="operationEmp" method="post" >
                            <div class="card-header">
                                <h4 class="m-b-0 text-white">Opérations sur le Compte : ${compteTrouve.numCompte}</h4>
                            </div>
                             
                            <div>
                                <div class="container">

							  <label class="radio-inline">
							
							    <input type="radio" name="op" id="Radios1" value="retrait">
							
							    Retrait
							
							  </label>
							
							  <label class="radio-inline">
							
							    <input type="radio" name="op" id="Radios2" value="versement">
							
							    Versement
							
							  </label>
							
							  <label class="radio-inline">
							
							    <input type="radio" name="op" id="Radios3" value="virement"  >
							
							    Virement
							
							  </label>
							
							</div>
							</div>
                            
                            <div class="card-body">
                               
                                    <div class="form-body">
                                        <h3 class="card-title m-t-15"></h3>
                                        <hr>
                                        <div class="row p-t-20">
                                            <div class="col-md-6">
                                                <div class="form-group">
                                                    <label class="control-label">Montant</label>
                                                    <input type="text" name="montant" id="firstName" class="form-control" required="required">
                                                     </div>
                                                     
                                                       <div class="form-group">
                                                    <label class="control-label"></label>
                                                    <input name="numeroCompte" type="hidden" class="form-control" value="${compteTrouve.numCompte}">
                                                     </div>
                                                    
                                                      
                                                </div>
                                                     <div class="form-group">
                                                    <label class="control-label">Vers le compte :</label>
                                                    <input type="text" name="compte2" id="firstName" class="form-control" >
                                                     </div>
                                                     
                                                    
                                                    
                                                    
                                                     
                                                     
                                                        
                                            </div>
                                       
                        
                                             
                                            
                                        </div>
                                        <!--/row-->
                                        <div class="row">
                                            <div class="col-md-6">
                                                
                                            </div>
                                            <!--/span-->
                                           
                                            <!--/span-->
                                        </div>
                                        <!--/row-->
                                        <div class="row">
                                            <div class="col-md-6">
                                               
                                            </div>
                                            <!--/span-->
                                           
                                            <!--/span-->
                                        </div>
                                        <!--/row-->
                                       
                                       
                                        <!--/row-->
                                        
                                    </div>
                                    <div class="form-actions">
                                        <button type="submit" name="action1" class="btn btn-success"> <i class="fa fa-check"></i>Enregistrer</button>
                                        <button type="button" class="btn btn-inverse">Cancel</button>
                                    </div>
                                </form>
                            </div>
                           
                        </div>
                        </div>
                    
                    
					<div class="col-lg-6">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Table Operations</h4>
                                <h6 class="card-subtitle"></h6>
                                
                                <div class="table-responsive m-t-40">
                                <form action="operation" method="post">
                                    <table id="example23" class="display nowrap table table-hover table-striped table-bordered" cellspacing="0" width="100%" height="30px">
                                        <thead>
                                            <tr>
                                                <th>Numéro</th>
                                                <th>Type</th>
                                                <th>Date</th>
                                                <th>Montant</th>
                                               
                                                
                                                
                                            </tr>
                                        </thead>
                                        <tfoot>
                                            <tr>
                                                <th>Numéro</th>
                                                <th>Type</th>
                                                <th>Date</th>
                                                <th>Montant</th>
                                                
                                                
                                               
                                            </tr>
                                        </tfoot>
                                        <tbody>
                                        <c:if test="${not empty compteTrouve }">
                                          <c:forEach items="${operations}" var="rep">
                                        
                                            <tr>
                                                <td>${rep.numOperation }</td>
                                                 <td>${rep}</td>
                                                <td>${rep.dateOperation }</td>
                                                <td>${rep.montant}</td>
                                               
                                                
                                            </tr>
         
                                           </c:forEach>
                                           </c:if>
                                        </tbody>
                                    </table>
                                  </form>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                   
                    <!-- /# column -->
                </div>
                <!-- /# row -->

<!--                 <div class="row"> -->
<!--                  <div class="card"> -->
                 
<!--                  </div>    -->
<!--                 </div> -->


                <!-- End PAge Content -->
            </div>
            <!-- End Container fluid  -->
            <!-- footer -->
            <footer class="footer"> © 2018 All rights reserved. Template designed by <a href="https://colorlib.com">Colorlib</a></footer>
            <!-- End footer -->
        </div>
        <!-- End Page wrapper  -->
    </div>
    <!-- End Wrapper -->
    <!-- All Jquery -->
    <script src="resources/js/lib/jquery/jquery.min.js"></script>
    <!-- Bootstrap tether Core JavaScript -->
    <script src="resources/js/lib/bootstrap/js/popper.min.js"></script>
    <script src="resources/js/lib/bootstrap/js/bootstrap.min.js"></script>
    <!-- slimscrollbar scrollbar JavaScript -->
    <script src="resources/js/jquery.slimscroll.js"></script>
    <!--Menu sidebar -->
    <script src="resources/js/sidebarmenu.js"></script>
    <!--stickey kit -->
    <script src="resources/js/lib/sticky-kit-master/dist/sticky-kit.min.js"></script>


    <script src="resources/js/lib/datamap/d3.min.js"></script>
    <script src="resources/js/lib/datamap/topojson.js"></script>
    <script src="resources/js/lib/datamap/datamaps.world.min.js"></script>
    <script src="resources/js/lib/datamap/datamap-init.js"></script>

    <script src="resources/js/lib/weather/jquery.simpleWeather.min.js"></script>
    <script src="resources/js/lib/weather/weather-init.js"></script>
    <script src="resources/js/lib/owl-carousel/owl.carousel.min.js"></script>
    <script src="resources/js/lib/owl-carousel/owl.carousel-init.js"></script>


    <script src="resources/js/lib/chartist/chartist.min.js"></script>
    <script src="resources/js/lib/chartist/chartist-plugin-tooltip.min.js"></script>
    <script src="resources/js/lib/chartist/chartist-init.js"></script>
    <!--Custom JavaScript -->
    <script src="resources/js/custom.min.js"></script>
    
    <!--               database -->
    <script src="resources/js/lib/datatables/datatables.min.js"></script>
    <script src="resources/js/lib/datatables/cdn.datatables.net/buttons/1.2.2/js/dataTables.buttons.min.js"></script>
    <script src="resources/js/lib/datatables/cdn.datatables.net/buttons/1.2.2/js/buttons.flash.min.js"></script>
    <script src="resources/js/lib/datatables/cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js"></script>
    <script src="resources/js/lib/datatables/cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/pdfmake.min.js"></script>
    <script src="resources/js/lib/datatables/cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/vfs_fonts.js"></script>
    <script src="resources/js/lib/datatables/cdn.datatables.net/buttons/1.2.2/js/buttons.html5.min.js"></script>
    <script src="resources/js/lib/datatables/cdn.datatables.net/buttons/1.2.2/js/buttons.print.min.js"></script>
    <script src="resources/js/lib/datatables/datatables-init.js"></script>
</body>

</html>