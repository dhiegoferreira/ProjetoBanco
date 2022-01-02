# **Projeto de Sistema Bancário**:bank:

### **O que é o projeto?** 

### Este projeto, escito em Java com auxílio do Framework Java Swing, tem como objetivo simular uma aplicação Desktop básica de um Sistema Bancário. Além disso, possui integração ao banco de dados MySql para implementação do CRUD. Nesta aplicação foram implementadas algumas funções caracaterísticas do tipo do sistema, como:

- *Consultar saldo*
- *Depositar*
- *Sacar*
- *Transferir*

### **Telas implementadas** :desktop_computer:

- Tela Login:

  ![TelaLogin](https://user-images.githubusercontent.com/53379935/145625682-4d6df52f-c04d-4f28-a3a0-a1fd80fd374a.png)
  
  
  #### Validação de acesso e consulta ao Banco de Dados:
  ```
       public void logar(){        
       String sql="Select * from conta WHERE Numero = ? and Senha = ?";
       try {
           //Capturar o que está no formulário
           //prepara consulta ao banco, passando o que foi digitado nas caixas de texto.
           // o ? é substituido pelo conteúdo inserido pelo usuário através das caixas de texto.
           pst = conexao.prepareStatement(sql);
           pst.setString(1, txtLogin.getText());
           pst.setString(2, txtSenha.getText());
           
           // A linha abaixo executa a query
           rs = pst.executeQuery();
           
           //Se existir usuário e senha correspondente
           if(rs.next()){//LIBERA O ACESSO
               conta = Integer.parseInt(txtLogin.getText());
               System.out.println(conta);
               senha = Integer.parseInt(txtSenha.getText());
               TelaAcesso telacess = new TelaAcesso();
               this.dispose();
               telacess.setVisible(true); //Vai abrir a tela de acesso
                             
           } else {//RECUSA O ACESSO
               JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido(s).");
               txtLogin.setText("");
               txtSenha.setText("");
           }     
       } catch (Exception e) {JOptionPane.showMessageDialog(null, e); }    
       }
    ``` 
  

- Tela Criar Conta:

  ![TelaCriarConta](https://user-images.githubusercontent.com/53379935/145626160-4c7711fb-4b25-405e-8a54-11a4b02c44b9.png)

- Tela Acesso:

  ![TelaAcesso](https://user-images.githubusercontent.com/53379935/145625981-19042a5c-3ce8-4b61-ad2f-a6035ba99762.png)

- Tela Depositar:

  ![TelaDeposito](https://user-images.githubusercontent.com/53379935/145626058-c15d84bf-5f11-4c0c-8202-e4457864533f.png)

- Tela Sacar 

  ![TelaSaca](https://user-images.githubusercontent.com/53379935/145626060-d5b44410-8ec3-4d58-b716-bac1b4add55d.png)

- Tela Trasferir

  ![TelaTransferir](https://user-images.githubusercontent.com/53379935/145626061-9c55a1cb-7e6a-483d-8310-b8f29e50c4a7.png)



### **Banco de dados MySql** :cloud:

![BDCLIENTE](https://user-images.githubusercontent.com/53379935/145626201-1dc6d01e-910c-4b82-b241-85b0a2d6a23b.png)

### **Diagrama Relacional** :chart_with_downwards_trend:

​	...







### **Referências dos ícones**:

- https://www.flaticon.com/br/
- https://icons8.com/icons/ios

### **Outras Referências:**

- https://docs.oracle.com/en/java/javase/11/tools/tools-and-command-reference.html
- https://docs.oracle.com/javase/tutorial/tutorialLearningPaths.html

