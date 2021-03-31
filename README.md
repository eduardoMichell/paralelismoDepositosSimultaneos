# Trabalho de Paralelismo – Sistema Operacional 

- Neste trabalho foi feito dois programas que simulam um depósitos simultâneos em uma conta usando threads, o primeiro programa simulou o depósito sem a proteção da variável saldo e no segundo foi usado o mesmo algoritmo exceto pelo fato de possuir proteção contra escritas simultâneas na variável de saldo.

- O algoritmo foi feito na linguagem de programação Java, usando a classe nativa do próprio, a classe Threads. Foi feito uma classe chamada Paralelismo onde foi definido dois atributos, transações e saldo, e um constante total. A Classe tem uma função que se inicia a Thread e uma outra função estática que faz o cálculo do deposito.

####Testes

- Foi criado uma classe para testar o programa, chamada “ParalelismoTestCase”, essa classe tem um “Main” que instancia dois objetos Paralelismo e inicia a Thread com a função “start()”. O algoritmo executa o calculo de forma correta em certos casos, e algumas vezes o valor do saldo ou transações aparece de forma incorreta.

![](https://github.com/eduardoMichell/paralelismoDepositosSimultaneos/blob/main/images/1.PNG?raw=true)
> Figura 1. Teste com o valor do Saldo errado
                 
 
![](https://github.com/eduardoMichell/paralelismoDepositosSimultaneos/blob/main/images/2.PNG?raw=true)
> Figura 2. Teste com o valor do saldo e transação errados
                

![](https://github.com/eduardoMichell/paralelismoDepositosSimultaneos/blob/main/images/3.PNG?raw=true)
> Figura 3. Teste com todos valores corretos
                
####Solução                
