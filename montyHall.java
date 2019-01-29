import java.util.Random;
import java.util.Scanner;

public class montyHall 
{
	///Author: Cooper Schlegel
	
	public static void main(String[] args) 
	{
		Random rand =  new Random();
		Scanner keyboard = new Scanner(System.in);
		
		//picking a random door to hide the car
		int car = rand.nextInt(3) + 1;
		//picking a random door for the splayer
		int door = rand.nextInt(3) + 1;
		
		String change;
		System.out.println("Please enter the number of rounds you would like the program to run (between 10 and 10,000): ");
		int numrounds = keyboard.nextInt();
		System.out.println("would you like to switch or stay? (Enter either 'switch' or 'stay'): ");
		change = keyboard.nextLine();
		
		int correct = 0;
		
		for (int count = 0; count == numrounds - 1; count++)
			//car==1 and guess==1
			if (car==1)
			{
				if (door==1)
				{
					if (change.equals("stay"))
					{
						correct = correct + 1;
					}
					
				}
			}
				//car==1 and guess==2
				if (car==1)
				{
					if (door==2)
					{
						if (change.equals("switch"))
						{
							correct = correct +1;
						}
					}
				}
					//car==1 and guess==3
					if (car==1)
					{
						if (door==3)
						{
							if (change.equals("switch"))
							{
								correct = correct + 1;
							}
						}
					}
						
						//car==2 and guess==1
						if (car==2)
						{
							if (door==1)
							{
								if (change.equals("switch"))
								{
									correct = correct + 1;
								}
							}
						}
							//car==2 and guess==2
							if (car==2)
							{
								if (door==2)
								{
									if (change.equals("switch"))
									{
										correct = correct + 1;
									}
								}
							}
								//car==2 and guess==3
								if (car==2)
								{
									if (door==3)
									{
										if (change.equals("switch"))
										{
											correct = correct + 1;
										}
									}
								}
									//car==3 and guess==1
									if (car==3)
									{
										if (door==1)
										{	
											if (change.equals("switch"))
											{
												correct = correct + 1;
											}
										}
									}
										//car==3 and guess==2
										if (car==3)
										{
											if (door==2)
											{
												if (change.equals("switch"))
												{
													correct = correct + 1;
												}
											}
										}
											//car==3 and guess==3
											if (car==3)
											{
												if (door==3)
												{													
													if (change.equals("stay"))
													{
														correct = correct + 1;
													}
												}
											}
											int percentageWon = ((correct/numrounds)*(100));
											System.out.println("Number of rounds won: " + correct);
											System.out.println("Percent of rounds won" + percentageWon);
		
		
	}
}
		
						