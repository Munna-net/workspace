package com.hashan.mapping.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    private String bookName;
    private String author;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "book", fetch = FetchType.LAZY)

    private List<Review> reviews;

    public List<Review> getReviews() {
        return reviews;
    }
    
    

    public Book() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Book(Long bookId, String bookName, String author, List<Review> reviews) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.reviews = reviews;
	}



	public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", reviews=" + reviews
				+ "]";
	}
    
    
}
