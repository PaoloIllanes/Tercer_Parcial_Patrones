package ejercicios.proxy;


import java.util.ArrayList;

public class Server1 implements IServer{
    private ArrayList<Usuario> users= new ArrayList<>();

    @Override
    public void logUser(Usuario user) {
        users.add(user);
    }
    public void showInfo(){
        System.out.println("Server 1....");
        System.out.println("*********************");
        for (Usuario user:users) {
            user.showInfo();
        }
    }

}
