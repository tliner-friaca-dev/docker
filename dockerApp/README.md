<h2 style="text-align:center"><strong>&gt;&gt;&gt; Docker - Comunica&ccedil;&atilde;o Entre Dois Containers &lt;&lt;&lt;</strong></h2>

<p>&nbsp;</p>

<p>Este projeto trata-se da utiliza&ccedil;&atilde;o do Docker com implementa&ccedil;&atilde;o em Spring Boot e o banco de dados MySql.</p>

<p>Segundo o pr&oacute;prio site do Docker: &quot;<em>O Docker elimina tarefas de configura&ccedil;&atilde;o repetitivas e mundanas e &eacute; usado em todo o ciclo de vida do desenvolvimento para desenvolvimento de aplicativos r&aacute;pido, f&aacute;cil e port&aacute;til &ndash; desktop e nuvem. A plataforma abrangente de ponta a ponta do Docker inclui UIs, CLIs, APIs e seguran&ccedil;a que s&atilde;o projetados para trabalhar juntos em todo o ciclo de vida de entrega do aplicativo.</em>&quot;.</p>

<p>Trata-se de um projeto simples, sem tratamentos de erros ou outras preocupa&ccedil;&otilde;es sen&atilde;o apenas demonstrar a comunica&ccedil;&atilde;o entre dois containers, um sendo a aplica&ccedil;&atilde;o e o outro sendo o banco de dados.</p>

<p><br />
<strong>Pr&eacute;-requisitos para testar o projeto:</strong></p>

<ul>
	<li>instalar o Docker no computador.</li>
</ul>

<p>&nbsp;</p>

<p><strong>Executar o seguinte passa a passo:</strong></p>

<ul>
	<li>Gere o build da aplica&ccedil;&atilde;o docker-app.</li>
	<li>Abrir um terminal.</li>
	<li>Entrar na pasta do projeto dockerMySql que cont&eacute;m o arquivo Dockerfile.</li>
	<li>Executar o comando abaixo para criar a imagem do banco de dados:
	<ul>
		<li>docker build -t docker-mysql .</li>
	</ul>
	</li>
	<li>Executar o comando abaixo para criar o container da imagem do banco de dados:
	<ul>
		<li>docker run -d -v docker-mysql-volume:/var/lib/docker/volumes -p 3306:3306 --name docker-mysql-container docker-mysql</li>
	</ul>
	</li>
	<li>Executar o comando para criar o banco de dados, tabela e registros:
	<ul>
		<li>docker exec -i docker-mysql-container mysql -uroot -proot &lt; script.sql</li>
	</ul>
	</li>
	<li>Entrar na pasta do projeto dockerApp que cont&eacute;m o arquivo Dockerfile.</li>
	<li>Executar o comando abaixo para criar a imagem da aplica&ccedil;&atilde;o:
	<ul>
		<li>docker build -t docker-app .</li>
	</ul>
	</li>
	<li>Executar o comando abaixo para criar o container da imagem da aplica&ccedil;&atilde;o:
	<ul>
		<li>docker run -d --link docker-mysql-container -p 8080:8080 --name docker-app-container docker-app</li>
	</ul>
	</li>
	<li>Executar o comando para criar o banco de dados, tabela e registros:
	<ul>
		<li>docker exec -i docker-mysql-container mysql -uroot -proot &lt; script.sql</li>
	</ul>
	</li>
</ul>

<p><br />
<strong>Para testar este projeto:</strong></p>

<ul>
	<li>Executar no navegador de internet a seguinte url:
	<ul>
		<li>http://localhost:8080/app/obterTodos</li>
	</ul>
	</li>
</ul>

<p>&nbsp;</p>
