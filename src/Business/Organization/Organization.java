/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.DB4OUtil.DB4OUtil;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
      private String realName;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
     public enum Type{
        Admin("Admin Organization"), 
        
        SystemCoordinator("System Coorinator Organization"),
        Doctor("Doctor Organization"), 
        Pathologist("Pathologist Organization"),
        Authorization("Authorization Organization"),
        PlasmaBank("Plasma Bank"),
        CovidCentre("CovidCentre"),
        Government("Government");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

//        static class Authorization {
//
//            public Authorization() {
//            }
//        }
    }
     
        
     public enum PlasmaBankType {
         
        PlasmaBank("Plasma Bank Coordinator Organization");
        private String value;

        private PlasmaBankType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    
    public enum CovidCentreType {
         
        CovidCentre("Covid centre coordinator Organization");
        private String value;

        private CovidCentreType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    
    public enum GovernmentType {
         
        Government("Government Coordinator Organization");
        private String value;

        private GovernmentType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    
    
     public enum AuthorizationType {
         
        Authorization("Authorization Organization");
        private String value;

        private AuthorizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        System.out.println("initialise work queue");
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
     public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }


    @Override
    public String toString() {
        return name;
    }
    
    
}
