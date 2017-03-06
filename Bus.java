class Bus{
  private String name;
  private Passenger[] passengers;

  public Bus(String name){
  this.name= name;
  this.passengers = new Passenger[87];
}
  public String getName(){
    return this.name;
  }

  public void load (Passenger person){
    int index = this.count_passengers();
    if(index<passengers.length){
    passengers[index] = person;
  }
  }

  public int count_passengers(){
    int count = 0;
    for (Passenger passenger: passengers){
      if(passenger!=null){count++;
      }
    }
  return count;
  }

  public boolean isBusFull(){
    return count_passengers()==passengers.length;
  }







}