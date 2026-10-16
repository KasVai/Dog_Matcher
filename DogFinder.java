public class DogFinder {
    
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

    String[] userArray = new String[4];  
    int value = 0;

    public void storeSize(String size) {
        userArray[0] = size;
        System.out.println(userArray[0]);
    }

    public void storePersonality(String personality) {
        userArray[1] = personality;
        System.out.println(userArray[1]); 
    }

    public void storeShed(String shed) {
        userArray[2] = shed;
        System.out.println(userArray[2]);
    }

    public void storeMaintenance(String maintainence) {
        userArray[3] = maintainence;
        System.out.println(userArray[3]);
    }

    // Helper method to safely compare arrays and avoid null crashes
    private boolean matchesBreed(String[] breed) {
        int count = 0;
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] != null && userArray[i].equals(breed[i])) {
                count += 1;
            }
        }
        return count == 4;
    }

    public String findGolden() {
        if (value > 0) return null;
        if (matchesBreed(golden)) {
            System.out.println("golden retriever");
            value = 1;
            return "golden retriever";
        }
        return null;
    }

    public String findLab() {
        if (value > 0) return null;
        if (matchesBreed(lab)) {
            System.out.println("labrador");
            value = 2;
            return "labrador";
        }
        return null;
    }

    public String findBulldog() {
        if (value > 0) return null;
        if (matchesBreed(bulldog)) {
            System.out.println("bull dog");
            value = 3;
            return "bull dog";
        }
        return null;
    }

    public String findPoodle() {
        if (value > 0) return null;
        if (matchesBreed(poodle)) {
            System.out.println("poodle");
            value = 4;
            return "poodle";
        }
        return null;
    }

    public String findChicha() {
        if (value > 0) return null;
        if (matchesBreed(chicha)) {
            System.out.println("chihuahua");
            value = 5;
            return "chihuahua";
        }
        return null;
    }

    public String findPitbull() {
        if (value > 0) return null;
        if (matchesBreed(pitbull)) {
            System.out.println("pitbull");
            value = 6;
            return "pitbull";
        }
        return null;
    }
    
    public String findPug() {
        if (value > 0) return null;
        if (matchesBreed(pug)) {
            System.out.println("pug");
            value = 7;
            return "pug";
        }
        return null;
    }

    public String findShiTzu() {
        if (value > 0) return null;
        if (matchesBreed(shiTzu)) {
            System.out.println("shih tzu");
            value = 8;
            return "shih tzu";
        }
        return null;
    }

    public String findSpaniel() {
        if (value > 0) return null;
        if (matchesBreed(spaniel)) {
            System.out.println("spaniel");
            value = 9;
            return "spaniel";
        }
        return null;
    }

    public String findPomerian() {
        if (value > 0) return null;
        if (matchesBreed(pomerian)) {
            System.out.println("pomerian");
            value = 10;
            return "pomerian";
        }
        return null;
    }

    public String findcaneCorso() {
        if (value > 0) return null;
        if (matchesBreed(caneCorso)) {
            System.out.println("cane corso");
            value = 11;
            return "cane corso";
        }
        return null;
    }

    public String matchedDog() {
        switch (value) {
            case 1: return "golden retriever";
            case 2: return "labrador";
            case 3: return "bulldog";
            case 4: return "poodle";
            case 5: return "chihuahua";
            case 6: return "pitbull";
            case 7: return "pug";
            case 8: return "shih tzu";
            case 9: return "spaniel";
            case 10: return "pomerian";
            case 11: return "cane corso";
            default: return "dog does not exist";
        }
    } 
}
