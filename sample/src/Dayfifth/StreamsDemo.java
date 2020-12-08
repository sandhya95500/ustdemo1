package Dayfifth;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamsDemo
{
    public static void show()
    {
//        IntStream.rangeClosed(1,5)
//                .forEach(System.out::println);
//        output:1
//        2
//        3
//        4
//        5
        List<Movie> movies = List.of(new Movie("A",200,Genre.THRILLER),
                                        new Movie("B",100,Genre.ACTION),
                                    new Movie("C",300,Genre.ACTION)
//                                    new Movie("D",400),
//                                     new Movie("E",280),
//                                    new Movie("F",500)
        );
//////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////
//    var result = movies.stream()
//    .collect(Collectors.groupingBy(m->m.getLikes()>200,
//            Collectors.mapping(Movie::getTitle,
//                    Collectors.joining(","))));
//    System.out.println(result);
//    output:{false=A,B, true=C}
///////////////////////////////////////////////////////////////////////////////
//        var result = movies.stream()
//    .collect(Collectors.groupingBy(Movie::getGenre,Collectors.mapping(Movie::getTitle,Collectors.joining(","))));
//    System.out.println(result);
//    output:{THRILLER=A, ACTION=B,C}
/////////////////////////////////////////////////////////////////////////////
//        var result = movies.stream()
//    .collect(Collectors.groupingBy(Movie::getGenre,Collectors.counting()));
//    System.out.println(result);
//    output:{THRILLER=1, ACTION=2}
/////////////////////////////////////////////////////////////////////////////////
//    var result = movies.stream()
//    .collect(Collectors.groupingBy(Movie::getGenre,Collectors.toSet()));
//    System.out.println(result);
//    output:{ACTION=[Dayfifth.Movie@6e8cf4c6, Dayfifth.Movie@12edcd21], THRILLER=[Dayfifth.Movie@34a245ab]}
////////////////////////////////////////////////////////////////////////////////////////////
//    var result = movies.stream()
//.collect(Collectors.groupingBy(Movie::getGenre));
//    System.out.println(result);
//    output:{ACTION=[Dayfifth.Movie@5b6f7412, Dayfifth.Movie@27973e9b], THRILLER=[Dayfifth.Movie@312b1dae]}
/////////////////////////////////////////////////////////////////////////
    var result = movies.stream()
            .filter(m->m.getLikes()>10)
            .map(Movie::getTitle)
            .collect(Collectors.joining(","));
    System.out.println(result);

////////////////////////////////////////////////////////////////////////
//    var result = movies.stream()
//    .filter(m->m.getLikes()>10)
//    .collect(Collectors.summarizingInt(Movie::getLikes));
//    System.out.println(result);
//////////////////////////////////////////////////////////////////////////
//    var result = movies.stream()
//    .filter(m->m.getLikes()>10)
//    .collect(Collectors.toMap(Movie::getTitle, Function.identity()));
//    System.out.println(result);
/////////////////////////////////////////////////////////////////////////////
//    var result = movies.stream()
//    .filter(m->m.getLikes()>10)
//    .collect(Collectors.toMap(Movie::getTitle,Movie::getLikes));
//    System.out.println(result);
///////////////////////////////////////////////////////////////////////////////
//    var result = movies.stream()
//    .filter(m->m.getLikes()>10)
//    .collect(Collectors.toMap(m->m.getTitle(),m->m.getLikes()));
//    System.out.println(result);
//////////////////////////////////////////////////////////////////////////////
//    var result = movies.stream()
//    .filter(m->m.getLikes()>10)
//    .collect(Collectors.toSet());
//    System.out.println(result);
/////////////////////////////////////////////////////////////////////////////
//    var result = movies.stream()
//    .filter(m->m.getLikes()>10)
//    .collect(Collectors.toList());
//    System.out.println(result);
///////////////////////////////////////////////////////////////////////////////////
//    Optional<Integer>  sum = Optional.ofNullable(movies.stream()
//    .map(m -> m.getLikes())
//    .reduce(0,Integer::sum));
//    System.out.println(sum);
////////////////////////////////////////////////////////////////////////////////////
//        Predicate<Movie> isPopular = m->m.getLikes()>100;
//        movies.stream().filter(isPopular).forEach(m->System.out.println(m.getTitle()));
/////////////////////////////////////////////////////////////////////////////////////////////
//        movies.stream()
//                .filter(m->m.getLikes()>10)
//                .peek(m->System.out.println("Filtered: "+m.getTitle()))
//                .map(Movie::getTitle)
//                .peek(t->System.out.println("Mapped: "+t))
//                .forEach(System.out::println);
////////////////////////////////////////////////////////////////////////////////////////////
//        movies.stream()
//                .map(Movie::getLikes)
//                .distinct()
//                .forEach((System.out::println));
////////////////////////////////////////////////////////////////////////////////////////////////
//        movies.stream()
//                .map(Movie::getLikes)
//                .forEach((System.out::println));
//////////////////////////////////////////////////////////////////////////////////////////
//        movies.stream()
//                .map(Movie::getLikes)
//                .forEach(Like->System.out.println(Like));
///////////////////////////////////////////////////////////////////////////////////////////
//        movies.stream()
//                .sorted(Comparator.comparing(Movie::getTitle))
//                .forEach(m->System.out.println(m.getTitle()));
///////////////////////////////////////////////////////////////////////////////////
//        movies.stream()
//                .map(movie->movie.getTitle())
//                .forEach(name->System.out.println(name));
 ///////////////////////////////////////////////////////////////////////////////
//        movies.stream()
//                .filter(m->m.getLikes()>10)
//                .forEach(m->System.out.println(m.getTitle()));
//////////////////////////////////////////////////////////////////////
//movies.stream()
//.takeWhile(m->m.getLikes()<300)
//.forEach(m->System.out.println(m.getTitle()));
////////////////////////////////////////////////////////
//    movies.stream()
//    .dropWhile(m->m.getLikes()<300)
//        .forEach(m->System.out.println(m.getTitle()));
//////////////////////////////////////////////////////////////////////////////////
//    movies.stream()
//            .sorted((a,b)->a.getTitle().compareTo(b.getTitle()))
//            .forEach(m->System.out.println(m.getTitle()));
///////////////////////////////////////////////////////////////////////////////////
//        movies.stream()
//                .sorted(Comparator.comparing(m->m.getTitle()))
//                .forEach(m->System.out.println(m.getTitle()));
//////////////////////////////////////////////////////////////////////////////
//    movies.stream()
//    .sorted(Comparator.comparing(Movie::getTitle).reversed())
//    .forEach(m->System.out.println(m.getTitle()));

///////////////////////////////////////////////////////////////////////////////////
//        var count2 = movies.stream()
//                .filter(movie->movie.getLikes()>10)
//                .count();
    }
}
