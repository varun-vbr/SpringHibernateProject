package com.bookbox.randomizer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;


@Entity
@Table(name="tbl_books",schema="bookbox_test")
public class Book {
	private int id;
	private String title;
	private String author;
	private String publisher;
	private String edition;
	private String imageUrl;
	
	private Image image;
	
	@Id
	@GeneratedValue
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name="author")
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Column(name="publisher")
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Column(name="edition")
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="imageid")
	public Image getImage() {
		return image;	
	}
	public void setImage(Image image) {
		this.image = image;
	} 
	@Column(name="imageurl")
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
