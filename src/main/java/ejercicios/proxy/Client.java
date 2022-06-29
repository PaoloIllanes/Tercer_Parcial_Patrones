package ejercicios.proxy;

public class Client {
    public static void main(String[]args){

        Server2 server2 = new Server2();
        Server1 server1 = new Server1();

        ProxyServer proxyServer = new ProxyServer(server1,server2);

        Usuario user1 = new Usuario("Paolo",3,"213");
        Usuario user2 = new Usuario("Jose",5,"4543");
        Usuario user3 = new Usuario("Paola",7,"656");
        Usuario user4 = new Usuario("Julia",10,"767");
        Usuario user5 = new Usuario("Ester",12,"787");

        proxyServer.logUser(user1);
        proxyServer.logUser(user2);
        proxyServer.logUser(user3);
        proxyServer.logUser(user4);
        proxyServer.logUser(user5);


        server1.showInfo();
        server2.showInfo();

    }
}

