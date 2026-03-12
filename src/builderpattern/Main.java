public class Main {

    public static void main(String[] args) {

        User user = new User.Builder()
                .name("Tedy")
                .email("tedy@example.com")
                .password("123456")
                .phone("99999-9999")
                .build();

        System.out.println("Usuário criado: " + user.getName());

    }

}