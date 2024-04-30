package Design_Patterns.Mediator;

public interface ChatMediator {
    public void sendMessage(String msg, User user);

    void addUser(User user);
}