package com.clickpost.client.service.ordercreation.object.json;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GstInfoJson {
    @JsonInclude(Include.NON_NULL)
    @JsonProperty("seller_gstin")
    private String sellerGstin;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("enterprise_gstin")
    private String enterpriseGstin;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("consignee_gstin")
    private String consigneeGstin;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("hsn_code")
    private String hsnCode;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("invoice_reference")
    private String invoiceReference;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("is_seller_registered_under_gst")
    private Boolean isSellerRegisteredUnderGst;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("taxable_value")
    private Float taxableValue;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("place_of_supply")
    private String placeOfSupply;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("ewaybill_serial_number")
    private String ewaybillSerialNumber;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("sgst_amount")
    private Float sgstAmount;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("cgst_amount")
    private Float cgstAmount;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("igst_amount")
    private Float igstAmount;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("gst_tax_base")
    private Float gstTaxBase;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("gst_discount")
    private Float gstDiscount;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("sgst_tax_rate")
    private Float sgstTaxRate;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("cgst_tax_rate")
    private Float cgstTaxRate;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("igst_tax_rate")
    private Float igstTaxRate;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("gst_total_tax")
    private Float gstTotalTax;

    public GstInfoJson() {
    }

    public GstInfoJson(String sellerGstin, String enterpriseGstin, String consigneeGstin, String hsnCode, String invoiceReference,
                       Boolean isSellerRegisteredUnderGst, Float taxableValue, String placeOfSupply,
                       String ewaybillSerialNumber, Float sgstAmount, Float cgstAmount, Float igstAmount,
                       Float gstTaxBase, Float gstDiscount, Float sgstTaxRate, Float cgstTaxRate, Float igstTaxRate,
                       Float gstTotalTax) {
        this.sellerGstin = sellerGstin;
        this.enterpriseGstin = enterpriseGstin;
        this.consigneeGstin = consigneeGstin;
        this.hsnCode = hsnCode;
        this.invoiceReference = invoiceReference;
        this.isSellerRegisteredUnderGst = isSellerRegisteredUnderGst;
        this.taxableValue = taxableValue;
        this.placeOfSupply = placeOfSupply;
        this.ewaybillSerialNumber = ewaybillSerialNumber;
        this.sgstAmount = sgstAmount;
        this.cgstAmount = cgstAmount;
        this.igstAmount = igstAmount;
        this.gstTaxBase = gstTaxBase;
        this.gstDiscount = gstDiscount;
        this.sgstTaxRate = sgstTaxRate;
        this.cgstTaxRate = cgstTaxRate;
        this.igstTaxRate = igstTaxRate;
        this.gstTotalTax = gstTotalTax;
    }

    public String getSellerGstin() {
        return sellerGstin;
    }

    public String getEnterpriseGstin() {
        return enterpriseGstin;
    }

    public String getConsigneeGstin() {
        return consigneeGstin;
    }

    public String getHsnCode() {
        return hsnCode;
    }

    public String getInvoiceReference() {
        return invoiceReference;
    }

    public Boolean getSellerRegisteredUnderGst() {
        return isSellerRegisteredUnderGst;
    }

    public Float getTaxableValue() {
        return taxableValue;
    }

    public String getPlaceOfSupply() {
        return placeOfSupply;
    }

    public String getEwaybillSerialNumber() {
        return ewaybillSerialNumber;
    }

    public Float getSgstAmount() {
        return sgstAmount;
    }

    public Float getCgstAmount() {
        return cgstAmount;
    }

    public Float getIgstAmount() {
        return igstAmount;
    }

    public Float getGstTaxBase() {
        return gstTaxBase;
    }

    public Float getGstDiscount() {
        return gstDiscount;
    }

    public Float getSgstTaxRate() {
        return sgstTaxRate;
    }

    public Float getCgstTaxRate() {
        return cgstTaxRate;
    }

    public Float getIgstTaxRate() {
        return igstTaxRate;
    }

    public Float getGstTotalTax() {
        return gstTotalTax;
    }
}
