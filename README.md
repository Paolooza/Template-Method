# Template-Method

A ideia do projeto era fazer uma classe abstrata que herdava em outras classes seus metodos (Template Method).

Baseado cenario de Harry Potter foi criadas as classe: Hogwarts que tinha os metodos: magia() , lufalufa(), grifinoria(), sonserina(), corvinal().

O metodo magia recebia como parametros o objeto tipo String "feitiço". 

E todos outros metodos retornava para ele mesmo.

Foi criado mais quatro classes(com os herdeiros legitimos dos criadores de cada casa): Lazarus, Grisha, Riddle e Wiglaf.

Onde cada uma herdava seus respectivos métodos da classe de Hogwarts.

Métodos:

Lazarus: magia(), lufalufa()
Grisha: magia(), grifinoria()
Riddle: magia(), sonserina()
Wiglaf: magia(), corvinal()

Todos as classes herdeiras tinham um teste JUnit com Assert.assertEquals equiparando seus resultados esperados e obtidos.



