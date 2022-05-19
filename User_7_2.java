
//        #2 Создать дженерик класс User, у которого поля id, card_number могут иметь типы String или int
//

public class User_7_2 {
    public static void main(String[] args) {


            User<?,?> user1 = new User<>(1,"55");
            User<?,?> user2 = new User<>("33","98769876");
            User<?,?> user3 = new User<>(1987689686,509870965);


            System.out.print("\nuser1:" + user1);
            System.out.print("\nuser2:" + user2);
            System.out.print("\nuser3:" + user3);


    }

}
