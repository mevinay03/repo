app.controller('myCtrl', function($scope,$timeout) {
	
	var testedWord="";
	var totalWrd ="";
	var wrongWrd ="";
	var accuracy ="";
	var wrdSpeed ="";
	var typedText=[];
	var correctText=[];
	$scope.fontsize=20;
	var skipword=0;
	var flag=false;
	var randomSelect=parseInt((Math.random()*10)%4);
	var count=randomSelect;
	var countKeyword=0;
	var backSpace=0;
	var txtArea="";
	var totalKeyWord=0;
	
	$scope.clk_aPlus=function(){
		$scope.fontsize=$scope.fontsize +1;
		
	}
	$scope.onKeyPress = function(){
		countKeyword=countKeyword+1;
		//alert(countKeyword);
	}
	
	 getSpellcheck = function(){
		 testedWord="";
		$scope.skipword=0;
		totalKeyWord=$scope.txtArea.split("").length;
		typedText=$scope.txtArea.split(" ");
		correctText=$scope.records[count].split(" ");
		$scope.txtArea="";
		for(var i=0,j=0;i<typedText.length;){
			if(typedText[i]==correctText[j]){
				testedWord=testedWord+typedText[i]+" ";
				i++;
				j++;
				
			}else{
				testedWord=testedWord+typedText[i]+"("+correctText[j]+")"+" ";
				skipword++;
				j++;
				i++;
			}
		}
	$scope.backSpace = countKeyword - totalKeyWord;
	$scope.skipword=skipword;
	$scope.txtArea=testedWord;
	$scope.flag=true;
	 
	}
	$scope.clk_aMinus=function(){
		$scope.fontsize=$scope.fontsize -1;
	}
	
	$scope.clk_getResult = function(str){
		if(!str == ""){
			getSpellcheck();
			$scope.totalWrd=str.split(" ").length;
		}
		else
			$scope.totalWrd=0;
	}
	
	$scope.clk_resetWord = function(str){
		$scope.timeLimit=0;
		$scope.txtArea="";
		$scope.totalWrd=0;
		$scope.skipword=0;
	}
	$scope.time = 0;
	$scope.clk_timeStart = function(tLimit){
		if ($scope.time < tLimit) { // 1000 milisecond = 1 sec
            $scope.time += 1000;
            $timeout(timer, 500);
        }
	}
	$scope.clk_previous=function(){
		count=count-1;
		if(count==-1)
			count=$scope.records.length-1;
		$scope.paragraph=$scope.records[count];
	}
	$scope.clk_next=function(){
		count=count+1;
		if(count>=$scope.records.length)
			count=0;
		$scope.paragraph=$scope.records[count];
	}
	 


	$scope.records = [
        "Meg is 14-years-old. Everyone sees her as a troublemaker (a person who makes/causes trouble). They think she’s a bad student. Everyone in her family seems to be perfect. Her mom is a very beautiful scientist. Her twin brothers are very athletic. And her little 5-year-old brother, Charles Wallace Murry, is a child genius and can often read the mind of Meg.One night Meg can’t sleep. She goes downstairs to find her young brother sitting at the kitchen table drinking milk. Later their mom joins them. A strange neighbor called Mrs. Whatsit joins them. Mrs. Whatsit is talking a lot and says that the “tesseract” is real. We (the readers) don’t know what this means, but Mrs. Murry knows what it is. She looks like she is going to faint (fall down from sickness or fear).Meg and her brother meet a friend the next day. Calvin O’Keefe is a high school junior student. Together, the three of them go to visit an old haunted house which belongs to Mrs. Whatsit. While going there they meet Mrs. Whatsit’s friend, Mrs. Who. Mrs.Who is also very strange. Meg and Calvin begin to like each other. Charles suddenly announces that they should focus on finding their father who is lost somewhere in the universe.Strange things happen and the older women turn into supernatural (not from Earth) beings. They transport the kids to the universe by the “tesseract.” They stop and visit different planets on the way. The women tell the children that the universe is being attacked by the “Black thing” (the devil).They find out where Meg’s father is being kept. Charles tries to use his psychic (in his mind) powers to see where their dad is. Eventually they find their dad, but not without drama. Along the way, Meg learns to love. She uses this new love to help them escape.",
        "A thirsty crow flew around a village in search of water. He looked for it near and far, but he failed to find water anywhere. After hours and hours of tirelessly searching, he finally found some water in a pitcher. However, the water level was too low and his beak couldn’t reach the water.He tried to push the pitcher down, but the vessel was far too heavy for that. The crow was very disappointed. He was contemplating giving up and flying elsewhere in search of water. Just then, he spotted a few pebbles lying around and an idea struck him! He collected a pebble and dropped it into the vessel. Then, another and another. He kept repeating this process until the water had risen to a level from which he could drink the water. The crow drank the water from the brim and flew home happy and satisfied!",
        "A day arrived when three of the friends decided to go looking for jobs in distant towns and villages. They wanted monetary gain for their knowledge. After all, there was no use of being so learned in scriptures and sciences if they were not going to gain anything back from it. The three friends did not wish to take Subuddhi along because of his lack of intellect but since he was an old childhood friend, they decided to invite him too.The four friends set out on a long journey, moving from one town to another in search of a way to earn money. While passing through a dense forest, they discovered a bunch of bones lying under a tree. They decided that a fine opportunity to display their powers had presented itself.The first friend used his skills to assemble the bones into a skeleton. When the skeleton was ready, the second friend chanted a mantra, which lead to the formation of flesh and meat on the skeleton. It looked like a lifeless lion. Just as the third friend was about to end the show by bringing the lion back to life, the fourth friend stopped him. Subuddhi knew that once the ferocious lion was brought back to life, it wouldn’t spare them.However, the third friend ignored his advice, made fun of him and went ahead with something that was clearly a bad idea. Subuddhi quickly climbed up a tree nearby to protect himself as the third friend began to chant, thereby bringing the lion back to life. As predicted by the fourth friend, the lion killed all three of the learned friends while Subuddhi rushed back to the village, alive.",
        "When Kartik and his sister, Kavya, move from Kolkata to Rourkela, they’re very upset over moving to a new place and leaving behind their close friends. It was especially frightening for Kartik because he knew that the people at his new school would judge him for having a disability. Unfortunately, he is treated as an outcast, as a freak even though he is just one of them, trying hard to make a friend.However, what really tears him apart is his football coach refusing to let him be on the football team. The football field was the one place where he felt like the best version of himself. The only place where he felt a true sense of belonging and now, it felt like his home was snatched away from him. Will Kartik be able to beat the odds and convince the coach of his dedication to the game? Trust us this book will help teach your child the value of a good moral of never giving up.",
    ]
	$scope.paragraph=$scope.records[randomSelect];
	$scope.txtColors = [
	  {name : "Orange", value : "orange"},
	  {name : "Black", value : "black"},
	  {name : "Blue", value : "blue"},
	  {name : "Red", value : "red"},
	  {name : "Brown", value : "brown"}
	  
	];
});