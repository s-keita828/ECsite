<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>商品一覧削除確認画面</title>

	<script type="text/javascript">
		function submitAction(url){
			$('form').attr('action' , url);
			$('form').submit();
			}
	</script>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>削除確認</p>
		</div>
		<div>
			<h3>すべての商品を削除します。よろしいですか?</h3>
			<s:form>
				<input type="button" value="OK" onclick="submitAction('ItemListDeleteCompleteAction')" />
				<input type="button" value="キャンセル" onclick="submitAction('ItemListAction')" />
			</s:form>
		</div>
	</div>
	<div id="footer">
	</div>
</body>
</html>