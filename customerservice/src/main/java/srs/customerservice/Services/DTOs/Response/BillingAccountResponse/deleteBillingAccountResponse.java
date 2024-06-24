package srs.customerservice.Services.DTOs.Response.BillingAccountResponse;

import java.time.LocalDateTime;
import java.util.Date;

public class deleteBillingAccountResponse {
    private String id;
    private LocalDateTime deletedDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(LocalDateTime deletedDate) {
        this.deletedDate = deletedDate;
    }

    public deleteBillingAccountResponse(String id, LocalDateTime deletedDate) {
        this.id = id;
        this.deletedDate = deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
    }
}
