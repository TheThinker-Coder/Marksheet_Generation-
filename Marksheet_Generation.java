
/** Program For Mark_sheet Generation in java **/

/*Importing class**/
import java.util.Arrays;
import java.util.Scanner;


/*Local Class*/
class Implementation
{
 //scanner Implementation
    Scanner sc = new Scanner(System.in);
 //**End of scanner Implementation**//
//**Varible Implementation**//

    int i,j,k,lo,n;
     int size = 0;
    int ROll_no; // for roll_no
    String Name, M_Name ;//for name
    String Stream;//for stream
    String Result ; // For Display i.e. Pass or Fail
    String emx; // for #
   // int Total_marks = 100; // constant varible
    //int out_of; // constant varible
    int Grand_total = 700;
   // for subject name
     String s1;
     String s2;
     String s3;
     String s4;
     String s5;
     String s6;
     String s7;
     // for marks
    int m1;
    int m2;
    int m3;
    int m4;
    int m5;
    int m6;
    int m7;
    int ss1,ss2,ss3,ss4,ss5,ss6,ss7;
    int total_m1,total_m2,total_m3,total_m4,total_m5,total_m6,total_m7;
    int Total;
    float per;  
    //** Switch Varible **//
        int sw;
    //** Switch Varible End **//
    //**Varible Implementatio End**//

    
     //int total;
/*Function Strating*/
    //Function Input Data
        public  void Input_data()
        {
            System.out.println("Mark_Sheet Generation System");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Enter_Rollno ");
            ROll_no = sc.nextInt();
            System.out.println("Enter Name ");
            Name  = sc.next();
            System.out.println("Enter Stream ");
            Stream  = sc.next();
            System.out.println("----------------------------------------------------------------");
            System.out.println("Enter Subjects Name");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Enter Subject 1 ");
            s1  = sc.next();
            System.out.println("Enter Subject 2 ");
            s2  = sc.next();
            System.out.println("Enter Subject 3 ");
            s3  = sc.next();
            System.out.println("Enter Subject 4 ");
            s4  = sc.next();
            System.out.println("Enter Subject 5");
            s5  = sc.next();
            System.out.println("Enter Subject 6 ");
            s6  = sc.next();
            System.out.println("Enter Subject 7 ");
            s7  = sc.next();
            
            
            System.out.println("----------------------------------------------------------------");
            System.out.println("Enter Subjects Marks");
            System.out.println("----------------------------------------------------------------");
           
              
             System.out.println("Enter Marks For "+ " "+ s1);
             m1 = sc.nextInt();
            System.out.println("Enter Marks For "+ " "+ s2);
            m2 = sc.nextInt();
            System.out.println("Enter Marks For "+ " "+ s3);
            m3 = sc.nextInt();
            System.out.println("Enter Marks For "+ " "+ s4);
            m4 = sc.nextInt();
            System.out.println("Enter Marks For "+ " "+ s5);
            m5 = sc.nextInt();
            System.out.println("Enter Marks For "+ " "+ s6);
            m6 = sc.nextInt();
            System.out.println("Enter Marks For "+ " "+s7);
            m7 = sc.nextInt();
            System.out.println("----------------------------------------------------------------");
            System.out.println("Enter Seesional Marks");
            System.out.println("----------------------------------------------------------------");
               System.out.println("Enter Seesional Marks For "+ " "+ s1);
             ss1 = sc.nextInt();
            System.out.println("Enter Seesional Marks For "+ " "+ s2);
            ss2 = sc.nextInt();
            System.out.println("Enter Seesional  Marks For "+ " "+ s3);
           ss3 = sc.nextInt();
            System.out.println("Enter Seesional Marks For "+ " "+ s4);
           ss4 = sc.nextInt();
            System.out.println("Enter  Seesional Marks For "+ " "+ s5);
            ss5 = sc.nextInt();
            System.out.println("Enter Seesional Marks For "+ " "+ s6);
            ss6 = sc.nextInt();
            System.out.println("Enter Seesional Marks For "+ " "+s7);
            ss7 = sc.nextInt();
           // System.out.println("Enter out of marks "+ Grand_total);
            //Grand_total = sc.nextInt();
            System.out.println("----------------------------------------------------------------");
            Implementation ip = new Implementation();
            //ip.Calculation();
              
              
        }
        /*Function Input_data End*/
            /*Fucnction Calculation*/
        
                public void  Calculation()
                {
                                    // Total calcultion
                 Total = (m1+ss1)+(m2+ss2)+(m3+ss3)+(m4+ss4)+(m5+ss5)+(m6+ss6)+(m7+ss7);
                //System.out.println("total is " + Total);
                total_m1 = m1+ss1;
               // System.out.println("total is " + total_m1);
                total_m2 = m2+ss2;
                total_m3 = m3+ss3;
                total_m4 = m4+ss4;
                total_m5 = m5+ss5;
                total_m6 = m6+ss6;
                total_m7 = m7+ss7;
                per= (Total/Grand_total)*100;
                
                // Condtion to Check wheither pass or fail 
                if(m1<40 ||m2<40 || m3<40 || m4<40 || m5<40 || m6<40)
                    {
                        Result = "Fail";

                    }
                    else
                    {
                        Result = "Pass";
                    }   
               
 
                }
           /*Fucnction Calculation End*/
                
                    /* Function emp cal*/
                
                public  void Exmp()
                {
                     if(m1<40 )
                    {
                        emx = "#";

                        }
                     else if (m2<40)
                             {
                                 emx = "#";
                             }
                     else if (m3<40)
                     {
                     emx ="#";
                     }
                     else if (m4<40)
                     {
                     emx ="#";
                     }
                     else if (m5<40)
                     {
                     emx ="#";
                     }
                     else if (m6<40)
                     {
                     emx ="#";
                     }
                     else if (m7<40)
                     {
                     emx ="#";
                     }
                      else
                     {
                     emx="No emx";
                     }
                    
                        
                }
                
                
                    /* Function emp end cal*/
                        /* Function Menu*/
                            public  void Menu()
                            {
                            System.out.println("----------------------------------------------------------");
                            System.out.println(" "+"Press 1 For Input Data"+" ");
                            System.out.println(" "+"Press 2 For Result Data"+" ");
                            //System.out.println(" "+"Press 3 For Calculation"+" ");
                            
                            System.out.println("----------------------------------------------------------");
                            n = sc.nextInt();
                            switch(n)
                            {
                            case 1:
                            Input_data();  
                             Menu();
                            break;
                            case 2 :
                            Calculation();
                            Show_Result();
                            Menu();
                            break;
       //                     case 3:
         //                       Calculation();
           //                     Menu();
             //                   break;
          
                        
    }
                                    
                                    
                            }
                        /* Function Menu End*/

                                                            /* Function Show_Result*/
                                                                    public void Show_Result()
                                                                    {
                                                                            System.out.println("----------------------------------------------------------");
                                                                            System.out.println(" "+"                King Gorge University             "+" ");
                                                                            System.out.println("----------------------------------------------------------");
                                                                            System.out.println("|"+" "+ "Student Name: "+  "     "+Name+                 "");
                                                                           
                                                                            System.out.print("|"+" "+ "Roll No: "+  "      "+ROll_no +"");
                                                                            
                                                                            System.out.println(""+" "+ "Stream: "+ "  "+Stream +"");
                                                                            System.out.println("----------------------------------------------------------");
                                                                            
                                                                            System.out.print(""+" "+ "Name of Subject: ");
                                                                            System.out.print(""+" "+ "Marks: "          );
                                                                            
                                                                            System.out.print(""+" "+ "SS: "              );
                                                                            System.out.print(""+" "+ "Total Marks: "     );
                                                                            System.out.println("ExEmp: "                 );
                                                                            System.out.println(s1+"                "+m1+"        "+ss1+"         "+total_m1+"        ");
                                                                            System.out.println(s2+"                "+m2+"        "+ss2+"         "+total_m2+"        ");
                                                                            System.out.println(s3+"                "+m3+"        "+ss3+"         "+total_m3+"      ");
                                                                            System.out.println(s4+"                "+m4+"        "+ss4+"         "+total_m4+"       ");
                                                                            System.out.println(s5+"                "+m5+"        "+ss5+"         "+total_m5+"       ");
                                                                            System.out.println(s6+"                "+m6+"        "+ss6+"         "+total_m6+"      ");
                                                                            System.out.println(s7+"                "+m7+"        "+ss7+"         "+total_m7+"      ");
                                                                            System.out.println("----------------------------------------------------------");
                                                                             System.out.println("Total: "+ Total + " " + "Grand Total: " + Grand_total );
                                                                            System.out.println("----------------------------------------------------------");
                                                                            System.out.println("Result: " + Result);

                                                                    }   

                                    /* Function Show_Result End*/
}
        
/*Function Ending*/  

                /*Switch Case Start*/
                                    

                /*Switch Case Ene*/
         

     

   /*Main Class*/
class Marksheet_Generation extends Implementation
{
  public static void main(String[] args) {
    Implementation ip = new Implementation();
        ip.Menu();
       
   } 
    
}