var app = angular.module('demoApp',[]);

app.controller('demoCtrl',function($scope, $http){
	var employee = {
			name:"santhosh",
			age:"40 years",
			gender:"male"
	};
	$scope.message = "Welcome to Angular JS";
	$scope.employee = employee;
	$http({
		method: 'GET',
		url: 'http://localhost:8080/messenger/webapi/message'})
			.then(function successCallback(response){
				$scope.messages = response.data;
			},function errorCallback(response){
				
			});
	
	$http({
		method: 'GET',
		url: 'http://localhost:8080/messenger/webapi/profile'})
			.then(function successCallback(response){
				$scope.profiles = response.data;
			},function errorCallback(response){
				
			});
});