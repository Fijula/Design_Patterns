Real Subject (Bank Account): This represents your actual bank account where your money is stored. It has methods like getBalance() and withdraw(amount).

Proxy (ATM): This acts as the intermediary between you and your bank account. It implements the same interface (or similar functionality) as the bank account but might have additional controls or functionalities.

Workflow:

You (the client) interact with the ATM (the proxy) by inserting your card and entering your PIN.
The ATM (proxy) verifies your identity and PIN (potentially using additional security measures not exposed to you).
If the verification is successful, the ATM (proxy) then communicates with the bank's system (the real subject) to:
Check your account balance using the getBalance() method.
If there are sufficient funds, withdraw the requested amount using the withdraw(amount) method.
The ATM (proxy) dispenses the cash and provides you with a receipt.