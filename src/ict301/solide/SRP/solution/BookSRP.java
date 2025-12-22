package ict301.solide.SRP.solution;

public class BookSRP {
    private  String title ;
    private String author ;
    private String content ;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public BookSRP(String content, String author, String title) {
        this.content = content;
        this.author = author;
        this.title = title;
    }
}
