package WEEK6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale.IsoCountryCode;
import java.util.Scanner;
import java.util.stream.Collectors;

//book
 //3
public class TrainMainApp {

  static int availableTickets=3,upper=1,
      lower=1,middle=1,wllimit=0;
 
  static int pid=1;
  static List<passenger> bkdPassengers = new ArrayList<passenger>();
  static List<passenger>  wlPassengers = new ArrayList<passenger>();

private static int wlLimit;
  public static void main(String[] args) {
    System.out.println("Welcome to Train Booking");
    Scanner s = new Scanner(System.in);//get input from user
    String isContinue = "Y";
    while(isContinue.equalsIgnoreCase("Y")) {
        System.out.println("1.Book ticket\n2.Cancel\n3.View\n4.WL Status");  
    
    System.out.println("Enter your choice");
    int choice = s.nextInt();//1,2,3 next int
    
    switch(choice) {  // choice is 
    case 1:
      System.out.println("Enter your name");
      s.nextLine(); //Name ah user kita vagi read panum if nivi means reads the nivi
      String pname = s.nextLine(); //print in next line 
      Berth berth =null;
//      berth → is a variable that will hold the passenger's preferred berth (like "UPPER", "MIDDLE", or "LOWER").
//
//     = null → means: for now, this variable has no value assigned yet. It’s like saying:
//
//      "I’m declaring the berth variable now, but I’ll assign the value later."

    while(true) {  // while loop la en kuduthurkom na nammaloda condition true aagara varaikum
    	// that means Until you give berth in UPPER,LOWER,MIDDLE if you give upper,lower,middle it prints invalid 
    	//ennum comes out of  an loop
        try {
          System.out.println("Enter your Pref berth"+Arrays.toString(Berth.values())); 
          // System.out.println(Berth.values());
      //[LBerth;@7a81197d] so use arrays.tostring

          String prefberth = s.nextLine();
          berth = Berth.valueOf(prefberth);//scanner input ah enum ah vagadhu string ah dhna vagum so 
       //   string ah enum ah convert panrom
          break;
        }catch(Exception e) {
          System.out.println("Invalid enum");
        }
      }
      passenger p= new passenger();
      p.setPid(pid);
      p.setPassengerName(pname);
      p.setPrefberth(berth);    // name preferberth  oru  ah id set
      bookTicket(p);           //adhuku book ticket method create pnrom last ah 150 th line la
      pid++;
      break;
    case 2:
      System.out.println("Enter ur pId");
      int passId = s.nextInt();
      cancelTicket(passId);
      System.out.println("TICKET CANCELLED");
      break;
    case 3:
      System.out.println("Waiting List passengers" +wlPassengers);
      System.out.println("Booked List passengers" +bkdPassengers);
      break;
    case 4:
        System.out.println("Enter your Pid");
        int Wlchecked = s.nextInt();  // Reads the input Pid from the user.

        // Creates a stream from the wlPassengers list.
        // 'stream' means a sequence/flow of elements from the list to perform operations like filtering, mapping, etc.
        List<passenger> isWlpass = wlPassengers.stream()
            .filter(e -> e.getPid() == Wlchecked)  // Filters passengers whose Pid matches the entered value.
            .collect(Collectors.toList());         // Collects the result into a new list.

        if (isWlpass != null && !isWlpass.isEmpty()) {
            // Passenger found in WL list, show their booked and current WL limits.
            System.out.println("Booked WL limit: " + isWlpass.get(0).getBKdwlimit());
            System.out.println("Current WL limit: " + isWlpass.get(0).getCurrentwlLimi());
        } else {
            // Passenger not found: Update all current WL limits using forEach loop.
            // For each passenger in the wlPassengers list, update their current WL limit.
            wlPassengers.forEach(e -> e.setCurrentwlLimit(wlLimit));  //  e is a temporary variable name for each passenger in the list.
            //> means: "do this action for each e".
            //for each purpose :"Go through each waiting list 
          //  passenger and update their current WL limit with the value in wlLimit."

            System.out.println("Your ID is not in WL");
        }

        break;
        default:
      System.out.println("Invalid option");
    }
    System.out.println("Do you want to continue Y/N");
    isContinue = s.next();
  }
  }

  private static void cancelTicket(int passId) {
    List<passenger> isBkdPass = bkdPassengers.stream()
        .filter(e->e.getPid() == passId)
        .collect(Collectors.toList());
    List<passenger> isWlPass = wlPassengers.stream() //stream use panni filter panni adha e variable la store 
    		// by using ->lambada function
        .filter(e->e.getPid() == passId)
        .collect(Collectors.toList());
    if(isBkdPass != null && !isBkdPass.isEmpty()) {
      //there is person in WL
      if(wlLimit>0) {
        System.out.println("There are person is Wl");
        wlPassengers.get(0).setAllocatedberth(isBkdPass.get(0).getAllocatedberth());//yaarvandhu cancel panranglo avagala remove  
        bkdPassengers.removeIf(e->e.getPid() == passId);//remove pannidanum
        bkdPassengers.add(wlPassengers.get(0));
        System.out.println("Your ticket got confirmed "+wlPassengers.get(0).getPassengerName());
        wlPassengers.remove(0);
        wlLimit--;
      }else {
        bkdPassengers.removeIf(e->e.getPid() == passId);
        if(isBkdPass.get(0).getAllocatedberth().equals(Berth.UPPER)) {
          upper++;
        }
        availableTickets++;
      }
    }else if( isWlPass != null && !isWlPass.isEmpty()) {
      System.out.println("Cancelling WL passenger");
      wlPassengers.removeIf(e->e.getPid()==passId);
      wlLimit--;
    }else {
      System.out.println("Invalid passenger");
    }
  }
static void allocateBerth(passenger p) {
    switch(p.getPrefberth()) {  //switch case kulla user kita irundhu vaguna
    case UPPER:
      if (upper>0) {
        p.setAllocatedberth(Berth.UPPER);
        upper--;//upper book pannitu andha upper ah yaarum book panna kooadadhunu upper ah minus pannirom
      }else if(middle>0) {
        p.setAllocatedberth(Berth.MIDDLE);
        middle--;
      }else {
        p.setAllocatedberth(Berth.LOWER);
        lower--;
      }
    break;
    case LOWER:
    case MIDDLE:
      
    }
    bkdPassengers.add(p); // ticket booked means we add he ticket in booked passenger
    availableTickets--;// 3ticket 1 booked so decrease the one ticket
  }
  private static void bookTicket(passenger p) {
    if(availableTickets > 0) {
      allocateBerth(p);
      p.setBkdt(LocalDateTime.now());
      System.out.println("Ticket booked");
    }else if(wlLimit<3) { // if the 3 tickets are full 4th ticket will be added as waiting
      wlPassengers.add(p);
      int bkdWlLimit;
      p.setBkdWlLimit(wlLimit);//waiting list 3 limit 
      wlLimit++; //increase the waiting
      
      System.out.println("Ticket in WL");// waiting list 3 dhan limit exceeds the limit  na regret
    }else {
      System.out.println("regret");
    }
    
  }
}
