package com.clickpost.client.service.ordercreation.object;


public class GstInfo {
    private final String sellerGstin;
    private final String enterpriseGstin;
    private final String consigneeGstin;
    private final String hsnCode;
    private final String invoiceReference;
    private final Boolean isSellerRegisteredUnderGst;
    private final Float taxableValue;
    private final String placeOfSupply;
    private final String ewaybillSerialNumber;
    private final Float sgstAmount;
    private final Float cgstAmount;
    private final Float igstAmount;
    private final Float gstTaxBase;
    private final Float gstDiscount;
    private final Float sgstTaxRate;
    private final Float cgstTaxRate;
    private final Float igstTaxRate;
    private final Float gstTotalTax;

    private GstInfo(GstInfoBuilder gstInfoBuilder) {
        this.sellerGstin = gstInfoBuilder.sellerGstin;
        this.enterpriseGstin = gstInfoBuilder.enterpriseGstin;
        this.consigneeGstin = gstInfoBuilder.consigneeGstin;
        this.hsnCode = gstInfoBuilder.hsnCode;
        this.invoiceReference = gstInfoBuilder.invoiceReference;
        this.isSellerRegisteredUnderGst = gstInfoBuilder.isSellerRegisteredUnderGst;
        this.taxableValue = gstInfoBuilder.taxableValue;
        this.placeOfSupply = gstInfoBuilder.placeOfSupply;
        this.ewaybillSerialNumber = gstInfoBuilder.ewaybillSerialNumber;
        this.sgstAmount = gstInfoBuilder.sgstAmount;
        this.cgstAmount = gstInfoBuilder.cgstAmount;
        this.igstAmount = gstInfoBuilder.igstAmount;
        this.gstTaxBase = gstInfoBuilder.gstTaxBase;
        this.gstDiscount = gstInfoBuilder.gstDiscount;
        this.sgstTaxRate = gstInfoBuilder.sgstTaxRate;
        this.cgstTaxRate = gstInfoBuilder.cgstTaxRate;
        this.igstTaxRate = gstInfoBuilder.igstTaxRate;
        this.gstTotalTax = gstInfoBuilder.gstTotalTax;
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

    public static class GstInfoBuilder {
        private final String sellerGstin;
        private final String enterpriseGstin;
        private final String consigneeGstin;
        private final String hsnCode;
        private final String invoiceReference;
        private final Boolean isSellerRegisteredUnderGst;
        private final Float taxableValue;
        private final String placeOfSupply;
        private final String ewaybillSerialNumber;
        private final Float sgstAmount;
        private final Float cgstAmount;
        private final Float igstAmount;
        private final Float gstTaxBase;
        private final Float gstDiscount;
        private final Float sgstTaxRate;
        private final Float cgstTaxRate;
        private final Float igstTaxRate;
        private final Float gstTotalTax;

        public GstInfoBuilder(String sellerGstin, String enterpriseGstin, String consigneeGstin, String hsnCode, String invoiceReference, Boolean isSellerRegisteredUnderGst, Float taxableValue, String placeOfSupply, String ewaybillSerialNumber, Float sgstAmount, Float cgstAmount, Float igstAmount, Float gstTaxBase, Float gstDiscount, Float sgstTaxRate, Float cgstTaxRate, Float igstTaxRate, Float gstTotalTax) {
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

        public GstInfo build() {
            return new GstInfo(this);
        }
    }
}
