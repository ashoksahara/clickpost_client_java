package com.clickpost.client.service.ordercreation.object;


public class GstInfo {
    private final String sellerGstin;
    private final String enterpriseGstin;
    private final String consigneeGstin;
    private final String hsnCode;
    private final String invoiceReference;
    private final Boolean isSellerRegisteredUnderGst;
    private final float taxableValue;
    private final String placeOfSupply;
    private final String ewaybillSerialNumber;
    private final float sgstAmount;
    private final float cgstAmount;
    private final float igstAmount;
    private final float gstTaxBase;
    private final float gstDiscount;
    private final float sgstTaxRate;
    private final float cgstTaxRate;
    private final float igstTaxRate;
    private final float gstTotalTax;

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

    public float getTaxableValue() {
        return taxableValue;
    }

    public String getPlaceOfSupply() {
        return placeOfSupply;
    }

    public String getEwaybillSerialNumber() {
        return ewaybillSerialNumber;
    }

    public float getSgstAmount() {
        return sgstAmount;
    }

    public float getCgstAmount() {
        return cgstAmount;
    }

    public float getIgstAmount() {
        return igstAmount;
    }

    public float getGstTaxBase() {
        return gstTaxBase;
    }

    public float getGstDiscount() {
        return gstDiscount;
    }

    public float getSgstTaxRate() {
        return sgstTaxRate;
    }

    public float getCgstTaxRate() {
        return cgstTaxRate;
    }

    public float getIgstTaxRate() {
        return igstTaxRate;
    }

    public float getGstTotalTax() {
        return gstTotalTax;
    }

    public static class GstInfoBuilder {
        private final String sellerGstin;
        private final String enterpriseGstin;
        private final String consigneeGstin;
        private final String hsnCode;
        private final String invoiceReference;
        private final Boolean isSellerRegisteredUnderGst;
        private final float taxableValue;
        private final String placeOfSupply;
        private final String ewaybillSerialNumber;
        private final float sgstAmount;
        private final float cgstAmount;
        private final float igstAmount;
        private final float gstTaxBase;
        private final float gstDiscount;
        private final float sgstTaxRate;
        private final float cgstTaxRate;
        private final float igstTaxRate;
        private final float gstTotalTax;

        public GstInfoBuilder(String sellerGstin, String enterpriseGstin, String consigneeGstin, String hsnCode, String invoiceReference, Boolean isSellerRegisteredUnderGst, float taxableValue, String placeOfSupply, String ewaybillSerialNumber, float sgstAmount, float cgstAmount, float igstAmount, float gstTaxBase, float gstDiscount, float sgstTaxRate, float cgstTaxRate, float igstTaxRate, float gstTotalTax) {
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
