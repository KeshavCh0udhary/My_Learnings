package com.Question_1;

public class Mobile {

	String[] outdatedModels = {"note4","note5","note6","note7"};
    public static void searchOutdatedModel(String... Model) {

    	try {
    		Mobile NewMobile=new Mobile();
    		
			for(int i=0; i<NewMobile.outdatedModels.length; i++)
				
			for(int j=0; j<Model.length; j++) 
					
			if(NewMobile.outdatedModels[i].equals(Model[j]))
						
			System.out.println(NewMobile.outdatedModels[i]+"_OUTDATED");
			
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

    }

	public static void main(String[] args) {
		
	   Mobile.searchOutdatedModel("TATA","note4","note5","note34");
		
	}

	
}
