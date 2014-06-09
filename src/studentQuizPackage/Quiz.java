package studentQuizPackage;

public class Quiz {
	
	private Object[][] Quizes;
	
	private int index;
	
	public Quiz(int length) {
	    Quizes = new Object[length][5];
	  }
	
	public void put(Object studentName, Object quiz1,Object quiz2,
			Object quiz3,Object quiz4) {
	    if (index >= Quizes.length)
	      throw new ArrayIndexOutOfBoundsException();
	    Quizes[index++] = new Object[] { studentName, quiz1,quiz2,quiz3,quiz4 };
	  }
	
	public String getArray(Object key) {
		String result="";
	    for (int i = 0; i < index; i++)
	      if (key.equals(Quizes[i][0]))
	      {
	    	  if(i>0){
		    	  result+=getValue(i,0)+ "		" +getValue(i,1)+ "	" +getValue(i,2)+ "	"+
		    	  getValue(i,3)+ "	"+getValue(i,4);
	    	  }
	    	  else {
	    		  result+=getValue(i,0)+ "	" +getValue(i,1)+ "	" +getValue(i,2)+ "	"+
	    		    	  getValue(i,3)+ "	"+getValue(i,4);
	    	  }
	      }
	    return result;
	  }
	
	public String getValue(int indexVal,int arrayDim) {  
	       return Quizes[indexVal][arrayDim].toString() ;	    
	  }
	
	public Object get(Object key) {
	    for (int i = 0; i < index; i++)
	      if (key.equals(Quizes[i][0]))
	        return Quizes[i][1] ;
	    throw new RuntimeException("Failed to find key");
	  }
	
	public String toString() {
	    String result = "";
	    for (int i = 0; i < index; i++) {
	    	if(i>0)
	    	{
		      result += Quizes[i][0] + "	 	 " + Quizes[i][1]
		    		  +" 	 " + Quizes[i][2]+" 	 " + Quizes[i][3]+" 	 " + Quizes[i][4];
		      if (i < index - 1)
		        result += "\n";
	    	}
	    	else
	    	{
	    		result += Quizes[i][0] + " 	 " + Quizes[i][1]
	  	    		  +" 	 " + Quizes[i][2]+" 	 " + Quizes[i][3]+" 	 " + Quizes[i][4];
	  	      if (i < index - 1)
	  	        result += "\n";
	    	}
	    }
	    return result;
	  }

	public String CalculateAvg()
	{
		String strAvg="Ave\t\t";		
		int quizTotal=0;
		double quizAvg=0.0;
		
		for(int x=1;x<=4;x++) {
			for(int i=1;i<11;i++){
				quizTotal+= Integer.parseInt(Quizes[i][x].toString());					
			}			
			
			quizAvg=(double)quizTotal/10;
			
			strAvg+=quizAvg+"\t\t";
			
			quizAvg=0.0;
			quizTotal=0;
		}
		
		return strAvg;		
	}
	
	public String CalculateStanding()
	{
		String strStanding="Standing\t";
		
		int quizTotal=0;
		double quizAvg=0.0;
		
		for(int x=1;x<=4;x++) {
			for(int i=1;i<11;i++){
				quizTotal+= Integer.parseInt(Quizes[i][x].toString());					
			}			
			
			quizAvg=(double)quizTotal/10;			
			
			if(quizAvg>=9.0 && quizAvg<=10.0) {
				strStanding+="E\t\t";
			}
			else if(quizAvg>=7.0 && quizAvg<=8.0) {
				strStanding+="G\t\t";
			}
			else if(quizAvg>=5.0 && quizAvg<=6.0) {
				strStanding+="S\t\t";
			}
			else if(quizAvg<5.0) {
				strStanding+="P\t\t";
			}
			else {
				strStanding+="\t\t";
			}
			
			quizAvg=0.0;
			quizTotal=0;
		}
		
		return strStanding;
	}
	
	public String CalculateMin()
	{
		String strMin="Min\t\t";
		
		int min=0;
		int val=0;
		
		for(int x=1;x<=4;x++) {
			for(int i=1;i<11;i++){
				if(i==1)
				{
					min=Integer.parseInt(Quizes[i][x].toString());
				}
				else {
					val=Integer.parseInt(Quizes[i][x].toString());
					if(val<min)
						min=val;
				}
					
			}
			strMin+=min+"\t\t";
		}
		return strMin;
	}
	
	public String CalculateMax()
	{
		String strMax="Max\t\t";
		
		int max=0;
		int val=0;
		
		for(int x=1;x<=4;x++) {
			for(int i=1;i<11;i++){
				if(i==1)
				{
					max=Integer.parseInt(Quizes[i][x].toString());
				}
				else {
					val=Integer.parseInt(Quizes[i][x].toString());
					if(val>max)
						max=val;
				}
					
			}
			strMax+=max+"\t\t";
		}
		return strMax;
	}
}
