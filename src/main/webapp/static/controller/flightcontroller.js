/**
 * 
 */

'use strict';


var flightctrl=angular.module('flightApp',[ ]);

flightctrl.controller('flightsearchCtrl',[ '$scope', '$http', '$location' ,function($scope,$http,$location){
	
	var vm= this;
	vm.flightq={};
	vm.structure={};
     vm.iata={};
	
     $http.get('getflightiata.json').success(function(response) {
		   
		 console.log('success');
		   vm.iata = response;		   
	    }).error(function(err){ 
	    	
	    	console.dir(err); 
	    	
	    	console.log('error');
         });
	vm.submit=function(){
		  
		console.log("Inside Submit Function");
		
		// 'startDate=1545415916&endDate=1545761516&origin=JFK&destination=PIT&howMany=15',
		//convert date into timestamp
		//startDate=1545415916&amp;endDate=1545761516
		//origin=JFK&amp;destination=PIT&amp;howMany=15
		//sample date 
		//alert(vm.flightq.startDate);
		
		vm.flightq.howMany=15;
		//console.log('Origin : ' +vm.flightq.origin + ' Destination : '+vm.flightq.destination);
		
		vm.flightq.startDate=1545415916;
		vm.flightq.endDate=1545761516;
		vm.flightq.origin="JFK";
		vm.flightq.destination="PIT";
		vm.flightq.howMany=15;
		
		//sample data
		// ?startDate=1545415916&endDate=1545761516&origin=JFK&destination=PIT&howMany=15
		vm.flightq.startDate=1545415916;
		console.log(vm.flightq);	
		 $http({
	         method: 'POST',
	         data: vm.flightq,
	         url: 'http://flightxml.flightaware.com/json/FlightXML2/AirlineFlightSchedules?startDate=1545415916&endDate=1545761516&origin=JFK&destination=PIT&howMany=15', 
	         
	         
	        }).success(function(response) {
	        	alert(' Success '); 
	        	console.dir(response);
	        	structure=response;
	        	
	        	$window.location.href = '/viewdata.html';
	        }).error(function(response){ 
	        	 
	        	
	            alert(response);	        
	        });	
		 
		
		 
         }
	}]);