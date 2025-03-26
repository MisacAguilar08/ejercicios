package stream.Objects;

import java.util.List;

public class Book {
    private  String name;
    private String type;
    private List<String> authorNames;
    private  String year;

    public Book(String name, String type, List<String> authorNames, String year) {
        this.name = name;
        this.type = type;
        this.authorNames = authorNames;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getAuthorNames() {
        return authorNames;
    }

    public void setAuthorNames(List<String> authorNames) {
        this.authorNames = authorNames;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", authorNames=" + authorNames +
                ", year='" + year + '\'' +
                '}';
    }
}
