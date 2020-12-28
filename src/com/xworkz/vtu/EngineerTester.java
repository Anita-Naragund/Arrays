package com.xworkz.vtu;
import com.xworkz.vtu.engineer.CSEngineer;
import com.xworkz.vtu.engineer.ECEngineer;
import com.xworkz.vtu.engineer.EEEngineer;
import com.xworkz.vtu.engineer.Engineer;
import com.xworkz.vtu.engineer.ISEngineer;
import com.xworkz.vtu.engineer.ITEngineer;
/**
 * 
 * @author Anita
 *
 */

public class EngineerTester {

	public static void main(String[] args) {
		/**
		 * creating object of Engineer class and retrieving all the variables and methods using reference
		 */
		
        Engineer engineer=new Engineer();
        System.out.println(engineer.USN);
        System.out.println("parent branch"+engineer.getBranch());
        engineer.problemSolving();
        
        /**
         * creating object of CSEngineer class and retrieving all the variables and methods using ref
         */
        
        CSEngineer csEngineer=new CSEngineer();
        System.out.println(csEngineer.USN);
        System.out.println(csEngineer.getBranch());
        System.out.println("parent branch "+csEngineer.getParentBranch());
        csEngineer.problemSolving();
        
        /**
         * creating object of child CSEngineer using parent Engineer
         * By using ref of parent displaying the methods and values of variable
         * problemSolving() method returns the value of child i.e, CSEngineer
         * getBranch returns the branch name of parent
         */
        
        Engineer engg=new CSEngineer();
        engg.problemSolving();
        System.out.println(engg.getBranch());
        
        /**
         * creating object of child ISEngineer using parent Engineer
         * By using ref of parent displaying the methods and values of variable
         * problemSolving() method returns the value of child i.e, ISEngineer
         * getBranch returns the branch name of parent
         */
        
        Engineer isEngg=new ISEngineer();
        isEngg.problemSolving();
        System.out.println(isEngg.getBranch());
        
        /**
         * creating object of ISEngineer class and calling the final method collectInfo
         */
        ISEngineer isEngineer=new ISEngineer();
        isEngineer.Information();
        
        /**
         * creating object of child ITCSEngineer using parent Engineer
         * By using ref of parent displaying the methods and values of variable
         * problemSolving() method returns the value of child i.e, ITCSEngineer
         * getBranch returns the branch name of parent
         */
        
        
        Engineer itengg=new ITEngineer();
        itengg.problemSolving();
        System.out.println(itengg.getBranch());
        
        /**
		 * creating object of ECEngineer class and retrieving all the variables and methods using ref
		 */
        
        
        ECEngineer ece=new ECEngineer();
        ece.problemSolving();
        System.out.println(ece.getParentBranch());
        ece.electricWork();
        
        /**
		 * creating object of EEECEngineer class and retrieving all the variables and methods using ref
		 */
        EEEngineer eeEngg=new EEEngineer();
        eeEngg.problemSolving();
        System.out.println(eeEngg.getBranch());
        System.out.println(eeEngg.getParentBranch());
        eeEngg.electricWork();
        
        ITEngineer itEngineer=new ITEngineer();
        System.out.println(itEngineer.getBranch());
        
	}

}
