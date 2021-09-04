public class empwage20 {
 public static final int IS_PART_TIME=1;
 public static final int IS_FULL_TIME=2;
 public static final int EMP_RATE_PER_HR=20;
 public static final int NUM_OF_WORKING_DAYS=20;
 public static final int MAX_HRS_IN_MONTH=10;

 public static void main(String[] args) {
  int emphrs=0;int totalwage=0;
  int totaldays=0;
  while (totalwage <= MAX_HRS_IN_MONTH && totaldays < NUM_OF_WORKING_DAYS) {
  totaldays++; 
 int empcheck=(int) Math.floor(Math.random() * 10) % 3;
  switch(empcheck) {
   case IS_PART_TIME:
    emphrs=4;
    break;
   case IS_FULL_TIME:
    emphrs=8;
    break;
  default:
    emphrs=0;
     }
 totalwage += emphrs;
 System.out.println("Day#: " + totaldays + " Emp hr: " + emphrs);
}
int totalempwage = totalwage * EMP_RATE_PER_HR;
System.out.println("total emp wage: " + totalempwage);
}
}
 
