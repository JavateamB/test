# Inventory Management System  

## Project Overview  
The **Inventory Management System** is a Java-based console application designed to help users efficiently manage inventory records. This system allows users to add new items, update existing inventory quantities and prices, remove items when they are no longer needed, and view the current list of available inventory. The program is structured to be simple yet scalable, making it a great starting point for a larger program. Since this project is a console-based application, all interactions occur through a text-based menu system, and data is stored in memory during runtime. Future improvements may include file-based storage for persistence, category organization, and user authentication to enhance usability.  
   

## Features  
- Add new items with name, quantity, and price  
- Update existing items  
- Remove items from inventory  
- View current inventory list  
- Console-based interface (no GUI or database)  


## Team Members and Roles  
| Name | Role | Responsibilities |  
|------|------|----------------|  
| Lucas Ramirez | Team Lead | Organizing work, ensuring code quality |  
| Griffin Hayes | Software Engineer | Implementing and coding inventory logic |  
| Marvin Le | Developer | Handling user input and menu system |  
| Matthew Asante | Tester | Debugging and ensuring functionality |  


graph TD;
    A[Main.java] -->|Handles User Input| B[Inventory.java];
    B -->|Manages Inventory| C[Item.java];
    B -->|Performs Operations| D[Add Item];
    B -->|Performs Operations| E[Update Item];
    B -->|Performs Operations| F[Remove Item];
    B -->|Performs Operations| G[View Inventory];

