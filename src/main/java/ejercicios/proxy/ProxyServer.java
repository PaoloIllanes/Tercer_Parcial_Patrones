package ejercicios.proxy;

public class ProxyServer implements IServer{
    private Server1 server1;
    private  Server2 server2;

    public ProxyServer(Server1 server1,Server2 server2){

        this.server1= server1;
        this.server2=server2;

    }
    @Override
    public void logUser(Usuario user) {
        System.out.println("Login user...");
        if(isPrime(user.getId())){
            server1.logUser(user);
        }else{
            server2.logUser(user);
        }

        System.out.println("------------------");

    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
