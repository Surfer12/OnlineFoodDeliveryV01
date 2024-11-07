# Online Food Delivery System

## Overview
The Online Food Delivery System is a Java-based application designed to facilitate the ordering and delivery of food. It allows customers to place orders, rate drivers, and view their order history. Drivers can accept orders and complete deliveries, while the system manages menu items and payment processing.

## Project Structure
```
OnlineFoodDelivery
├── src
│   └── main
│       └── java
│           └── com
│               └── onlinefooddelivery
│                   ├── Customer.java
│                   ├── Order.java
│                   ├── Driver.java
│                   ├── MenuItem.java
│                   ├── Rating.java
│                   ├── OrderStatus.java
│                   └── Payment.java
└── README.md
```

## Classes
- **Customer**: Represents a customer with attributes such as id, name, address, phone, and email. Methods include placing orders, rating drivers, and retrieving order history.
  
- **Order**: Represents an order with attributes like orderId, customerId, driverId, items, status, totalAmount, and orderTime. Methods include adding/removing items, calculating total, and updating status.

- **Driver**: Represents a delivery driver with attributes such as id, name, vehicle, licenseNumber, currentLocation, and ratings. Methods include accepting orders, completing deliveries, and calculating average ratings.

- **MenuItem**: Represents a menu item with attributes like id, name, description, price, category, and preparationTime. Methods include updating price, checking availability, and getting details.

- **Rating**: Represents a rating given by a customer to a driver with attributes such as id, customerId, driverId, score, comment, and timestamp. Methods include validating ratings and retrieving rating details.

- **OrderStatus**: An enumeration representing the status of an order with values PLACED, ACCEPTED, IN_DELIVERY, and DELIVERED.

- **Payment**: Represents a payment with attributes such as paymentId, orderId, paymentMethod, amount, and paymentTime. Methods include processing and refunding payments.

## Setup and Usage
1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Compile the Java files located in `src/main/java/com/onlinefooddelivery`.
4. Run the application to start using the online food delivery system.

## License
This project is licensed under the MIT License.