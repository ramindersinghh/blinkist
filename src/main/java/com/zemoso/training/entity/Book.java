package com.zemoso.training.entity;



import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(catalog = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id")
    private int book_id;

    @Column(name="title")
    private String title;

    @Column(name="subtitle")
    private String subtitle;

    @Column(name="language")
    String language;

    @Column(name="total_time_to_read")
    private int total_time_to_read;

    @Column(name="is_audio_available")
    private boolean is_audio_available;

    @Column(name="is_text_available")
    private boolean is_text_available;

    @Column(name="synopsis")
    private String synopsis;

    @Column(name="author_id")
    private Author author_id;

    @Column(name="category")
    private Category category;

    @CreationTimestamp
    private Date timestamp_created;

    @LastModifiedDate
    private Date timestamp_modified;

    @CreatedBy
    private User created_by;


    @LastModifiedBy
    private User changed_by;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getTotal_time_to_read() {
        return total_time_to_read;
    }

    public void setTotal_time_to_read(int total_time_to_read) {
        this.total_time_to_read = total_time_to_read;
    }

    public boolean isIs_audio_available() {
        return is_audio_available;
    }

    public void setIs_audio_available(boolean is_audio_available) {
        this.is_audio_available = is_audio_available;
    }

    public boolean isIs_text_available() {
        return is_text_available;
    }

    public void setIs_text_available(boolean is_text_available) {
        this.is_text_available = is_text_available;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Author getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Author author_id) {
        this.author_id = author_id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    public Date getTimestamp_created() {
        return timestamp_created;
    }

    public void setTimestamp_created(Date timestamp_created) {
        this.timestamp_created = timestamp_created;
    }

    public Date getTimestamp_modified() {
        return timestamp_modified;
    }

    public void setTimestamp_modified(Date timestamp_modified) {
        this.timestamp_modified = timestamp_modified;
    }

    public User getCreated_by() {
        return created_by;
    }

    public void setCreated_by(User created_by) {
        this.created_by = created_by;
    }

    public User getChanged_by() {
        return changed_by;
    }

    public void setChanged_by(User changed_by) {
        this.changed_by = changed_by;
    }
}
