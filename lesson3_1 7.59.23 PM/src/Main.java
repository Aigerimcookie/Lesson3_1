import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        User user0 = new User(20, "Aigerim1");
        User user1 = new User(21, "Aigerim2");
        User user2 = new User(22, "Aigerim3");
        User user3 = new User(23, "Aigerim4");
        User user4 = new User(24, "Aigerim5");
        User user5 = new User(25, "Aigerim6");
        User user6 = new User(26, "Aigerim7");
        User user7 = new User(27, "Aigerim8");
        User user8 = new User(28, "Aigerim9");
        User user9 = new User(29, "Aigerim10");

        ArrayList<User> users = new ArrayList<>();

        users.add(user0);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);


        for (int i=0; i<users.size(); i++){
            System.out.println(users.get(i));
        }


        ArrayList<Integer> age = new ArrayList<>();

        for (int i = 0; i<users.size(); i++){

            System.out.println(users.get(i));
            age.add(users.get(i).getAge());
        }
        System.out.println(age.toString());

        for(int i = 0; i<age.size();i++){
            System.out.println(age.get(i));
        }


        ArrayList<String>names = new ArrayList<>();
        for(int i = 0; i<users.size(); i++){
            System.out.println(users.get(i));
            names.add(users.get(i).getName());
        }
        System.out.println(names.toString());

        for(int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:"+" ");
        String a = sc.nextLine();

        System.out.println("Enter age"+" ");
        int b = sc.nextInt();

        User user11 = new User(b, a);

        users.add(user11);

        for(int i=0; i<users.size(); i++){
            System.out.println(users.get(i));
        }

    }
}
