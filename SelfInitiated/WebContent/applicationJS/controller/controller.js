myapp.controller("initiationCtrl",['$scope','$http','$rootScope','$location','$sce',function($scope,$http,$rootScope,$location,$sce)
		{
	$(document).ready(function(){
		$('input.typeahead').typeahead({
			name: 'Pages',
			local: ['Algorithm', 'BinarySearch', 'Blog1Page', 'BlogsPage']
		});
	});
	     $scope.gotoPage=function()
	     {
	     var page=document.getElementById("q").value;
	     $location.path('/'+page);
	     };
	     
	     $('#myTabs a').click(function (e) {
	    	 console.log('hello');
	    	  e.preventDefault();
	    	  $(this).tab('show');
	    	});
	     
	     $scope.logIn=function(login)
	     {
	    	 console.log(login);
	    	 $http.post('rest/app/userLogin',login).success(function() 
	   			   {
	                           $scope.login=login;              		   
	   			   }).error(function()
	   					   {
	   				         console.log("Error while login !!");

	   					   });
	     };
	    	
	    $scope.SignUp=function(signup)
	    {
	    	console.log(signup);
	    	$http.post('rest/app/userSignup',signup).success(function(data) 
	  			   {
	                 console.log(data);                       		   
	  			   }).error(function()
	  					   {
	  				         console.log("Error while getting the slots available!!");

	  					   });
	    };
		}]);

myapp.controller("questionCtrl",['$scope','$http','$rootScope','$location','$sce',function($scope,$rootScope,$http,$location,$sce)                             
         {
	
	var question1=$sce.trustAsHtml(                            	
	'<p style="margin-bottom: 0px; padding-bottom: 0px; font-size: 85%;">Consider the following <code>UITableViewCell</code> constructor:</p>'
     +
	'<pre style="margin-bottom: 11px;"><code>- (id)initWithStyle:(UITableViewCellStyle)style reuseIdentifier:(NSString *)reuseIdentifier</code></pre>'
    +
	'<p style="padding-bottom: 0px; font-size: 85%;">What is the purpose of the <code>reuseIdentifier</code>? What is the advantage of setting it to a non-<code>nil</code> value?</p>'
	);
	
	var question2=$sce.trustAsHtml(                            	
			'<p style="margin-bottom: 0px; padding-bottom: 0px; font-size: 85%;">Consider the following <code>UITableViewCell</code> constructor:</p>'
		     +
			'<pre style="margin-bottom: 11px;"><code>- (id)initWithStyle:(UITableViewCellStyle)style reuseIdentifier:(NSString *)reuseIdentifier</code></pre>'
		    +
			'<p style="padding-bottom: 0px; font-size: 85%;">What is the purpose of the <code>reuseIdentifier</code>? What is the advantage of setting it to a non-<code>nil</code> value?</p>'
			);
	
	var answer1=$sce.trustAsHtml(                            	
			'<p>The <code>reuseIdentifier</code> is used to group together similar rows in an <code>UITableView</code>; i.e., rows that differ only in their content, but otherwise have similar layouts.</p>'
             +
          	'<p>A <code>UITableView</code> will normally allocate just enough <code>UITableViewCell</code> objects to display the content visible in the table. If <code>reuseIdentifier</code> is set to a non-<code>nil</code> value, then when the table view is scrolled, <code>UITableView</code> will first attempt to reuse an already allocated <code>UITableViewCell</code> with the same <code>reuseIdentifier</code>. If <code>reuseIdentifier</code> has not been set, the <code>UITableView</code> will be forced to allocate new <code>UITableViewCell</code> objects for each new item that scrolls into view, potentially leading to laggy animations.</p>'
			);
	
	var answer2=$sce.trustAsHtml(                            	
			'<p>The <code>reuseIdentifier</code> is used to group together similar rows in an <code>UITableView</code>; i.e., rows that differ only in their content, but otherwise have similar layouts.</p>'
            +
         	'<p>A <code>UITableView</code> will normally allocate just enough <code>UITableViewCell</code> objects to display the content visible in the table. If <code>reuseIdentifier</code> is set to a non-<code>nil</code> value, then when the table view is scrolled, <code>UITableView</code> will first attempt to reuse an already allocated <code>UITableViewCell</code> with the same <code>reuseIdentifier</code>. If <code>reuseIdentifier</code> has not been set, the <code>UITableView</code> will be forced to allocate new <code>UITableViewCell</code> objects for each new item that scrolls into view, potentially leading to laggy animations.</p>'
			);
			
	$scope.questions=[{"question":question1,"answer":answer1},{"question":question2,"answer":answer2}];
         }]);