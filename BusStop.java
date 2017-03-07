class BusStop{
private Passenger[] waitingPassengers;

public BusStop(){
  this.waitingPassengers = new Passenger[1000];
  System.out.println(waitingPassengers);  
}

public void joinQueue(Passenger person){
  int index = this.countQueue();
  if (countQueue() < waitingPassengers.length){
    waitingPassengers[index] = person;
  }
}

public int countQueue(){
  int count=0;
  for (Passenger person : waitingPassengers){
    if (person != null) {count++;
    }
  }
 return count;
}

// public void removePassengerFromQueue(){
//   int index=countQueue();
//   if (index > 0) {waitingPassengers[index-1]=null;}
// }

}