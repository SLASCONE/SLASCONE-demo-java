package Model;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.UUID;

public class ConsumptionDto {

    private UUID transaction_id = null;

    private UUID limitation_id = null;

    private BigDecimal remaining = null;

    private BigDecimal limit = null;

    private BigDecimal goodwill = null;

    private Date last_reset_date_utc = null;

    private Date next_reset_date_utc = null;
  
    public ConsumptionDto() {
        super();
    }

    public ConsumptionDto(UUID transaction_id, UUID limitation_id, BigDecimal remaining, BigDecimal limit,
            BigDecimal goodwill, Date last_reset_date_utc, Date next_reset_date_utc) {
        super();
        this.transaction_id = transaction_id;
        this.limitation_id = limitation_id;
        this.remaining = remaining;
        this.limit = limit;
        this.goodwill = goodwill;
        this.last_reset_date_utc = last_reset_date_utc;
        this.next_reset_date_utc = next_reset_date_utc;
    }

    public void setTransaction_id(UUID transaction_id) {
        this.transaction_id = transaction_id;
    }

    public UUID getTransaction_id() {
        return transaction_id;
    }
  
    public UUID getLimitation_id() {
        return limitation_id;
    }

    public void setLimitation_id(UUID limitation_id) {
        this.limitation_id = limitation_id;
    }
  
    public BigDecimal getRemaining() {
        return remaining;
    }

    public void setRemaining(BigDecimal remaining) {
        this.remaining = remaining;
    }
  
    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
  
    public BigDecimal getGoodwill() {
        return goodwill;
    }

    public void setGoodwill(BigDecimal goodwill) {
        this.goodwill = goodwill;
    }
  
    public Date getLast_reset_date_utc() {
        return last_reset_date_utc;
    }

    public void setLast_reset_date_utc(Date last_reset_date_utc) {
        this.last_reset_date_utc = last_reset_date_utc;
    }

    public Date getNext_reset_date_utc() {
        return next_reset_date_utc;
    }

    public void setNext_reset_date_utc(Date next_reset_date_utc) {
        this.next_reset_date_utc = next_reset_date_utc;
    }
  }
