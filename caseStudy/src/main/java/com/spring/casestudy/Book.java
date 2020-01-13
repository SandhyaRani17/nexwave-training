package com.spring.casestudy;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Book
{
	@Id
	int bookid;
	String bookname;
	double price;
	String author;
	public Book() {}
	public Book(int bookid, String bookname, double price, String author) 
	{
		this.bookid = bookid;  this.bookname = bookname;
		this.price = price;    this.author = author;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
