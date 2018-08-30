
<html ng-app="flightApp">
<head>
	<title>Flight Ticket Booking </title>
	<link rel="stylesheet" href="static/css/style.css">
	<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300italic,300,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
	<link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Flight Ticket Booking  Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.4.2/angular.js"></script>	
	<script src="static/controller/flightcontroller.js"></script>
	
  <!-- JQuery Date Picker -->
  
  <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  	
</head>
<body>
	<h1>Flight Ticket Booking</h1>
	<div class="main-agileinfo">
		<div class="sap_tabs">			
			<div id="horizontalTab">
				<ul class="resp-tabs-list">
					<li class="resp-tab-item"><span>Trip</span></li>
<!-- 					<li class="resp-tab-item"><span>One way</span></li> -->
<!-- 					<li class="resp-tab-item"><span>Multi city</span></li>				 -->
				</ul>	
				<div class="clearfix"> </div>	
				<div class="resp-tabs-container">
					<div class="tab-1 resp-tab-content roundtrip" ng-controller="flightsearchCtrl as vm">
						<form id="categoryForm" method="POST" ng-submit="vm.submit()">
<!-- 							<div class="class"> -->
<!-- 								<h3>From</h3> -->


<!--                                    <select id="city" onchange="change_country(this.value)" class="frm-field required"> -->
<!-- 									<option value="null">Blue Mountain Airport</option>   -->
<!-- 									<option value="null">Crystal Lake Airport</option>    -->
<!-- 									<option value="null">Opa-locka Executive Airport</option>    -->
<!-- 									<option value="null">First class</option>   						 -->
<!-- 								</select> -->
<!-- 							</div> -->
							
							<div class="class">
								<h3>From</h3>
								<select id="from"  name="from" ng-model="vm.flightq.origin" class="frm-field required">
									<option ng-repeat="country in vm.iata" 
                                     value="{{country.iata}}">{{country.iata}}</option>   						
								</select>
								<div class="clear"></div>
							</div>
							
							<div class="class">
								<h3>To</h3>
								<select id="to"  name="to" ng-model="vm.flightq.destination" class="frm-field required">
									<option ng-repeat="country in vm.iata" 
                                     value="{{country.iata}}">{{country.iata}}</option>  
															
								</select>
								<div class="clear"></div>
							</div>
							
							<div class="clear"></div>
							
							
							<div >
								<div class="depart">
									<h3>Depart</h3>
									<input class="form-control" id="date1" name="date1" ng-model="vm.flightq.startDate" type="text"  >
									
								</div>
								<div class="return">
									<h3>Return</h3>
									<input class="form-control" id="date" name="date" class="startdate" ng-model="vm.flightq.endDate"  type="text"/>
									
								</div>
								<div class="clear"></div>
							</div>
							
							<div class="clear"></div>
							
							<div class="clear"></div>
							<input type="submit" value="Search Flights">
						</form>						
					</div>
					
					<!--  -->		
					
					
		
				</div>						
			</div>
		</div>
	</div>
	<div class="footer-w3l">
		<p class="agileinfo"> &copy;  Flight Ticket Booking </p>
	</div>
	<!--script for portfolio-->
		<script src="static/js/jquery.min.js"> </script>
		<script src="static/js/easyResponsiveTabs.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(document).ready(function () {
				$('#horizontalTab').easyResponsiveTabs({
					type: 'default', //Types: default, vertical, accordion           
					width: 'auto', //auto or any width like 600px
					fit: true   // 100% fit in a container
				});
			});		
		</script>
		<!--//script for portfolio-->
				
								<!--//quantity-->
						<!--load more-->
								<script>
	$(document).ready(function () {
		size_li = $("#myList li").size();
		x=1;
		$('#myList li:lt('+x+')').show();
		$('#loadMore').click(function () {
			x= (x+1 <= size_li) ? x+1 : size_li;
			$('#myList li:lt('+x+')').show();
		});
		$('#showLess').click(function () {
			x=(x-1<0) ? 1 : x-1;
			$('#myList li').not(':lt('+x+')').hide();
		});
	});
</script>
<!-- //load-more -->



</body>
</html>