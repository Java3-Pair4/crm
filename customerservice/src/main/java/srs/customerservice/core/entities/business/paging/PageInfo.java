package srs.customerservice.core.entities.business.paging;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class PageInfo {
    private int page = 0;
    private int size = 10;

    public PageInfo(int page, int size) {
        this.page = page;
        this.size = size;
    }

    public PageInfo() {
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
