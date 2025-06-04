package com.example.blogApplication.payloads;

import java.util.List;

public class postResponse {
    private List<DtoPost> content;
    private int pageNumber;
    private int pageSize;
    private Long totalElement;
    private int totalPages;
    private boolean lastPage;

    public postResponse() {
    }

    public postResponse(List<DtoPost> content, int pageNumber, int pageSize, Long totalElement, int totalPages, boolean lastPage) {
        this.content = content;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalElement = totalElement;
        this.totalPages = totalPages;
        this.lastPage = lastPage;
    }

    public List<DtoPost> getContent() {
        return content;
    }

    public void setContent(List<DtoPost> content) {
        this.content = content;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalElement() {
        return totalElement;
    }

    public void setTotalElement(Long totalElement) {
        this.totalElement = totalElement;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public boolean isLastPage() {
        return lastPage;
    }

    public void setLastPage(boolean lastPage) {
        this.lastPage = lastPage;
    }
}
