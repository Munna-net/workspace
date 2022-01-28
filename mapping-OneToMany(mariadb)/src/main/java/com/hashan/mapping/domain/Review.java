package com.hashan.mapping.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;
    private String reviewTitle;
    private Integer rating;

    @ManyToOne
    @JoinColumn(name = "book_id")

    private Book book;

    public Book getBook() {
        return book;
    }
    
    
    

    public Review(Long reviewId, String reviewTitle, Integer rating, Book book) {
		super();
		this.reviewId = reviewId;
		this.reviewTitle = reviewTitle;
		this.rating = rating;
		this.book = book;
	}




	


	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}




	public void setBook(Book book) {
        this.book = book;
    }

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
