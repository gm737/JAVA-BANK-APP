In this Project i created a bank app using Java and MySQL.

With Java, i created the UI, the depending functionalities of the app such as transactions, login and register functions,
as well as establishing an connection to the Database.

For the Database i created a small database made with MySQL and SQLWorkBench.

The App functions by running any file from given directory, a ui opens up with login fields.

![Screenshot 2024-07-04 074746](https://github.com/gm737/JAVA-Bank-App/assets/174362613/7fbf7be5-4a71-4363-8a9b-d3edf0133cef)

The user also has the option of registering. 

![login msg](https://github.com/gm737/JAVA-Bank-App/assets/174362613/462e79a6-59d7-4d3c-8968-c13d86361df4)


Username and password have a set of rules where for the username the app checks if the name is available or not
and for the password to be at least 8 characters long including numbers and symbols.

For this demonstration i have created an Account with name of JWalker and an 8 character Password

![register frm fillin](https://github.com/gm737/JAVA-Bank-App/assets/174362613/4aa1717f-d78b-4165-8605-4d52acddb19d)


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
