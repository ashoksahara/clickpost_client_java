 ClickPost Java Client:
 This a java client for integrating clickpost in your system for order creation with courier companies,
 real time shipment tracking.
 You can contribute to the repo. Its available as open source.
 

 
 * Quick summary
    1. Integrate Order Creation, Tracking of multiple courier comapanies in your system
    2. We are adding more support in future to this library, You can put your reviews and issue.

 * Version
    1.0.0
 * For more info contact at support@clickpost.in
 
 ### Quickstart
 In order to get API key and choose a region refer to the [documentation](https://www.clickpost.in).
 In order To Create Order follow the simple steps
 You need to create order usign OrderCreationObject instance
 Order Creation Object use 5 fields
 
    1. PickupInfo (Pickup Info Consist all the details required for shipment pickup like pickup address, 
    pickup phone etc)
    2. ShipmentDetail (Shipment Detail consist all the information regarding the shipment like items,
     their dimensions, weight etc etc )
    3. AdditionalInfo (Its an optional object, you can pass null into it. 
    it consist extra information like awbNumber, Delivery Type, Shipping Label need to generated in api or not etc.)
    4. DropInfo (It Consist all the information for shipment drop like where to
     deliver, drop name, drop phone nomber etc)
    5. ReturnInfo (It consist all the information for shipment Return in case shipment gets RTO. 
    like where to return , return name address, phons etc)
    6. GstInfo (It consist all the information regarding the Gst)
    
    Example: 
    OrderCreationObject orderCreationObject = new OrderCreationObject(PickupInfo pickupInfo, ShipmentDetail shipmentDetail, AdditionalInfo additionalInfo, DropInfo dropInfo,
                                                                                                    ReturnInfo returnInfo, GstInfo gstInfo);
    
  Classes Used in Order Creation Object  
  
    1. Addition Info Class (all fileds are optional, you can pass null or you can pass AdditionalInfo As null object)
        a. DeliveryType == For Forward order --> DeliveryType.FORWARD 
                           FOR Reverse Order --> DeliveryType.REVERSE
        b. rvpReason == If the Shipment is reverse pickup than this is reason of Rvp
        c. async == If you want to create asynchronously, than this field would be true otherwise false. In Async order Creation
            You will get notification when order will be created successfully on courier partner.
        d. awbNumber == If courier company assigned you awb number than you can pass awbNumber in this field.
        e. label == If you want shipping label in response than set field as true otherwise false
        g. priority == Priority of shipment delivery like NORMAL, FAST.
        
       Example:
        AdditionalInfo additionalInfo = new  AdditionalInfo(DeliveryType deliveryType, String rvpReason, boolean async, String awbNumber, boolean label,
                                                                  String priority);
     
     2. Drop Info Class (This will consist all the information for shipment delivery)
        a. name == Name whom to deliver the shipment (customer name usually)
        b. phone == Contact number of customer 
        c. address == Address where shipment needs to be delivered
        d. pinCode == pincode of delivery area
        e. city == city of delivery area
        g. state == state of delivery area
        h. country == country of delivery area
        
        Exaple:
        DropInfo dropInfo = new DropInfo(String name, String phone, String address, String pinCode, String city, String state, String country);
        
       
      3. Return Info Class (This information will be used when shipment gets RTO (Return To Origin)) This is an optional object.
        You can pass this as null object. In case of null your pickup Info Will be Return Info
        a. name == name whom to shipment return
        b. phone == contact number
        c. address == address where shipment needs to be returned
        d. pinCode == pincode of area where shipment needs to be returned
        e. city == city of area where shipment needs to be returned
        g. state == state of area where shipment needs to be returned
        h. country == country of area where shipment needs to be returned
        
        Example:
        ReturnInfo returnInfo = new ReturnInfo(String name, String phone, String address, String pinCode, String city, String state, String country);
        
       4. Pickup Info (This class consist of all the information that need to pickup the shipments like address etc)
        a. name == name whom to pickup the shipment
        b. phone == contact number
        c. address == address where shipments need to be picked up (usually warehouse address)
        d. pinCode == pincode of pickup area
        e. city == city of pickup Area
        g. state == state of pickup Area
        h. country == country of pickup Area
        i. email == email address 
        j. tin == tin no of shipment owner (tin no of vendor)
        k. pickupTime == time when you want your shipment to get picked up
        
        Example:
        PickupInfo pickupInfo = new PickupInfo(String name, String phone, String address, String pinCode, String city, String state,
                                                                     String country, String email, String tin, Date pickupTime);
        
       5. Shipment Item Info (This consist all the information for shipment item like price, sku etc)
        a. sku == sku of the item
        b. description == description of the item
        c. quantity == quantity to be shipped of item
        d. price == price of the item
        
        Example:
        ShipmentItemInfo shipmentItemInfo = new ShipmentItemInfo(String sku, String description, int quantity, float price, ShipmentItemAdditionalInfo shipmentItemAdditionalInfo);
        
       6. ShipmentItemAdditionalInfo (This has additional Info of shipment item like dimensions)
        a. weight == weight of the item
        b. breadth == breadth of the item
        c. length == length of the item (item packet)
        d. height == height of the item (item packet)
        
        Example:
        ShipmentItemAdditionalInfo itemAdditonalInfo = new ShipmentItemAdditionalInfo(int weight, int breadth, int length, int height);
        
        
       7. ShipmentDetail (This class Consist all the information of your shipment that needs to be shipped)
        a. ShipmentItemInfo[] == array of ShipmentItemInfo class
        b. length == length of the shipment after packing
        c. height == height of the shipment after packing
        d. breadth == breadth of the shipment after packing
        e. weight == weight of the shipment
        g. orderType == (For Cod order set OrderType.COD, for prepaid OrderType.PREPAID)
        h. codValue == if shipment is cod pass codValue that needs to be collect
        i. referenceNumber == reference number of the shipment or order
        j. invoiceNumber == invoice number
        k. invoiceValue == invoice value of the shipment
        l. invoiceDate == invoice date
        m. courierPartner == courier partner id for which you want to place the order
        
        Example:
        ShipmentDetail shipmentDetail = new ShipmentDetail(ShipmentItemInfo[] shipmentItemInfo, int length, int height, int breadth, float weight,
                                                                                    OrderType orderType, float codValue, String referenceNumber, String invoiceNumber,
                                                                                    float invoiceValue, Date invoiceDate, int courierPartner);
        
       8. GstInfo class (this consist all information regarding Gst, this is an optional field i OrderCreationObject, you can pass it as null)
        a. sellerGstin == seller Gstin
        b. sellerGstinenterpriseGstin == enterprise Gstin
        c. consigneeGstin == consignee Gstin
        d. hsnCode == hsnCode
        e. invoiceReference == invoice Reference
        g. isSellerRegisteredUnderGst == true if seller is registered under gst otherwise false
        h. taxableValue = taxable Value
        i. placeOfSupply == place Of Supply
        j. ewaybillSerialNumber == e-waybill serial Number
        k. sgstAmount == sgst Amount
        l. cgstAmount == cgst Amount
        m. igstAmount == igst Amount
        n. gstTaxBase == gst Tax Base
        o. gstDiscount == gst Discount
        p. sgstTaxRate == sgst Tax Rate
        q. cgstTaxRate == cgst Tax Rate
        r. igstTaxRate == igst Tax Rate
        s. gstTotalTax == gst Total Tax
        
        Example:
        GstInfo gstInfo = new GstInfo(String sellerGstin, String enterpriseGstin, String consigneeGstin, String hsnCode, String invoiceReference,
                                                          Boolean isSellerRegisteredUnderGst, float taxableValue, String placeOfSupply, String ewaybillSerialNumber,
                                                          float sgstAmount, float cgstAmount, float igstAmount, float gstTaxBase, float gstDiscount,
                                                          float sgstTaxRate, float cgstTaxRate, float igstTaxRate, float gstTotalTax);
        
        
 ``` JAVA
 Import Require ClickPost classes 
    //For Order Creation Object
    import com.clickpost.client.service.ordercreation.object.OrderCreationObject;
    
    //For Order Creation Service Impl
    import com.clickpost.client.service.ordercreation.OrderCreationServiceImpl;
    
    //For Additional Info
    import com.clickpost.client.service.ordercreation.object.AdditionalInfo;
    
    //For DeliveryType 
    import com.clickpost.client.service.ordercreation.object.DeliveryType;
    
    //For Drop Info
    import com.clickpost.client.service.ordercreation.object.DropInfo;
    
    //For ClickPostConfig
     import com.clickpost.client.service.ordercreation.object.ClickPostConfig;
     
    // For GstInfo 
     import com.clickpost.client.service.ordercreation.object.GstInfo;
     
    //For Order Type
    import com.clickpost.client.service.ordercreation.object.OrderType;
    
    //For PickupInfo 
    import com.clickpost.client.service.ordercreation.object.PickupInfo;
    
    //For ReturnInfo
    import com.clickpost.client.service.ordercreation.object.ReturnInfo;
    
    //For ShipmentDetail 
    import com.clickpost.client.service.ordercreation.object.ShipmentDetail;
    
    //For ShipmentItemAdditionalInfo
    import com.clickpost.client.service.ordercreation.object.ShipmentItemAdditionalInfo;
    
    //For ShipmentItemInfo
     import com.clickpost.client.service.ordercreation.object.ShipmentItemInfo;
    
    //For OrderCreationResponse
    import com.clickpost.client.service.ordercreation.object.OrderCreationResponse;
     
     // create OrderCreationObject
     OrderCreationObject orderCreationObject = new OrderCreationObject(<params>)
     // make order creation impl instance 
     OrderCreationServiceImpl orderCreationService = new OrderCreationServiceImpl()
     // call the create order function with username and key provided by clickpost and define prod or test env
     try{
         OrderCreationResponse orderCreationResponse = orderCreationService.createOrderOnClickPost(orderCreationObject,userName,key,<ClickPostConfig.TEST/ClickPostConfig.PROD>)
        
         } catch (ClickPostServerException e) {
             e.printStackTrace();
         } catch(OrderCreationException e){
             e.printStackTrace(); 
         }
 ```
 
How do I get set up?
 
 * get the library as jar from link https://drive.google.com/file/d/0B9lRyvrU89MlVnRidElzc1BjSm8/view?usp=sharing
 * import the jar as library in your project

 
 ### Who do I talk to? ###
 
 * Contact at support@clickpost.in
 * Repo owner contact ashok@clickpost.in