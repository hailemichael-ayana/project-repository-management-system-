import java.util.ArrayList;

import java.util.Scanner;



public class Main1 {
    
    public static void main(String[] args) {
        Main1 menu=new Main1();
        menu=menu.mainMenu(menu);
        System.out.println("Good bye"); 
    }
    /**
     * @param menu
     * @return
     */
    private Main1 mainMenu(Main1 menu) {
        Scanner input = new Scanner(System.in);
        int userInput=0;
        
        
        do {
            System.out.println(
            "wellcome to this project repository managment system,please identify yours self:");
            System.out.println("1 user");
            System.out.println("2 repository manager");
            System.out.println("3 quit");
            
            userInput = input.nextInt();
            switch (userInput) {
            case 1:
                return menu.usermenu(menu);
            case 2: 
                return menu.repMan(menu);
            case 3: 
                return menu;
            default:
                System.out.println("wrong input!");
                break;
            }
         while (userInput != 3);
    }
       
        return menu;
    }
   
    private Main1 usermenu(Main1 menu) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\t\tUSER MENU");
        System.out.println("What kind of user are you?");

        int userInput = 0;

        do {
            System.out.println("1 Casual");
            System.out.println("2 Project Developer");
            System.out.println("3 Return to main menu");
            userInput = input.nextInt();

            switch (userInput) {
            case 1: return menu.casualuser(menu);
            case 2: return menu.projdev(menu);
            case 3: return menu.mainMenu(menu);
            default:
                System.out.println("wrong input!");
            }
        } while (userInput != 3);
        return menu;
    }
    private Main1 casualuser(Main1 menu) {
        
        System.out.println("Make sure there are projects registered first");
        System.out.println("you are here to?");
        project p1= new project();
        int userInput = 0;
        Scanner input = new Scanner(System.in);
        
        do {
           
            System.out.println("1 search projects");
            System.out.println("2 rate projects");
            System.out.println("3 report bugs");
            System.out.println("4 report issue");
            System.out.println("5 Return");
            userInput = input.nextInt();

            switch (userInput) {
            case 1: 
                p1.searchproj();
                break;
            case 2:
                p1.projRating();
                break;
            case 3:
                p1.BugReport();
                break;
            case 4: 
                p1.issueReport();
                break;
            case 5: return menu.mainMenu(menu);
                default:
                System.out.println("wrong input!");
                break;
            }
        } while (userInput != 5);
    
    
        return menu;
    }
    private Main1 projdev(Main1 menu) {
        System.out.println("you are here to?");

        int userInput = 0;
        project p2= new project();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1 create projects");
            System.out.println("2 delete projects");
            System.out.println("3 display projects");
            System.out.println("4 Return");
            userInput = input.nextInt();

            switch (userInput) {
            case 1: 
                
                p2.createProject();
                break;
            case 2: 
                p2.DeleteProj();
                break;
            case 3: 
                p2.displayEveryproject();
                break;
            case 4: return menu.mainMenu(menu);
            default:
                System.out.println("wrong input!");
                break;
            }
        } while (userInput != 5);
        return menu;
    }
}


/*interface enterprunerproducts{
    final String nameofproduct=null;
    final String nameofower=null;
    final String ageofowner=null;
    
}
*/
class project {
    private int projectID;
    private String projectName;
    private String scope;
    private float cost;
    private String onlineSupport;
    
    public int awardsWon;
    int num;
    static ArrayList<project> projectList = new ArrayList<project>(0); //array list

    public int getProjectID() {
        return this.projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    public String getScope() {
        return this.scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public float getCost() {
        return this.cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getOnlineSupport() {
        return this.onlineSupport;
    }

    public void setOnlineSupport(String onlineSupport) {
        this.onlineSupport = onlineSupport;
    }
    public int getAwardsWon() {
        return this.awardsWon;
    }

    public void setAwardsWon(int awardsWon) {
        this.awardsWon = awardsWon;
    }

    project() {
                                    //empty constructors
    }

//constructor with datafield
    public project(int projectID, String projectName, String scope, float cost, String onlineSupport, int awardsWon) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.scope = scope;
        this.cost = cost;
        this.onlineSupport = onlineSupport;
        this.awardsWon = awardsWon;
    }
    public project(project P) {
        this.projectID = P.projectID;
        this.projectName = P.projectName;
        this.scope = P.scope;
        this.cost = P.cost;
        this.onlineSupport = P.onlineSupport;
        this.awardsWon = P.awardsWon;
    }
    
    public void display() {
        if(projectList.size()>0){
        System.out.println("Name---------------------------------" + this.projectName);
        System.out.println("ID-----------------------------------" + this.projectID);
        System.out.println("awards Won---------------------------" + this.awardsWon);
        System.out.println("cost---------------------------------" + this.cost);
        System.out.println("online Support-----------------------" +this.onlineSupport);      
    }
    else{
        System.out.println("There are no projects registered yet");
    }
}

    public void displayEveryproject() {
        

        for (int i = 0; i < num; i++) {
            if(projectList.size()>0){
            System.out.println("**********PROJECT" + (i + 1) + "***********");

            System.out.println("Name---------------------------------" + projectList.get(i).projectName);
            System.out.println("ID-----------------------------------" + projectList.get(i).projectID);
            System.out.println("awards Won---------------------------" + projectList.get(i).awardsWon);
            System.out.println("cost---------------------------------" + projectList.get(i).cost);
            System.out.println("online Support-----------------------" + projectList.get(i).onlineSupport);
            }
            else{
                System.out.println("There are no projects registered yet");
            }
        }
    }
    public static void displayProjectat(int i) {
        System.out.println("Name---------------------------------" + projectList.get(i).getProjectName());
        System.out.println("ID-----------------------------------" + projectList.get(i).getProjectID());
        System.out.println("awards Won---------------------------" + projectList.get(i).getAwardsWon());
        System.out.println("cost---------------------------------" + projectList.get(i).getCost());
        System.out.println("online Support-----------------------" + projectList.get(i).getOnlineSupport());

    }
    public void DeleteProj() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of project you want to delete.");
        projectName= input.nextLine();
        for (int i = 0; i < projectList.size(); i++) {
            if (projectList.get(i).getProjectName().equalsIgnoreCase(projectName)) {
                projectList.remove(i);
                System.out.println("Project project deleted sucessfully!");
            } else {
                System.out.println("Project not found!");
            }
        }
    }

    public void createProject() {
        Scanner input = new Scanner(System.in);
        System.out.println("how many projects you want to add");
        num = input.nextInt();
        for (int i = 0; i < num; i++) {
           
            System.out.println("Add project number" + (i + 1));
            System.out.println("please insert the ID of your project");
            projectID = input.nextInt();
            System.out.println("please insert the name of your project");
            projectName = input.next();
            System.out.println("please enter how much it took to finish this project");
            cost = input.nextFloat();
            System.out.println("please insert the scope of your project");
            scope = input.next();
            System.out.println("can the users get online support,if so write the website if not enter none");
            onlineSupport = input.next();
            
            System.out.println("how many awords did this project won?");
            awardsWon = input.nextInt();
            project p1 = new project(projectID, projectName, scope, cost, onlineSupport, awardsWon);
            projectList.add(p1);
        }
        display();
        System.out.println("Project added sucessfully!!");
    }

    public void searchproj() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of project you want.");
        String S_userInput = input.nextLine();
        for(int i=0;i<projectList.size();i++){
        if (projectList.get(i).getProjectName().equalsIgnoreCase(S_userInput) || projectList.get(i).getProjectName().contains(S_userInput)) {
            displayProjectat(i);
        } else {
            System.out.println("Project not found!");
        }
    }
    }

    public String BugReport() {

        Scanner input = new Scanner(System.in);
        System.out.println("please provide us the name of the project you want to help correct the bug?");
        String S_userInput = input.nextLine();
        for(int i=0;i<projectList.size();i++){
            if (projectList.get(i).getProjectName().equalsIgnoreCase(S_userInput) || projectList.get(i).getProjectName().contains(S_userInput)) {
            System.out.println("please discribe the problem you faced?");
            S_userInput = input.nextLine();
            System.out.print("Thank you for your support!!");
            break;
        } else {
            System.out.println(
                    "Their is no project registered with that name please make sure you typed the name correctly.");
        }
    }
        return S_userInput + " " + projectName;
    }

    public String issueReport() {
        String report = "safe";
        Scanner input = new Scanner(System.in);
        System.out.println("please provide us the name of the project you want report");
        String S_userInput = input.nextLine();
        for(int i=0;i<projectList.size();i++){
        if (projectList.get(i).getProjectName().equalsIgnoreCase(S_userInput) || projectList.get(i).getProjectName().contains(S_userInput)) {
            System.out.println("reason of report\n\t1.spam\n\t2.virus\n\t3.junk file\n\t4.other");
            int userInput = input.nextInt();
            System.out.print("Thank you for your reponse!!");

            if (userInput == 1) {
                report = "spam";
            } else if (userInput == 2) {
                report = "virus";
            } else if (userInput == 3) {
                report = "junk";
            } else if (userInput == 4) {
                report = "other";
            } else {
                System.out.println("wrong input!!");
            }

        } else {
            System.out.println(
                    "Their is no project registered with that name please make sure you typed the name correctly.");
        }
    }
        return report + projectName;
    }

    public int projRating() {

        Scanner input = new Scanner(System.in);
        int userInput = 0;
        System.out.println("please provide us the name of the project you want to rate?");
        String S_userInput = input.nextLine();
        for(int i=0;i<projectList.size();i++){
        if (projectList.get(i).getProjectName().equalsIgnoreCase(S_userInput) || projectList.get(i).getProjectName().contains(S_userInput)) {
            displayProjectat(i);
            System.out.println("is this the project? y/n?");
            char responcee= input.next().charAt(0);
            if(responcee=='y'){
            System.out.println("On ascale of 1 to 10 how much did this project deserve?");
            userInput = input.nextInt();
            System.out.print("Thank you for your collaboration!!");
            }
            else if(responcee=='n'){
                System.out.print("no project found other that the one you just watched");
            }
        } else {
            System.out.println(
                    "Their is no project registered with that name please make sure you typed the name correctly.");
        }
    }
        return userInput;
    }

}

class user {

    private int userID;
    public String userName;
    public String typeOfProjectInterestedIn;
    project projectName;
    project projectID;
    project StartingDate;

    public user() {
    }

    public user(int userID, String userName, String typeOfProjectInterestedIn, project projectName, project projectID,
            project StartingDate) {
        this.userID = userID;
        this.userName = userName;
        this.typeOfProjectInterestedIn = typeOfProjectInterestedIn;
        this.projectName = projectName;
        this.projectID = projectID;
        this.StartingDate = StartingDate;
    }

    public int getUserID() {
        return this.userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

}

abstract class casualUser extends user {
   private int casualUserId;
   private String projectOwnersName; 
   private String profession;

    public int getCasualUserId() {
        return this.casualUserId;
    }

    public void setCasualUserId(int casualUserId) {
        this.casualUserId = casualUserId;
    }

    public String getProjectOwnersName() {
        return this.projectOwnersName;
    }

    public void setProjectOwnersName(String projectOwnersName) {
        this.projectOwnersName = projectOwnersName;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}

class projectOwner extends user {
    private int ownersId;
    private String projectOwnersName;                //encapsulation
    private int numberOfProjectsCreated;
    private String profession;

    projectOwner() {           

    }

    projectOwner(int ownersId, String projectOwnersName, int numberOfProjectsCreated, String profession) {
        this.ownersId = ownersId;
        this.projectOwnersName = projectOwnersName;
        this.numberOfProjectsCreated = numberOfProjectsCreated;

        this.profession = profession;
    }

    public int getOwnersId() {
        return this.ownersId;
    }

    

    public void setOwnersId(int ownersId) {
        this.ownersId = ownersId;
    }

    public String getProjectOwnersName() {
        return this.projectOwnersName;
    }

    public void setProjectOwnersName(String projectOwnersName) {
        this.projectOwnersName = projectOwnersName;
    }

    public int getNumberOfProjectsCreated() {
        return this.numberOfProjectsCreated;
    }

    public void setNumberOfProjectsCreated(int numberOfProjectsCreated) {
        this.numberOfProjectsCreated = numberOfProjectsCreated;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public projectOwner ownersId(int ownersId) {
        setOwnersId(ownersId);
        return this;
    }

    public projectOwner projectOwnersName(String projectOwnersName) {
        setProjectOwnersName(projectOwnersName);
        return this;
    }

    public projectOwner numberOfProjectsCreated(int numberOfProjectsCreated) {
        setNumberOfProjectsCreated(numberOfProjectsCreated);
        return this;
    }

    public projectOwner profession(String profession) {
        setProfession(profession);
        return this;
    }

    public int getOwnerId() {
        return ownersId;
    }

    public void setOwnerId(int ID) {
        this.ownersId = ID;
    }
}

class repositoryManager {
    private int managerId;                  //incapsulation
    private String managersName;
    private int numberOfProjectsRegisterd;

    public void reviewIssue() {
        Scanner input = new Scanner(System.in);
        project pp = new project();

        if (pp.issueReport() == "safenull") {
            System.out.println("all the projects are safe");
            System.out.println(pp.issueReport());

            System.out.println("do you want to 1.review the project\n\t\t 2. Delete it");

            int userInput = input.nextInt();
            if (userInput == 1) {
                pp.display();
            } else if (userInput == 2) {
                pp.DeleteProj();
            }
        } else {

        }
    }

    public repositoryManager() {
    }

    public repositoryManager(int managerId, String managersName, int numberOfProjectsRegisterd,
            int usersReviewOnEachProject) {
        this.managerId = managerId;
        this.managersName = managersName;
        this.numberOfProjectsRegisterd = numberOfProjectsRegisterd;
        this.usersReviewOnEachProject = usersReviewOnEachProject;
    }

    public int getManagerId() {             //getter and setter methods
        return this.managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagersName() {
        return this.managersName;
    }

    public void setManagersName(String managersName) {
        this.managersName = managersName;
    }

    public int getNumberOfProjectsRegisterd() {
        return this.numberOfProjectsRegisterd;
    }

    public int getUsersReviewOnEachProject() {
        return this.usersReviewOnEachProject;
    }

    public void managermain() {
        Scanner input = new Scanner(System.in);
        System.out.println("To see project that have been reported to have issues press 1 to exit press 0");
        int userInput = input.nextInt();
        if (userInput == 1)
            reviewIssue();

        else {
            System.exit(0);

        }
    }
}

class engineeringProjects extends project {         // interface
    public String requiredResources;
    public int location;
    public float sizeOfPrototype;
    public String condition;
}

 abstract class researchPaper extends project {
    
    public String titleOfStudy;
    public String areaOfStudy;
    public String educationLevelOfrearcher;
    researchPaper() {

    }

    public researchPaper(String titleOfStudy, String areaOfStudy, String educationLevelOfrearcher) {
        this.titleOfStudy = titleOfStudy;
        this.areaOfStudy = areaOfStudy;
        this.educationLevelOfrearcher = educationLevelOfrearcher;
    }

   
}

abstract class construction implements engineeringProjects {
    public String materialsUsed;

    public construction() {
    }

    public construction(String materialsUsed) {
        this.materialsUsed = materialsUsed;
    }

    public String getMaterialsUsed() {
        return this.materialsUsed;
    }

    public void setMaterialsUsed(String materialsUsed) {
        this.materialsUsed = materialsUsed;
    }
}

class manufacturing implements engineeringProjects {
    private String type;
    public manufacturing() {
    }

    public manufacturing(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class softwareDevelopment implements engineeringProjects {
    private String areaOfStudy;
    private String memoryReq;
    private String proccerReq;
    private String languageUsed;
    private String sourseCode;
    softwareDevelopment() {

    }

    public softwareDevelopment(String areaOfStudy, String memoryReq, String proccerReq, String languageUsed, String sourseCode) {
        this.areaOfStudy = areaOfStudy;
        this.memoryReq = memoryReq;
        this.proccerReq = proccerReq;
        this.languageUsed = languageUsed;
        this.sourseCode = sourseCode;
    }

    public String getAreaOfStudy() {
        return this.areaOfStudy;
    }

    public void setAreaOfStudy(String areaOfStudy) {
        this.areaOfStudy = areaOfStudy;
    }

    public String getMemoryReq() {
        return this.memoryReq;
    }

    public void setMemoryReq(String memoryReq) {
        this.memoryReq = memoryReq;
    }

    public String getProccerReq() {
        return this.proccerReq;
    }

    public void setProccerReq(String proccerReq) {
        this.proccerReq = proccerReq;
    }

    public String getLanguageUsed() {
        return this.languageUsed;
    }

    public void setLanguageUsed(String languageUsed) {
        this.languageUsed = languageUsed;
    }

    public String getSourseCode() {
        return this.sourseCode;
    }

    public void setSourseCode(String sourseCode) {
        this.sourseCode = sourseCode;
    }


    
}
