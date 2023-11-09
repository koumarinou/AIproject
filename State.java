import java.util.*;

public class State implements Comparable<State>
{
	private int f, h, g;
	private State father;
	private int totalTime;
	private List<Integer> RightList; 
	private List<Integer> LeftList; 
    	private boolean lampOnRight; 
	List<Integer> initialTimes;
    
	
	// constructor
    	public State(List<Integer> initialTimes) { //takes the times and puts them in RightList
        	this.RightList = new ArrayList<>(initialTimes);
        	this.LeftList = new ArrayList<>();
        	this.f = 0;
        	this.h = 0;
        	this.g = 0;
        	this.father = null;
        	this.totalTime = 0;
		this.lampOnRight=true; //true on right and false on left

    	}
	// copy constructor
	public State(State s) {
		this.RightList = new ArrayList<>(s.RightList);
		this.LeftList = new ArrayList<>(s.LeftList);
		this.f = s.f;
		this.h = s.h;
		this.g = s.g;
		this.father = s.father; 
		this.totalTime = s.totalTime;
		this.lampOnRight = s.lampOnRight;
	}
	public int getF() 
	{
		return this.f;
	}
	
	public int getG() 
	{
		return this.g;
	}
	
	public int getH() 
	{
		return this.h;
	}
	
	public State getFather()
	{
		return this.father;
	}
	
	public void setF(int f)
	{
		this.f = f;
	}
	
	public void setG(int g)
	{
		this.g = g;
	}
	
	public void setH(int h)
	{
		this.h = h;
	}
	
	public void setFather(State f)
	{
		this.father = f;
	}
	
	public int getTotalTime() 
	{
		return this.totalTime;
	}
	
	public void setTotalTime(int time)
	{
		this.totalTime = time;
	}
	
	public void evaluate() 
	{
		//calculate f...
	}
	
	public void print() {}
	
	public ArrayList<State> getChildren() {return null;}
	
	public boolean isFinal() {return true;}
	
	@Override
	public boolean equals(Object obj) {return true;}
	
	@Override
    public int hashCode() {return 0;}
	
	@Override
    public int compareTo(State s)
    {
        return Double.compare(this.f, s.getF()); // compare based on the heuristic score.
    }
}