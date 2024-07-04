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

If the deposit was succesful, an message conforming the deposit will be displayed and the current balance will be updated.

![deposit succes message](https://github.com/gm737/JAVA-Bank-App/assets/174362613/bd303075-7a10-438a-815d-14af267f60eb)

![deposit updated balance](https://github.com/gm737/JAVA-Bank-App/assets/174362613/0b22173b-de0a-4b1f-8857-b495397890ee)




