In this Project i created a bank app using Java and MySQL.

With Java, i created the UI, the depending functionalities of the app such as transactions, login and register functions,
as well as establishing an connection to the Database.

For the Database i created a small database with MySQL and SQLWorkBench.

The App functions by running any file from given directory, a ui opens up with login fields.

![Screenshot 2024-07-04 074746](https://github.com/gm737/JAVA-Bank-App/assets/174362613/7fbf7be5-4a71-4363-8a9b-d3edf0133cef)

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


![Screenshot 2024-07-04 100928](https://github.com/gm737/JAVA-Bank-App/assets/174362613/3f494a89-9986-4b61-81bc-11c88395959d)


Starting at the top we have the function "deposit" which will deposit the amount of money entered to the user's account.

![deposit ](https://github.com/gm737/JAVA-Bank-App/assets/174362613/b6f15bbc-a07c-4934-b8d4-6e9716ac37bf)


The amount of money has to be of valid input, otherwise an error message will be displayed.

![invalid input](https://github.com/gm737/JAVA-Bank-App/assets/174362613/a8ee69dc-0303-4a23-b3b7-c64329c03754)


If the deposit was succesful, an message conforming the deposit will be displayed and the current balance will be updated.

![deposit succes message](https://github.com/gm737/JAVA-Bank-App/assets/174362613/bd303075-7a10-438a-815d-14af267f60eb)

![deposit updated balance](https://github.com/gm737/JAVA-Bank-App/assets/174362613/0b22173b-de0a-4b1f-8857-b495397890ee)

When no value is entered and the user tries to deposit, an error message appears.


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



