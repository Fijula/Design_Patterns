package Design_Patterns.Facade;

public class MovieTheaterFacade {
    private TicketBookingSystem ticketBookingSystem;
 private SnackBar snackBar;
 private MoviePlaybackSystem moviePlaybackSystem;

 public MovieTheaterFacade(TicketBookingSystem ticketBookingSystem, SnackBar snackBar,
   MoviePlaybackSystem moviePlaybackSystem) {
  
  this.ticketBookingSystem = ticketBookingSystem;
  this.snackBar = snackBar;
  this.moviePlaybackSystem = moviePlaybackSystem;
  
 }

 // Facade method for booking tickets, ordering snacks, and playing the movie
 public void watchMovie(String movieName, int numberOfTickets, String[] snacks) {
  ticketBookingSystem.bookTicket(movieName, numberOfTickets);
  snackBar.orderSnacks(snacks);
  moviePlaybackSystem.playMovie(movieName);
 }
 

}
