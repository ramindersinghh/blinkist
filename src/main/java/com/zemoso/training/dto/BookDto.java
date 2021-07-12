package com.zemoso.training.dto;

import com.zemoso.training.entity.Author;
import com.zemoso.training.entity.Category;

public class BookDto {
    private int book_id;
    private String title;

    private String subtitle;
    String language;
    private int total_time_to_read;
    private boolean is_audio_available;
    private boolean is_text_available;
    private String synopsis;

    private Author author_id;
    private Category category;
}
