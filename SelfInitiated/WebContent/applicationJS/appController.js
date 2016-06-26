var myapp=angular.module('initiation',['ngRoute','ngMaterial','ngSanitize']);
myapp.config(function($routeProvider){
	$routeProvider
	
	.when(
		'/' , {
				controller : "initiationCtrl",
				templateUrl : "pages/SecondFile.html",
			})
		.when('/BlogsPage',{
		 
		         controller: "initiationCtrl",
		         templateUrl:"pages/BlogsPage.html",
	              })	
	     .when('/Blog1Page',{
	    	     controller: "initiationCtrl",
	    	     templateUrl:"pages/Blog1Page.html",
	     })
	     .when('/Algorithm',{
		     controller: "initiationCtrl",
    	     templateUrl:"pages/AlgoPage.html", 	    	 
	     })
	     .when('/BinarySearch',{
	    	 controller:"initiationCtrl",
	    	 templateUrl:"pages/BinarySearch.html",
	     })
	     .when('/Questionarre',{
	    	 controller:"questionCtrl",
	    	 templateUrl:"pages/FAQ.html",
	     })
	         .otherwise ({redirectTo : '/'});
});