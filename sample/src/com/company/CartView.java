package com.company;
import java.util.Comparator;
import java.util.List;
public class CartView
{
    List<CartDetails> mobile = List.of
            (
            (new CartDetails("Mobile", "Redmi 9i", 8999, 4.3)),
            (new CartDetails("Mobile", "realme 7pro", 19999, 4.5))

    );

    List<CartDetails> electronics = List.of
            ((new CartDetails("Desktop", "Dell CoreI3", 38690, 4.5)),
            (new CartDetails("Desktop", "HP CoreI3", 40990, 4.4)

            ));

    public void mobile()
    {

        fulldata();
        mobile.stream()

                .forEach(n -> System.out.println(n.getBrand() +", "+ n.getPrice() +", "+ n.getRating()));

        sortByPrice();
        mobile.stream().sorted(Comparator.comparing(m -> m.getPrice()))
                .forEach(b -> System.out.println(b.getPrice() +", "+ b.getBrand()));

        sortByRating();
        mobile.stream().sorted(Comparator.comparing(m -> m.getRating()))
                .forEach(b -> System.out.println(b.getRating() +", "+ b.getBrand()));

    }

    public void electronics(){

        fulldata();
        electronics.stream()
                .forEach(n -> System.out.println(n.getBrand() +", "+ n.getPrice() +", "+ n.getRating()));

        sortByPrice();
        electronics.stream().sorted(Comparator.comparing(m -> m.getPrice()))
                .forEach(b -> System.out.println(b.getPrice() +", "+ b.getBrand()));

        sortByRating();
        electronics.stream().sorted(Comparator.comparing(m -> m.getRating()))
                .forEach(b -> System.out.println(b.getRating() +", "+ b.getBrand()));

    }

    public void fulldata(){
        System.out.println();
        System.out.println("Brand, Price, Rating");
        System.out.println("-----------------------");
    }

    public void sortByPrice(){
        System.out.println();
        System.out.println("Sorted based on Price");
        System.out.println("----------------------");
    }

    public void sortByRating(){
        System.out.println();
        System.out.println("Sorted based on Rating");
        System.out.println("-------------------------");
    }

}
