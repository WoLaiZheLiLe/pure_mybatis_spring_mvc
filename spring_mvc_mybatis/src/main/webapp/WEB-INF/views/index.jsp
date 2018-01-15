<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">   
    <title>Insert title here</title>
  </head>
  <body>
  	<div class="root">
  		<div class="">
  			<button id="insert">新增</button>
  			<button id="update">修改</button>
  		</div>
  	</div>
  	<script type="text/javascript" src="/static/jquery-3.2.1.js"></script>
  	<script type="text/javascript">
  		$(function() {
  			var arr = [];
  			for (i = 1; i < 7; i++) {
  				var tmp = {
  					name: 'fj' + i,
  					age: Math.random() * 100 * i
  				}
  				arr.push(tmp);
  			}
  			$('#insert').click(function () {
  				$.ajax({
  	  				url: '/insert',
  	  				type: 'post',
  	  				contentType: 'application/json;charset=UTF-8',
  	  				data: JSON.stringify(arr),
  	  				success: function(data) {
  	  					console.info(data);
  	  				}
  	  			});
  			});
  			var update = [{
  				id: 1,
  				name: 'lmz' + 1,
  				age: 111
  			}, {
  				id: 2,
  				name: 'lmz' + 2,
  				age: 222
  			}];
  			$('#update').click(function() {
  				$.ajax({
  					url: '/update',
  					type: 'post',
  					contentType: 'application/json;charset=UTF-8',
  	  				data: JSON.stringify(update),
  	  				success: function(data) {
  	  					console.info(data);
  	  				}
  				});
  			});
  		});
  	</script>
  </body>
</html>