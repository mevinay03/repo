app.controller('mcqController', function($scope,$timeout) {
	

	$scope.submit_answer=function(){
		alert("hello");	
	}
	$scope.resetForm=function(){
		
	}
	var randomSelect=parseInt((Math.random()*10)%4);
	$scope.records = [
        "2. Magnesium ribbon is rubbed before burning because it has a coating of",
		"3. Which of the following statements about the given reaction are correct?",
		"4. Which of the following are exothermic processes?",
		"5. Oxidation is a process which involves"]
	$scope.paragraph=$scope.records[randomSelect];
});