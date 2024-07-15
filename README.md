In Order to run the App following things must be commited:

First install MySQL Connector/J latest version platform independent as ZIP file + SQL Workbench and set them up in your coding environment.

Here is a download link for the programs:
https://dev.mysql.com/downloads/connector/j/


![SQL workbench](https://github.com/user-attachments/assets/1ec7bf0b-ac2a-406b-9e0a-58e63fab5ea1)


Create a new Database with name and password, make sure to remebmber your credentials.

For this project, i created a database with the same name as the project.

after creating one, copy the URL of the database and insert it into this code section:


![SQL Connection](https://github.com/user-attachments/assets/7a3a6570-c29b-447d-95a4-226b130dd8a8)

Make sure that everything is correct otherwise you will run into some errors.

Once you set everything up, insert this SQL command in your database:


![SQL Command](https://github.com/user-attachments/assets/f96f6f39-7784-45c6-aeba-8f49d106591a)


After you have done that and having the project code files in your coding environment, you can run any file from the project and the

App should show up in a small window.








Next i will be going into further detail of the Project:

//


//




//








//













In this Project i created a bank app using Java and MySQL.

With Java, i created the UI, the depending functionalities of the app such as transactions, login and register functions,
as well as establishing an connection to the Database.

For the Database i created a small database with MySQL and SQLWorkBench.

The App functions by running any file from given directory, a ui opens up with login fields.

![Screenshot 2024-07-04 074746](https://github.com/gm737/JAVA-Bank-App/assets/174362613/b8bf85f6-af80-4359-9026-dc7e620e6413)

The user also has the option of registering. 

![register](https://github.com/gm737/JAVA-Bank-App/assets/174362613/b8bf85f6-af80-4359-9026-dc7e620e6413)


Username and password have a set of rules where for the username the app checks if the name is available or not
and for the password to be at least 8 characters long including numbers and symbols.

The user also has the option to return to the login, if already registered.

For this demonstration i have created an Account with name of Max Mustermann and an 8 character Password

![rgstr fli](https://github.com/gm737/JAVA-Bank-App/assets/174362613/5aea2e87-fcad-4616-ad66-41627a472dd4)


If the username is not already in use, then a message shows that the account was succesfuly created.

![register succes](https://github.com/gm737/JAVA-Bank-App/assets/174362613/6bdf7009-dde4-47dd-ae20-5b0fabc70654)

If the username is not available, an error message will be displayed.

![register fail](https://github.com/gm737/JAVA-Bank-App/assets/174362613/e2a4f5b9-e252-44e0-b3ac-f892220eb364)


after succesfully logging in, a message appeares confirming the login.


![login success](https://github.com/gm737/JAVA-Bank-App/assets/174362613/1ebd34c2-548c-449a-ad8c-f54b192c4915)


The  main menu displays a greeting message followed by the username and current balance.
The current balance for every user is by default set to zero.

For functionality ther are different Options available, such as depositing, withdrawing, viewing past transactions, transferring and to logout.

![main](https://github.com/gm737/JAVA-Bank-App/assets/174362613/41547740-34f0-4b41-b430-bf14aebee541)



Starting at the top we have the function "deposit" which will deposit the amount of money entered to the user's account.

![deposit ](https://github.com/gm737/JAVA-Bank-App/assets/174362613/b6f15bbc-a07c-4934-b8d4-6e9716ac37bf)


The amount of money has to be of valid input, otherwise an error message will be displayed.

![invalid input](https://github.com/gm737/JAVA-Bank-App/assets/174362613/a8ee69dc-0303-4a23-b3b7-c64329c03754)


If the deposit was succesful, an message conforming the deposit will be displayed and the current balance will be updated.

![deposit succes message](https://github.com/gm737/JAVA-Bank-App/assets/174362613/bd303075-7a10-438a-815d-14af267f60eb)

![deposit updated balance](https://github.com/gm737/JAVA-Bank-App/assets/174362613/0b22173b-de0a-4b1f-8857-b495397890ee)

When no value is entered and the user tries to deposit, an error message appears.

![Deposit empty input](https://github.com/user-attachments/assets/f3b4401a-0f7a-480e-b3a9-4cda3f7f9256)


Next, we have the withdraw function.
The user can withdraw any amount of money as long as it is less than the current balance.

![withdraw](https://github.com/gm737/JAVA-Bank-App/assets/174362613/5c181bc9-21a0-4a20-8d8d-7dd92aeada72)


If the user tries to withdraw more than available, an error message appears.


![withdraw error](https://github.com/gm737/JAVA-Bank-App/assets/174362613/39ef4091-7443-410a-81ab-497bc1dc7576)

Once an correct amount has been drawn, the transaction will be confirmed and the user balance updated.

![withdraw succes](https://github.com/gm737/JAVA-Bank-App/assets/174362613/a3f12b9e-d9ca-407a-9cec-453c4f505bdf)


Next we have the function transfer which allows the user to transfer money to a different bank account.
For this purpose i have created a second account named "Ute Mustermann".

![transfer main](https://github.com/gm737/JAVA-Bank-App/assets/174362613/e69eb02a-ce34-4e61-9572-2a8f756fbdca)

In order to commit any transfers, the user has type in the amount of money and the username which they want to transfer to.

![transfer fill in](https://github.com/gm737/JAVA-Bank-App/assets/174362613/87a010d8-5af2-4615-bbd1-f9fc85c549fa)

Here the app also checks if the amount of money is valid by comparing the transaction to the users current balance.

If the transaction is valid, the app also displays a message approving the transaction and updates the users balance.

![transfer succes](https://github.com/gm737/JAVA-Bank-App/assets/174362613/48d4f60d-9d6f-4bec-8d62-b8d055a9df51)


![transfer updated](https://github.com/gm737/JAVA-Bank-App/assets/174362613/eca13619-5c6f-4838-8521-15ec77a80b55)

Last we have the "Last Transaction" function, displaying every transaction and the date the user has commited, 
being any withdrawls,deposits,etc.

![last transactions ](https://github.com/gm737/JAVA-Bank-App/assets/174362613/9f837ad8-e617-4e6c-a6b6-dcab6c302579)

![last transactions 2 ](https://github.com/gm737/JAVA-Bank-App/assets/174362613/d41ad0f9-ccbd-4ef7-9e80-8d3363f78975)

When the user is done using the app, they can either logout or close the app tab, the user will be logged out automatically.
