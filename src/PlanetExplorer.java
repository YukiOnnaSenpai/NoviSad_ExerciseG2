
// Before you commit and push write your student ID and finish time here.
// Finish time: 13:00
// Student ID: IT40/2015

public class PlanetExplorer {
	int x,y,eX, eY, iStr;
	String sides, obstacles;
	String side[] = {"N", "E", "S", "W"};
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
		this.x = x;
		this.y = y;
		eX = 0;
		eY = 0;
		sides = side[0];
		iStr = 0;
		this.obstacles = obstacles;
	}
	
	public String executeCommand(String command) throws PlanetExplorerException{
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		/*if(checkInput(command) == false){
			throw new PlanetExplorerException();
		}*/
		char[] c = command.toCharArray();
		for(int i = 0; i < command.length() ; i++ ){
			
			if(c[i] == 'f'){
				if(iStr == 0){
					eY++;
				}
				else if(iStr == 1){
					eX++;
				}
				else if(iStr == 2){
					eY--;
				}
				else if(iStr == 3){
					eX--;
				}
				check();
				return getCoordinates();
			}
			else if(c[i] == 'b'){
				if(iStr == 0){
					eY -= 1;
				}
				else if(iStr == 1){
					eX -= 1;
				}
				else if(iStr == 2){
					eY += 1;
				}
				else if(iStr == 3){
					eX += 1;
				}
				check();
				return getCoordinates();
				
			}
			else if(c[i] == 'l'){
				iStr -= 1;
				check();
				return getCoordinates();
			}
			else if(c[i] == 'r'){
				iStr++;
				iStr = iStr % 4;
				return getCoordinates();
			}
		}
		
		return null;
	}

	public String getCoordinates() {
		// TODO Auto-generated method stub
		return "("+eX+","+eY+","+side[iStr]+")"+this.obstacles;
	}

	public String getGrid() {
		// TODO Auto-generated method stub
		return "("+x+"x"+y+")";
	}
	public boolean checkInput(String command){
		char[] c = command.toCharArray();
		for(int i = 0; i < command.length() ; i++){
			if(c[i] != 'f' || c[i] != 'b' || c[i] != 'l' || c[i] != 'r'){
				return false;
			}
		}
		return true;
	}
	public void check(){
		if(eX == x || eY == y){
			eX = 0;
			eY = 0;
		}
		else if(eX == -1){
			eX = x-1;
		}
		else if(eY == -1){
			eY = y-1;
		}
		else if(iStr == -1){
			iStr = 3;
		}
		/*for(int i = 0; i < obstacles.length(); i++){
			if(o[i] == ge)
		}*/
		
	}
	public String checkinObst(String obstacles){
		String[] o = obstacles.split(")");
		return "o[]";
	}
}
