package com.demo.hibernate.question17;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "book4")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String bookName;
    @ManyToMany(mappedBy = "bookSet")
    private Set<Author> authorSet=new HashSet<Author>();

    public String getBookName() {
        return bookName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Author> getAuthorSet() {
        return authorSet;
    }

    public void setAuthorSet(Set<Author> authorSet) {
        this.authorSet = authorSet;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}

