package patterns.design.chain.middlewares;

public class CheckPermissionMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if("master@hcode.com.br".equalsIgnoreCase(email)){
            System.out.println("Bem vindo Administrador!");
            return true;
        }

        System.out.println("Bem vindo!");
        return checkNext(email, password);
    }
}
