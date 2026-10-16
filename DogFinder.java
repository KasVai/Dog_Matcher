
public class dogfinder {
    
    

    String golden[] = {"large", "friendly", "sheds", "high maintenance"}; 
    String lab[] = {"large", "friendly", "sheds", "low maintenance"}; 
    String bulldog[] = {"medium", "friendly", "sheds", "low maintenance"}; 
    String poodle[] = {"large", "friendly", "doesn't shed", "high maintenance"}; 
    String chicha[] = {"small", "aggressive", "sheds", "high maintenance"}; 
    String pitbull[] = {"medium", "aggressive", "doesn't shed", "low maintenance"}; 
    String pug[] = {"small", "aggressive", "sheds", "low maintenance"}; 
    String shiTzu[] = {"small", "friendly", "doesn't shed", "low maintenance"}; 
    String spaniel[] = {"medium", "friendly", "doesn't shed", "high maintenance"}; 
    String pomerian[] = {"small", "friendly", "sheds", "low maintenance"}; 
    String caneCorso[] = {"large", "aggressive", "doesn't shed", "low maintenance"}; 

    

    //declare an array 
     String [] userArray = new String[4];  
     int value = 0;
    
     int number  = 5;

    public void storeSize(String size){
        
        userArray[0] = size;
        System.out.println( userArray[0]);
      

    }



    public void storePersonality(String personality){

        userArray[1] = personality;
        System.out.println(userArray[1]); 
       


    }

    public void storeShed(String shed){


        userArray[2] = shed;
        System.out.println(userArray[2]);
   


    }


    public void storeMaintenance(String maintainence){
        
        userArray[3] = maintainence;
        System.out.println(userArray[3]);
        


    }

int count  = 0;
    public String findGolden(){
        for (int i = 0; i<userArray.length; i++){
            if (userArray[i].equals(golden[i])){
                count +=1;

            }
        }
        if (count == 4){
            System.out.println("golden retriever");
            value = 1;
            return "golden retriever";
        }
        return null;
    
    }



    public String findLab(){
        count =0;
        if(value==1){
            return null;
        }

        for (int i = 0; i<userArray.length; i++){
            if (userArray[i].equals(lab[i])){
                count+=1;

            }
        }

        if (count == 4){
            System.out.println("lab");
            value = 2;
            return "labrador";
        }
        return null;

    }


    public String findBulldog(){
        count =0;
        if(value==2 && value==1){
            return null;
        }

        for (int i = 0; i<userArray.length; i++){
            if (userArray[i].equals(bulldog[i])){
                count+=1;


            }
        }

        if (count == 4){
            System.out.println("bull dog");
            value = 3;
            return "bull dog";
        }
        return null;

    }

    public String findPoodle(){
        count =0;
        if(value ==3 && value == 2 && value==1){
            return null;
        }

        for (int i = 0; i<userArray.length; i++){
            if (userArray[i].equals(poodle[i])){
                count+=1;

            }
        }

        if (count == 4){
            System.out.println("poodle");
            value = 4;
            return "poodle";
        }
        return null;

    }

    public String findChicha(){
        count =0;
        if(value ==4 && value ==3 && value == 2 && value==1){
            return null;
        }

        for (int i = 0; i<userArray.length; i++){
            if (userArray[i].equals(chicha[i])){
                count+=1;

            }
        }

        if (count == 4){
            System.out.println("chihuahua");
            value = 5;
            return "chihuahua";
        }
        return null;

    }

    public String findPitbull(){
        count =0;
        if(value ==5 && value == 4 && value ==3 && value == 2 && value==1){
            return null;
        }

        for (int i = 0; i<userArray.length; i++){
            if (userArray[i].equals(pitbull[i])){
                count+=1;

            }
        }

        if (count == 4){
            System.out.println("pitbull");
            value = 6;
            return "pitbull";
        }
        return null;

    }

    
    public String findPug(){
        count =0;
        if(value ==6 && value ==5 && value == 4 && value ==3 && value == 2 && value==1){
            return null;
        }

        for (int i = 0; i<userArray.length; i++){
            if (userArray[i].equals(pug[i])){
                count+=1;

            }
        }

        if (count == 4){
            System.out.println("pug");
            value = 7;
            return "pug";
        }
        return null;

    }



    public String findShiTzu(){
        count =0;
        if(value ==7 && value ==6 && value ==5 && value == 4 && value ==3 && value == 2 && value==1){
            return null;
        }

        for (int i = 0; i<userArray.length; i++){
            if (userArray[i].equals(shiTzu[i])){
                count+=1;

            }
        }

        if (count == 4){
            System.out.println("shih tzu");
            value = 8;
            return "shih tzu";
        }
        return null;

    }

    public String findSpaniel(){
        count =0;
        if(value ==8 && value ==7 && value ==6 && value ==5 && value == 4 && value ==3 && value == 2 && value==1){
            return null;
        }

        for (int i = 0; i<userArray.length; i++){
            if (userArray[i].equals(spaniel[i])){
                count+=1;

            }
        }

        if (count == 4){
            System.out.println("spaniel");
            value = 9;
            return "spaniel";
        }
        return null;

    }


    public String findPomerian(){
        count =0;
        if(value ==9 && value ==8 && value ==7 && value ==6 && value ==5 && value == 4 && value ==3 && value == 2 && value==1){
            return null;
        }

        for (int i = 0; i<userArray.length; i++){
            if (userArray[i].equals(pomerian[i])){
                count+=1;

            }
        }

        if (count == 4){
            System.out.println("pomerian");
            value = 10;
            return "pomerian";
        }
        return null;

    }


    public String findcaneCorso(){
        count =0;
        if(value ==9 && value ==8 && value ==7 && value ==6 && value ==5 && value == 4 && value ==3 && value == 2 && value==1){
            return null;
        }

        for (int i = 0; i<userArray.length; i++){
            if (userArray[i].equals(caneCorso[i])){
                count+=1;

            }
        }

        if (count == 4){
            System.out.println("cane corso");
            value = 11;
            return "cane corso";
        }
        return null;

    }


    public String matchedDog(){

         if (value==1){
            return "golden retriever";
        }

        else if (value==2){
         return "labrador";

        }

        else if (value==3){
           return "bulldog";
        }

        else if (value==4){
            return "poodle";
          }

          else if (value==5){
           return "chihuahua";
          }

          else if (value==6){
             return "pitbull";
          }

          else if (value==7){
               return "pug";
          }

          else if (value==8){
              return "shih Tzu";
           }

           else if (value==9){
              return "spaniel";
          }

          else if (value==10){
            return "pomerian";
           }

           else if (value==11){
               return "cane Corso";
            
                    }

       else{
           return "dog does not exist";
        

       } 
    } //end of matchedDog method 
}

























    