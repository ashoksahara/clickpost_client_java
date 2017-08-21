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
 ``` JAVA
 // create OrderCreationObject
 OrderCreationObject orderCreationObject = new OrderCreationObject(<params>)
 // make order creation impl instance 
 OrderCreationServiceImpl orderCreationService = new OrderCreationServiceImpl()
 // call the create order function with username and key provided by clickpost and define prod or test env
 try{
     OrderCreationResponse orderCreationResponse = orderCreationService.createOrderOnClickPost(orderCreationObject,userName,key,<ClickPostConfig.TEST/ClickPostConfig.PROD>)
    
     } catch (ClickPostServerException e) {
         e.printStackTrace();
     }catch(OrderCreationException e){
       e.printStackTrace(); 
     }
 ```
 
How do I get set up?
 
 * get the library as jar from link https://drive.google.com/file/d/0B9lRyvrU89MlVnRidElzc1BjSm8/view?usp=sharing
 * import the jar as library in your project
 * You are ready to use, all dependencies are bundled in the jar file

 
 ### Who do I talk to? ###
 
 * Contact at support@clickpost.in
 * Repo owner contact ashok@clickpost.in