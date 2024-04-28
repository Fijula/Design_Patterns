package Design_Patterns.Facade;

public class Client {
    public static void main(String[] args) {
  
        // Create instances of the subsystems
              TicketBookingSystem ticketBookingSystem = new TicketBookingSystem();
              SnackBar snackBar = new SnackBar();
              MoviePlaybackSystem moviePlaybackSystem = new MoviePlaybackSystem();
      
              // Create a facade instance and inject the subsystem instances
              MovieTheaterFacade movieTheaterFacade = new MovieTheaterFacade(ticketBookingSystem, snackBar, moviePlaybackSystem);
      
              // Use the facade to watch a movie
              String movieName = "SpiderMan";
              int numberOfTickets = 2;
              String[] snacks = { "Popcorn", "Juice" };
              
              movieTheaterFacade.watchMovie(movieName, numberOfTickets, snacks);
}
}
