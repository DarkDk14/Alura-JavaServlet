<%
// Scriplet
 String nomeEmpresa = (String)request.getAttribute("empresa");
 System.out.println(nomeEmpresa);
%>

<html>

	<body>
		
		Empresa <strong> <%= nomeEmpresa %> </strong> cadastrada com sucesso!
	
	</body>
	
</html>


