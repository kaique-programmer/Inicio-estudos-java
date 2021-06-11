package stack.labs;

import stack.Stack;

public class Exer03 {
    public static void main(String[] args) {

        Stack<Book> stack = new Stack<>();

        Book book1 = new Book();
        book1.setAuthor("Kaique Oliveira");
        book1.setBookName("React for dummies");
        book1.setIsbn("123456");
        book1.setYearLaunch(2021);

        Book book2 = new Book();
        book2.setAuthor("Kaique Oliveira");
        book2.setBookName("Spring-boot for dummies");
        book2.setIsbn("1234567");
        book2.setYearLaunch(2022);

        Book book3 = new Book();
        book3.setAuthor("Kaique Oliveira");
        book3.setBookName("Java for dummies");
        book3.setIsbn("12345678");
        book3.setYearLaunch(2023);

        Book book4 = new Book();
        book4.setAuthor("Paulo Cupertino");
        book4.setBookName("Computer Network");
        book4.setIsbn("123456");
        book4.setYearLaunch(2024);

        System.out.println("Stack created, stack is empty? " + stack.isEmpty());

        System.out.println("Stacking books in stack:");

        stack.push(book1);
        stack.push(book2);
        stack.push(book3);
        stack.push(book4);

        System.out.println(stack.length() + " books were stacked");
        System.out.println(stack);

        System.out.println("Stack of books, stack is empty? " + stack.isEmpty());

        System.out.println("Peeking at the top of the stack: " + stack.top());

        System.out.println("Unstacking books from the stack: ");

        while(!stack.isEmpty()) {
            System.out.println("Unstacking book: " + stack.pop());
        }

        System.out.println("All books have been unstacked, empty stack: " + stack.isEmpty());
    }
}
