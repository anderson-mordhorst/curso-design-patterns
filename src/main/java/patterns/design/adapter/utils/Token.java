package patterns.design.adapter.utils;

public class Token {

    private String token;

    public Token() {
        StringBuilder builder = new StringBuilder();
        builder.append("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkRlc2lnb");
        builder.append("iBQYXR0ZXJucyIsImlhdCI6MTUxNjIzOTAyMn0.CmkrgPfS3ZAl_lxTWylc3HK6gNkI9LSKS8yBYErZ5yk");
        this.token = builder.toString();
    }

    public String getToken() {
        return token;
    }
}
