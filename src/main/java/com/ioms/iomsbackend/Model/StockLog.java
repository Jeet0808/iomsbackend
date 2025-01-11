package com.ioms.iomsbackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;





@Entity
public class StockLog {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
             strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID logId;
    private UUID productId;
    private Integer changeAmount;
    private LocalDateTime changeDate;
    private Enum actionType;
    private String description;

    // constructor
    public StockLog(){}

    public StockLog(UUID logId, UUID productId, Integer changeAmount, LocalDateTime changeDate, Enum actionType, String description) {
        this.logId = logId;
        this.productId = productId;
        this.changeAmount = changeAmount;
        this.changeDate = changeDate;
        this.actionType = actionType;
        this.description = description;
    }

    // getter setters


    public UUID getLogId() {
        return logId;
    }

    public void setLogId(UUID logId) {
        this.logId = logId;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public Integer getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(Integer changeAmount) {
        this.changeAmount = changeAmount;
    }

    public LocalDateTime getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(LocalDateTime changeDate) {
        this.changeDate = changeDate;
    }

    public Enum getActionType() {
        return actionType;
    }

    public void setActionType(Enum actionType) {
        this.actionType = actionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}






//Field Name	Type	Description
//logId	UUID	Unique identifier for the stock log entry.
//productId	UUID	Foreign key linking to the Product entity for which the stock change applies.
//changeAmount	Integer	Amount of stock changed (positive for restock, negative for sale).
//changeDate	LocalDateTime	Date and time when the stock change occurred.
//actionType	Enum	Type of stock change (e.g., RESTOCK, SALE, ADJUSTMENT).
//description	String	Additional notes or reasons for the change (optional).