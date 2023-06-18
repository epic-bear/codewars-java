package kata.kyu_7;

public class GoingToTheCinema {

  public static void main(String[] args) {
    System.out.println(movie(0, 10, 0.95));
  }

  public static int movie(int card, int ticket, double perc) {
    int count = 0;
    double withTickets = 0;
    double withCard = card;
    double previousTicket = ticket;

    do {
      withTickets += ticket;
      withCard += previousTicket * perc;
      previousTicket = previousTicket * perc;
      count++;
    }
    while ((int) Math.ceil(withCard) >= withTickets);

    return count;
  }
}
