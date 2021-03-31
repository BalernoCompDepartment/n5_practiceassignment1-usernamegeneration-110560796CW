class Main {
  public static void main(String[] args) {

  //varaibles  
 String [] endings = {"Ing", "end", "axe", "gex", "Goh"};
 int numOfStudent = Keyboard.getInt("Please enter the amount of students");
 
 String ending;
 

//loop
 for(int index = 1; index < numOfStudent + 1; index ++){
 String studentName = Keyboard.getText("Please Enter the first 3 letters of student number " + index + "'s name");
 //loop to collect the names
 while (studentName.length() != 3) {
 Screen.display("the length of the name was invalid please try again", "ERROR");
 studentName = Keyboard.getText("Please enter the first 3 letters of student number " + index + "'s name");
 }
 //adding name and endings together
 ending = endings[N5.randomInt(4)];
 String username = studentName + ending;

 String output = "the username is " + username;

 Screen.display(output, "usernames");
 }
 }
}