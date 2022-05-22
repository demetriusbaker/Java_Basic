package Shop_packet;

public class Product {
    int euro;
    public String product;
    public final static int ten = 10;
    protected String name_product;

    public Product(){
        name_product = "Fish";
    }
}

// стоит заметить: если перед полем не указан public
// то в другом пакете он становится недоступным.
// Так если, он его модификатор доступа
// неявно обозначен как default;