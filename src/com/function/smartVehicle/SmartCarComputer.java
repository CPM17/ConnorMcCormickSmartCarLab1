/**
 * 
 */
package com.function.smartVehicle;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author Connor McCormick
 *I created my primary class as the smart vehicle just like the bicycle I made its components subclasses... hopefuly
 */
public class SmartCarComputer {
	private RasPi computer;
	private drive LeftDrive;
	private drive RightDrive;
	private UltraTrans DistSens;
	
	
	public SmartCarComputer() {
	computer = new RasPi ();
	LeftDrive = new drive ();
	RigtDrive = new drive ();
	
	}
	
	public void SystemCheck () {
		private static class SimpleComponent implements SelfCheckCapable {
			/** name of the component */ String name;
			/**
			 * Simple constructor to create a component
			 * @param name name of the component
			 */
			public SimpleComponent(String name) {
				this.name = name;
			}
			
			@Override
			public boolean selfCheck() {
				// TODO Auto-generated method stub
				return SelfCheckUtils.randomCheck(0.1);
			}
			
			@Override
			public String getComponentName() {
				// TODO Auto-generated method stub
				return name;
			}

			@Override
			public boolean runSelfCheck() {
				// TODO Auto-generated method stub
				return SelfCheckUtils.basicSelfCheckRunner(this);
			}
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
