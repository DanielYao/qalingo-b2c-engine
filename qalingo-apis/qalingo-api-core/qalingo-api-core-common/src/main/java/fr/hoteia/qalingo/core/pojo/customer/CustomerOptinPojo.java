package fr.hoteia.qalingo.core.pojo.customer;

import java.util.Date;

public class CustomerOptinPojo {

    private Long id;
    private String type;
    private String origin;
    private Long customerMarketAreaId;
    private Date dateCreate;
    private Date dateUpdate;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(final String origin) {
        this.origin = origin;
    }

    public Long getCustomerMarketAreaId() {
        return customerMarketAreaId;
    }

    public void setCustomerMarketAreaId(final Long customerMarketAreaId) {
        this.customerMarketAreaId = customerMarketAreaId;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(final Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(final Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

}
