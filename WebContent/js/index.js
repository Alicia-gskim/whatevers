/**
 * http://usejsdoc.org/
 */
$(function(){
	
	console.log("111111");
	
	$('#moveBtn').on('click', function(){
		console.log("button click");
		getJsonData();
	});
});

this.onload = function(){
	console.log("222222");
};

function getJsonData(){
	console.log("===== getJsonData ===== START =====");
	$.ajax({
		type :'post',
		dataType : 'json',
		url : "/first",
		success : function(res){
			var result = res.data.info;
			console.log(result);
			
			var html = "";
			for(var i=0; i<result.length; i++){
				html += "<tr>";
				html += "<td>"+ result[i].IDX +"</td>";
				html += "<td>"+ result[i].TITLE +"</td>";
				html += "<td>"+ result[i].NAME +"</td>";
				html += "<td>"+ result[i].IP +"</td>";
				html += "<td>"+ result[i].INS_DT +"</td>";
				html += "<td>"+ result[i].UPD_DT +"</td>";
				html += "</tr>";
			}
			$('table.selectInfo tbody').html(html);
		},
		error : function(e){
			console.log(e);
		}
	});
	console.log("===== getJsonData ===== END =====");
}