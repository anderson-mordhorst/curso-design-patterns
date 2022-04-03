package patterns.design.chain.middlewares;

public abstract class Middleware {

    private Middleware next;

    public Middleware link(Middleware next) {
        this.next = next;
        return this;
    }

    protected boolean checkNext(String email, String password) {
        if(next == null) {
            return true;
        }

        return next.check(email, password);
    }

    public abstract boolean check(String email, String password);
}
