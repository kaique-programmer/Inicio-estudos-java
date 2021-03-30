package application;

import model.entities.Comment;
import model.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome");
        Post post1 = new Post(
                simpleDateFormat.parse("10/03/2021 19:57:55"),
                "Traveling to Span",
                "I'm going to view this wonderful country",
                15);
        post1.addComment(comment1);
        post1.addComment(comment2);

        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May the force be with you");
        Post post2 = new Post(
                simpleDateFormat.parse("11/03/2021 08:45:34"),
                "Good night guys!",
                "See you tomorrow",
                13);

        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.println(post1);
        System.out.println(post2);

    }
}
