
public class User<Type1, Type2> {

    public Type1 id;
    public Type2 card_number;


    public User (Type1 id, Type2 card_number){
        this.id = id;
        this.card_number = card_number;
    }


    // переопределяем метод вывода полей объекта
    @Override
    public String toString(){
        return "\nid = " + id +
               "\ncard_number = " + card_number +
               "\n";
    }
}
