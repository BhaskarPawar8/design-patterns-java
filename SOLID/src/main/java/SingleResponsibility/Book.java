package SingleResponsibility;

public class Book {
    private String name;
    private String author;
    private  String text;

    Book(String name, String author, String text){
        this.name = name;
        this.author = author;
        this.text = text;
    }

    public void replaceWordsInText(String word, String wordToReplace){
        this.text = text.replace(word,wordToReplace);
    }

    public boolean isWordinText(String word){
        return text.contains(word);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
