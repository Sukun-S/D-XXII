

class EmpWageBuilder{

	public static final int IS_FULL_TIME=1;
   public static final int IS_PART_TIME=2;
   public static final int EMP_RATE_PER_HR=20;
   public static final int NUM_WORKING_DAYS=20;

   public static final int MAX_WORKING_DAYS=100;
   public static final int  MAX_HRS_IN_MONTH=10;



	public static void main( String args[])

	{ int   is_Present=1;
   int   empHrs=0;
   
   int attendence=(int) Math.floor(Math.random()*10)%3;

   if(attendence ==is_Present){
   System.out.println("Present");
   }
   else if(attendence ==2){
   System.out.println("Part-Time");
   }
   else { System.out.println("Absent");
	}

		if(attendence==IS_FULL_TIME)
        {
        empHrs=8;
        }
      int empWage=(empHrs*EMP_RATE_PER_HR);
System.out.println("EmpWage Full-Time "+empWage);
